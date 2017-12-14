package com.example.ctuser1.myapplication.imageLoader;

import android.content.Context;
import android.widget.ImageView;

import com.example.mode.ImageDownloader;
import com.squareup.picasso.Picasso;

/**
 * Created by ctuser1 on 12/6/17.
 */

public class ImageDownloaderImpl implements ImageDownloader {
    private Context context;

    public ImageDownloaderImpl(Context context) {
        this.context = context;
    }

    public void toImageView(ImageView imageView, String url) {
//        Glide.with(context).load(url).into(imageView);
        // (one of the) advantage of Dagger: you can now simply switch between two libraries
         Picasso.with(context).setLoggingEnabled(true);
         Picasso.with(context).load(url).into(imageView);

    }
}