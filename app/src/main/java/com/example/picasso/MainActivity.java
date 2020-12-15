package com.example.picasso;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        String url = "https://wallpapercave.com/wp/wp2670841.jpg";
        ImageView imageView = findViewById(R.id.image_id);
        Picasso.with(this)
                .load(url)
                .into(imageView);


    }
}
