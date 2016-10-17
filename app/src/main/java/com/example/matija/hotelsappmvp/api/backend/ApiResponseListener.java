package com.example.matija.hotelsappmvp.api.backend;

/**
 * Created by Matija on 17.10.2016..
 */

public interface ApiResponseListener<T> {

    void onResponse(T data);

    void onError(Object apiError);
}
