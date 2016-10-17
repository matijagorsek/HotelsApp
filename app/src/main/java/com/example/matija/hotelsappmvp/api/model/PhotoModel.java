package com.example.matija.hotelsappmvp.api.model;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Matija on 17.10.2016..
 */

public class PhotoModel implements Parcelable {

    private int id;
    private String url;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.id);
        dest.writeString(this.url);
    }

    public PhotoModel() {
    }

    protected PhotoModel(Parcel in) {
        this.id = in.readInt();
        this.url = in.readString();
    }

    public static final Parcelable.Creator<PhotoModel> CREATOR = new Parcelable.Creator<PhotoModel>() {
        public PhotoModel createFromParcel(Parcel source) {
            return new PhotoModel(source);
        }

        public PhotoModel[] newArray(int size) {
            return new PhotoModel[size];
        }
    };
}
