package com.example.matija.hotelsappmvp.api.interactor;

import com.example.matija.hotelsappmvp.api.backend.ApiService;
import com.example.matija.hotelsappmvp.api.model.HotelsModel;

import java.util.List;

import rx.Observable;

/**
 * Created by Matija on 17.10.2016..
 */

public class HotelsInteractorImpl implements HotelsInteractor{

    private ApiService apiService;

    public HotelsInteractorImpl(ApiService apiService) {
        this.apiService = apiService;
    }

    public Observable<List<HotelsModel>> requestHotels() {
        return apiService.requestHotels();
    }
}
