package com.example.matija.hotelsappmvp;

import android.app.Application;

import com.example.matija.hotelsappmvp.api.backend.ApiModule;

/**
 * Created by Matija on 17.10.2016..
 */

public class App extends Application {

    private AppComponent mComponent;
    private static App mInstance;

    public static App get() {
        return mInstance;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        mInstance = this;
        mComponent = DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .apiModule(new ApiModule())
                .build();
        mComponent.inject(this);
    }

    public AppComponent component(){
        return mComponent;
    }
}
