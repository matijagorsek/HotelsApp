package com.example.matija.hotelsappmvp.ui.base;

import android.support.annotation.NonNull;

/**
 * Created by Matija on 17.10.2016..
 */

public interface BaseView {

    void showProgress();

    void hideProgress();

    void showMessage(@NonNull String message);
}
