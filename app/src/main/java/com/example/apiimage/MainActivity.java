package com.example.apiimage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import com.bumptech.glide.Glide;


public class    MainActivity extends AppCompatActivity {
    String mImageAddress =
            "https://blog.brawlstars.com/uploaded-images/_640x358_crop_center-center_90/1894192642_1639581407.jpg?mtime=20211215151647";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Onclick1(View view) {
        ImageView mImageView = findViewById(R.id.imageView2);
        Glide.with(MainActivity.this)
                .load(mImageAddress)
                .into(mImageView);
    }
}