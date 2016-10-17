package com.example.matija.hotelsappmvp.api.data;

import android.support.annotation.NonNull;

import com.example.matija.hotelsappmvp.api.backend.ApiResponseListener;
import com.example.matija.hotelsappmvp.api.interactor.HotelsInteractor;
import com.example.matija.hotelsappmvp.api.model.HotelsModel;

import java.util.List;

import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by Matija on 17.10.2016..
 */

public class DataManager {

    private HotelsInteractor hotelsInteractor;

    public DataManager(@NonNull HotelsInteractor hotelsInteractor) {
        this.hotelsInteractor = hotelsInteractor;
    }

    public void getHotelsData(@NonNull final ApiResponseListener<List<HotelsModel>> listener) {
        hotelsInteractor.requestHotels()
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<List<HotelsModel>>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {
                        listener.onError(e);

                    }

                    @Override
                    public void onNext(List<HotelsModel> hotelsModels) {
                        listener.onResponse(hotelsModels);
                    }
                });
    }
}
