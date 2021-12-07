package com.example.glidedemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {
    ImageView glideView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        glideView = findViewById(R.id.glide_view);
    }

    public void loadImage(View view){
        String url= "https://upload-images.jianshu.io/upload_images/18068581-a78101739aba8000.png?imageMogr2/auto-orient/strip|imageView2/2/format/webp";
        Glide.with(this).load(url).into(glideView);
    }

    public void clearImage(View view){
        Glide.with(this).clear(glideView);
    }
}