package com.example.matija.hotelsappmvp.ui.details;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;

import com.example.matija.hotelsappmvp.AppComponent;
import com.example.matija.hotelsappmvp.R;
import com.example.matija.hotelsappmvp.api.model.HotelsModel;
import com.example.matija.hotelsappmvp.ui.base.BaseActivity;

/**
 * Created by Matija on 17.10.2016..
 */

public class HotelDetailsActivity extends BaseActivity {




    @Override
    protected void setupComponent(AppComponent appComponent) {

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details_hotel);

    }
}
