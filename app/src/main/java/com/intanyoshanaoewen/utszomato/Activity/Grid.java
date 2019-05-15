package com.intanyoshanaoewen.utszomato.Activity;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.intanyoshanaoewen.utszomato.Adapter.GridRecyclerAdapter;
import com.intanyoshanaoewen.utszomato.DataSource;
import com.intanyoshanaoewen.utszomato.Model.Restaurants;
import com.intanyoshanaoewen.utszomato.R;

import java.util.List;

public class Grid extends AppCompatActivity implements GridRecyclerAdapter.OnViewClick {

    private static final String TAG = "Grid";
    private ImageView imgCategories;
    private Context context;
    private TextView txtTitle, txtPlaces, txtKeterangan;
    private GridRecyclerAdapter gridAdapter;
    private RecyclerView recyclerV;
    private List<Restaurants> lRestaurants;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid);

        initView();
        initRecycler();
        setData();
    }

    public void initView() {
        context = getApplicationContext();
        imgCategories = findViewById(R.id.imgGrid);
        txtTitle = findViewById(R.id.txtTitle);
        txtPlaces = findViewById(R.id.txtPlacesRes);
        txtKeterangan = findViewById(R.id.txtKeteranganRes);
    }

    public void initRecycler(){
        lRestaurants = DataSource.createRestaurantsList();
        recyclerV = findViewById(R.id.gridRecycler);
        recyclerV.setHasFixedSize(true);
        recyclerV.setLayoutManager(new GridLayoutManager(this, 2));
        gridAdapter = new GridRecyclerAdapter(context, lRestaurants,this);
        recyclerV.setAdapter(gridAdapter);
    }

    public void setData(){
        Intent i = getIntent();
        String title = i.getStringExtra("JUDUL_CAT");
        String places = i.getStringExtra("OUTLET_CAT");
        String keterangan = i.getStringExtra("KETERANGAN_CAT");
        txtTitle.setText(title);
        txtPlaces.setText(places);
        txtKeterangan.setText(keterangan);

        Glide.with(context)
                .asBitmap()
                .load(i.getStringExtra("URL_CAT"))
                .into(imgCategories);
    }

    @Override
    public void onViewClick(int position) {
        Intent i = new Intent(Grid.this, detailRestaurant.class);
        startActivity(i);
    }

}
