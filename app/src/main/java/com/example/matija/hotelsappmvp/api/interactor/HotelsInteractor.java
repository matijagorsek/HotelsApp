package com.example.matija.hotelsappmvp.api.interactor;

import com.example.matija.hotelsappmvp.api.model.HotelsModel;

import java.util.List;

import rx.Observable;

/**
 * Created by Matija on 17.10.2016..
 */

public interface HotelsInteractor {

    Observable<List<HotelsModel>> requestHotels();
}
