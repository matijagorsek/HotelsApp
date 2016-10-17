package com.example.matija.hotelsappmvp.api.data;

import com.example.matija.hotelsappmvp.AppComponent;
import com.example.matija.hotelsappmvp.ui.home.MainActivity;
import com.example.matija.hotelsappmvp.api.di.ActivityScope;

import dagger.Component;

/**
 * Created by Matija on 17.10.2016..
 */
@ActivityScope
@Component(dependencies = AppComponent.class, modules = HotelModule.class)
public interface HotelComponent {

    void inject(MainActivity hotelsViewModel);

}
