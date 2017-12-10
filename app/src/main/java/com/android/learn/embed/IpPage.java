package com.android.learn.embed;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;


public class IpPage extends AppCompatActivity implements OnClickListener {

    private ImageButton back, home;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ip);

        initializeComponent();

    }

    private void initializeComponent() {
        home = (ImageButton) findViewById(R.id.homeButtonIp);
        home.setOnClickListener(this);

        back = (ImageButton) findViewById(R.id.backButtonIp);
        back.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.homeButtonIp:
                Intent l = new Intent(this, MainActivity.class);
                startActivity(l);
                break;
            case R.id.backButtonIp:
                Intent m = new Intent(this, Materi.class);
                startActivity(m);
                break;
        }
    }
}
