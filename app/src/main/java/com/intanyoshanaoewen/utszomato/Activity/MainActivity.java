package com.intanyoshanaoewen.utszomato.Activity;

import android.content.Context;
import android.content.Intent;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.intanyoshanaoewen.utszomato.Adapter.RecyclerViewAdapter;
import com.intanyoshanaoewen.utszomato.DataSource;
import com.intanyoshanaoewen.utszomato.Model.Categories;
import com.intanyoshanaoewen.utszomato.R;

import java.util.List;

public class MainActivity extends AppCompatActivity implements RecyclerViewAdapter.OnViewClick {

    private static final String TAG = "MainActivity";
    private RecyclerViewAdapter rViewAdapter;
    private RecyclerView recyclerV;
    private Context context;
    private List<Categories> lCategories;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        context = getApplicationContext();
        initRecycler();
    }

    public void initRecycler() {
        lCategories = DataSource.createListCategories();
        recyclerV = findViewById(R.id.recyclerVIew);
        recyclerV.setHasFixedSize(true);
        recyclerV.setLayoutManager(new LinearLayoutManager(this));
        rViewAdapter = new RecyclerViewAdapter(context, lCategories, this);
        recyclerV.setAdapter(rViewAdapter);
    }

    @Override
    public void onViewClick(int position) {
        Log.d(TAG, "onViewClick: " + position);
        Categories categories = lCategories.get(position);
        Log.d(TAG, "onViewClick: " + categories.getTitle());

        Intent i = new Intent(MainActivity.this, Grid.class);
        i.putExtra("JUDUL_CAT", categories.getTitle());
        i.putExtra("OUTLET_CAT", categories.getPlaces());
        i.putExtra("KETERANGAN_CAT",categories.getKeterangan());
        i.putExtra("URL_CAT",categories.getImgSource());
        startActivity(i);
    }


}
