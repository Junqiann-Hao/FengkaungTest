package com.example.simpleImageBrowser;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    int[] image = new int[]{R.drawable.ajax,R.drawable.html,R.drawable.java,R.drawable.javaee,R.drawable.swift};

    int currentImg = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final ImageView imageView = (ImageView) findViewById(R.id.imageView);
        assert imageView != null;
        imageView.setImageResource(image[0]);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView.setImageResource(image[++currentImg % image.length]);
            }
        });
    }
}
