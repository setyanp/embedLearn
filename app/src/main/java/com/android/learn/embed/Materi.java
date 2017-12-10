package com.android.learn.embed;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

public class Materi extends AppCompatActivity implements OnClickListener {

    private ImageButton iot, imageProc, robotic, tombolBack, tombolHome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_materi);

        initializeComponent();
    }

    private void initializeComponent() {
        iot = (ImageButton) findViewById(R.id.iotButton);
        iot.setOnClickListener(this);

        imageProc = (ImageButton) findViewById(R.id.ipButton);
        imageProc.setOnClickListener(this);

        robotic = (ImageButton) findViewById(R.id.roboticButton);
        robotic.setOnClickListener(this);

        tombolHome = (ImageButton) findViewById(R.id.homeButton);
        tombolHome.setOnClickListener(this);

        tombolBack = (ImageButton) findViewById(R.id.backButton);
        tombolBack.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.iotButton:
                Intent i = new Intent(this, IotPage.class);
                startActivity(i);
                break;
            case R.id.ipButton:
                Intent j = new Intent(this, IpPage.class);
                startActivity(j);
                break;
            case R.id.roboticButton:
                Intent k = new Intent(this, RoboticPage.class);
                startActivity(k);
                break;
            case R.id.homeButton:
                Intent l = new Intent(this, MainActivity.class);
                startActivity(l);
                break;
            case R.id.backButton:
                Intent m = new Intent(this, MainActivity.class);
                startActivity(m);
                break;
        }
    }
}
