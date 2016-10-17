package com.example.matija.hotelsappmvp.api.backend;

import com.example.matija.hotelsappmvp.commons.Constants;
import com.example.matija.hotelsappmvp.api.model.HotelsModel;

import java.util.List;

import retrofit.http.GET;
import rx.Observable;

/**
 * Created by Matija on 17.10.2016..
 */

public interface ApiService {

    @GET(Constants.API_HOTELS_LIST)
    Observable<List<HotelsModel>> requestHotels();


}
