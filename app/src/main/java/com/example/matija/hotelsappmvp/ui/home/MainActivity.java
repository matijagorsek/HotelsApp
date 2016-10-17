package com.example.matija.hotelsappmvp.ui.home;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.widget.Toast;

import com.example.matija.hotelsappmvp.App;
import com.example.matija.hotelsappmvp.AppComponent;
import com.example.matija.hotelsappmvp.R;
import com.example.matija.hotelsappmvp.api.backend.ApiResponseListener;
import com.example.matija.hotelsappmvp.api.data.DaggerHotelComponent;
import com.example.matija.hotelsappmvp.api.data.DataManager;
import com.example.matija.hotelsappmvp.api.data.HotelModule;
import com.example.matija.hotelsappmvp.api.model.HotelsModel;
import com.example.matija.hotelsappmvp.commons.views.HotelsRecyclerView;
import com.example.matija.hotelsappmvp.ui.base.BaseActivity;

import java.util.List;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends BaseActivity implements ApiResponseListener<List<HotelsModel>> {

    @BindView(R.id.adapter_view)
    HotelsRecyclerView recyclerView;

    @Inject
    DataManager mDataManager;

    private HotelsListAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        requestHotels();
        initData();
    }

    @Override
    protected void setupComponent(AppComponent appComponent) {
        DaggerHotelComponent.builder()
                .appComponent(appComponent)
                .hotelModule(new HotelModule())
                .build().inject(this);
    }

    public void initData() {
        mAdapter = new HotelsListAdapter(this);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        recyclerView.setAdapter(mAdapter);
    }

    private void requestHotels() {
        mDataManager.getHotelsData(this);
    }

    @Override
    public void onResponse(List<HotelsModel> data) {
        mAdapter.setData(data);
    }

    @Override
    public void onError(Object apiError) {
        Toast.makeText(App.get(), apiError.toString(), Toast.LENGTH_LONG).show();
    }
}
