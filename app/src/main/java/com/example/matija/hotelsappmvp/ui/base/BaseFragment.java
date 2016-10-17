package com.example.matija.hotelsappmvp.ui.base;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.View;

import com.example.matija.hotelsappmvp.App;
import com.example.matija.hotelsappmvp.AppComponent;

/**
 * Created by Matija on 17.10.2016..
 */

public abstract class BaseFragment extends Fragment {

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        setupComponent(App.get().component());
    }

    protected abstract void setupComponent(AppComponent appComponent);

    protected abstract void prepareUi(@NonNull View view);

    protected abstract void prepareData();
}
