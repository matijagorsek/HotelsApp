package com.example.matija.hotelsappmvp;

import com.example.matija.hotelsappmvp.api.backend.ApiModule;
import com.example.matija.hotelsappmvp.api.backend.ApiService;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Matija on 17.10.2016..
 */

@Singleton
@Component(modules = {
        AppModule.class,
        ApiModule.class
})

public interface AppComponent {

    void inject(App app);

    ApiService getApiService();
}
