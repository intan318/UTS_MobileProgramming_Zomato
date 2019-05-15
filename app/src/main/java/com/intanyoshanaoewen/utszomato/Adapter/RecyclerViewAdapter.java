package com.intanyoshanaoewen.utszomato.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.intanyoshanaoewen.utszomato.Model.Categories;
import com.intanyoshanaoewen.utszomato.R;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>{
    private static final String TAG = "NotesRecyclerAdapter";

    private Context context;
    private List<Categories> lCategories;
    private OnViewClick mOnViewClick;

    public RecyclerViewAdapter(Context context, List<Categories> lCategories, OnViewClick mOnViewClick){
        this.context = context;
        this.lCategories = lCategories;
        this.mOnViewClick = mOnViewClick;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.lists_layout, parent, false);
        return new ViewHolder(view, mOnViewClick);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Categories categories = lCategories.get(position);
        holder.title.setText(categories.getTitle());
        holder.places.setText(categories.getPlaces());
        holder.keterangan.setText(categories.getKeterangan());

        RequestOptions myOptions = new RequestOptions()
                .override(100, 100);

        Glide.with(context)
                .asBitmap()
                .apply(myOptions)
                .load(categories.getImgSource())
                .into(holder.imgSource);
    }

    @Override
    public int getItemCount() {
        return lCategories.size();
    }

    public interface OnViewClick {

        void onViewClick(int position);
    }


    public static class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        TextView title;
        TextView places;
        TextView keterangan;
        ImageView imgSource;
        OnViewClick mOnViewClick;

        ViewHolder(View itemView, OnViewClick onViewClick) {
            super(itemView);
            title = itemView.findViewById(R.id.listKategori);
            places = itemView.findViewById(R.id.listJumlah);
            keterangan = itemView.findViewById(R.id.listKeterangan);
            imgSource = itemView.findViewById(R.id.listImages);
            mOnViewClick = onViewClick;

            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            Log.d(TAG, "onClick: " + getAdapterPosition());
            mOnViewClick.onViewClick(getAdapterPosition());
        }
    }
}
