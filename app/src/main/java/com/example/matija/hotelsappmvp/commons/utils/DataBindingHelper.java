package com.example.matija.hotelsappmvp.commons.utils;

import android.databinding.BindingAdapter;
import android.support.v4.content.ContextCompat;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.example.matija.hotelsappmvp.R;

/**
 * Created by Matija on 17.10.2016..
 */

public class DataBindingHelper {

    /**
     * Binding Adapter for loading images from urls with databinding
     *
     * @param view     ImageView in which the image should be loaded
     * @param imageUrl Url of Image which should be loaded
     */
//    @BindingAdapter("bind:imageUrl")
//    public static void loadImageFromUrl(ImageView view, String imageUrl) {
//        if (imageUrl == null) {
//            view.setImageDrawable(ContextCompat.getDrawable(view.getContext(), R.drawable.no_image));
//        } else {
//            Glide.with(view.getContext())
//                    .load(imageUrl)
//                    .diskCacheStrategy(DiskCacheStrategy.SOURCE)
//                    .into(view);
//        }
//    }
}
