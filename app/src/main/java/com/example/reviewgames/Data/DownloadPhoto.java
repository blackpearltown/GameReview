package com.example.reviewgames.Data;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.widget.ImageView;

import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public class DownloadPhoto extends AsyncTask<String, Void, Bitmap> {
    ImageView imageview;

    public DownloadPhoto(ImageView imageview) {
        this.imageview = imageview;
    }

    @Override
    protected Bitmap doInBackground(String... string) {
        String urls = string[0];
        Bitmap result = null;
        try {
            URL url = new URL(urls);
            URLConnection connection = url.openConnection();
            connection.setUseCaches(true);
            InputStream in = url.openStream();
            result = BitmapFactory.decodeStream(in);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result;
    }
    @Override
    protected void onPostExecute(Bitmap bitmap) {
        imageview.setImageBitmap(bitmap);
    }
}