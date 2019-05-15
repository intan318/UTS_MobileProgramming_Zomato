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
import com.intanyoshanaoewen.utszomato.Model.Restaurants;
import com.intanyoshanaoewen.utszomato.R;

import java.util.List;

import static android.support.constraint.Constraints.TAG;

public class GridRecyclerAdapter extends RecyclerView.Adapter<GridRecyclerAdapter.ViewHolder> {

    private Context context;
    private List<Restaurants> lRestaurants;
    private OnViewClick mOnViewClick;

    public GridRecyclerAdapter(Context context, List<Restaurants> lRestaurants, OnViewClick mOnViewClic) {
        this.context = context;
        this.lRestaurants = lRestaurants;
        this.mOnViewClick = mOnViewClick;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.grid_layout, parent, false);
        return new ViewHolder(view, mOnViewClick);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Restaurants restaurants = lRestaurants.get(position);
        holder.namaRestaurant.setText(restaurants.getNamaRestaurant());
        holder.lokasiRestaurant.setText(restaurants.getLokasiRestaurant());
        holder.jenisRestaurant.setText(restaurants.getJenisRestaurant());
        holder.rating.setText(restaurants.getRating());

        Glide.with(context)
                .asBitmap()
                .load(restaurants.getImgSource())
                .into(holder.gambar);
    }

    @Override
    public int getItemCount() {
        return lRestaurants.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        TextView namaRestaurant, lokasiRestaurant, jenisRestaurant, rangeHarga, rating;
        ImageView gambar;
        OnViewClick mOnViewClick;

        ViewHolder(View itemView, OnViewClick onViewClick) {
            super(itemView);
            namaRestaurant = itemView.findViewById(R.id.textGridTitle);
            lokasiRestaurant = itemView.findViewById(R.id.textGridLokasi);
            jenisRestaurant = itemView.findViewById(R.id.textGridJenisRestaurant);
            rangeHarga = itemView.findViewById(R.id.textGridRangeHarga);
            rating = itemView.findViewById(R.id.textGridRating);
            gambar = itemView.findViewById(R.id.imgGrid);
            mOnViewClick = onViewClick;

            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            Log.d(TAG, "onClick: " + getAdapterPosition());
            mOnViewClick.onViewClick(getAdapterPosition());
        }
    }

    public interface OnViewClick {
        void onViewClick(int position);
    }

}
