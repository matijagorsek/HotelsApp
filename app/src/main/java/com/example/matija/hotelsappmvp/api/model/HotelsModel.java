package com.example.matija.hotelsappmvp.api.model;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;

/**
 * Created by Matija on 17.10.2016..
 */

public class HotelsModel extends BaseObservable {

    @Bindable
    private String name;

    @Bindable
    private String city;

    @Bindable
    private String zipCode;

    @Bindable
    private String address;

    @Bindable
    private int rating;

    @Bindable
    private String description;

    @Bindable
    private String headerImg;

    @Bindable
    private ArrayList<PhotoModel> images;

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public String getZipCode() {
        return zipCode;
    }

    public String getAddress() {
        return address;
    }

    public int getRating() {
        return rating;
    }

    public String getDescription() {
        return description;
    }

    public String getHeaderImg() {
        return headerImg;
    }

    public ArrayList<PhotoModel> getImages() {
        return images;
    }
}