package com.example.matija.hotelsappmvp.ui.home;

import android.content.Context;
import android.view.View;

import com.example.matija.hotelsappmvp.api.model.HotelsModel;
import com.example.matija.hotelsappmvp.ui.details.HotelDetailsActivity;

/**
 * Created by Matija on 17.10.2016..
 */

public class HotelsListViewModel {

    private Context context;
    private HotelsModel hotelsModel;

    public HotelsListViewModel(Context context, HotelsModel hotelsModel) {
        this.context = context;
        this.hotelsModel = hotelsModel;
    }

    public String getHotelsName() {
        return hotelsModel.getName();
    }

    public String getHotelsCity() {
        return hotelsModel.getCity();
    }

    public String getZipCode() {
        return hotelsModel.getZipCode();
    }

    public String getHotelsAddress() {
        return hotelsModel.getAddress();
    }

    public String getHotelsPhoto() {
        return hotelsModel.getHeaderImg();
    }

    public View.OnClickListener onHotelClick() {
        return new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openHotelDetails();
            }
        };
    }

    private void openHotelDetails() {
    }

}