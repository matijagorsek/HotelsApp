package com.example.matija.hotelsappmvp.ui.home;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.matija.hotelsappmvp.R;
import com.example.matija.hotelsappmvp.api.model.HotelsModel;
import com.example.matija.hotelsappmvp.commons.views.SquareImageView;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Matija on 17.10.2016..
 */

public class HotelsListAdapter extends RecyclerView.Adapter<HotelsListAdapter.ViewHolder> {

    private final List<HotelsModel> mData = new ArrayList<>();
    private Context mContext;
    private LayoutInflater inflater;


    public HotelsListAdapter(Context context) {
        this.mContext = context;
        this.inflater = LayoutInflater.from(context);
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_hotels, null);
        HotelsListAdapter.ViewHolder viewHolder = new HotelsListAdapter.ViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(HotelsListAdapter.ViewHolder holder, int position) {
        final HotelsModel hotelsModels = mData.get(position);
        holder.hotelAddress.setText(hotelsModels.getAddress());
        holder.hotelCity.setText(hotelsModels.getCity());
        holder.hotelTitle.setText(hotelsModels.getName());
        holder.hotelZip.setText(hotelsModels.getZipCode());
        Glide.with(mContext).load(hotelsModels.getHeaderImg()).into(holder.hotelImage);

    }

    public void setData(@NonNull List<HotelsModel> hotelsData) {
        mData.clear();
        mData.addAll(hotelsData);
        notifyDataSetChanged();
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.hotel_preview_image)
        SquareImageView hotelImage;
        @BindView(R.id.hotel_title)
        TextView hotelTitle;
        @BindView(R.id.hotel_address)
        TextView hotelAddress;
        @BindView(R.id.hotel_zip_code)
        TextView hotelZip;
        @BindView(R.id.hotel_city)
        TextView hotelCity;


        public ViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }

    }
}
