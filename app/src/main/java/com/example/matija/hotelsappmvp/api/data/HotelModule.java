package com.example.matija.hotelsappmvp.api.data;

import com.example.matija.hotelsappmvp.App;
import com.example.matija.hotelsappmvp.api.interactor.HotelsInteractor;
import com.example.matija.hotelsappmvp.api.interactor.HotelsInteractorImpl;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Matija on 17.10.2016..
 */

@Module
public class HotelModule {

    @Provides
    public HotelsInteractor providesHotelsInteractor() {
        return new HotelsInteractorImpl(App.get().component().getApiService());
    }

    @Provides
    DataManager hotelModel(HotelsInteractor hotelsInteractor) {
        return new DataManager(hotelsInteractor);
    }
}
