package com.android.learn.embed;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.ImageView;

public class videoMain extends AppCompatActivity implements OnClickListener {

    private ImageView video1, video2, video3;
    private ImageButton tombolHome, tombolBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_videopage);

        initializeComponent();
    }

    private void initializeComponent() {
        video1 = (ImageView) findViewById(R.id.iotVideo);
        video1.setOnClickListener(this);

        video2 = (ImageView) findViewById(R.id.IPVideo);
        video2.setOnClickListener(this);

        video3 = (ImageView) findViewById(R.id.RoboticVideo);
        video3.setOnClickListener(this);

        tombolHome = (ImageButton) findViewById(R.id.homeButtonVideo);
        tombolHome.setOnClickListener(this);

        tombolBack = (ImageButton) findViewById(R.id.backButtonVideo);
        tombolBack.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.iotVideo:
                Intent i = new Intent(this, videoPage1.class);
                startActivity(i);
                break;
            case R.id.IPVideo:
                Intent j = new Intent(this, videoPage2.class);
                startActivity(j);
                break;
            case R.id.RoboticVideo:
                Intent k = new Intent(this, videoPage3.class);
                startActivity(k);
                break;
            case R.id.homeButtonVideo:
                Intent l = new Intent(this, MainActivity.class);
                startActivity(l);
                break;
            case R.id.backButtonVideo:
                Intent m = new Intent(this, MainActivity.class);
                startActivity(m);
                break;
        }
    }
}
