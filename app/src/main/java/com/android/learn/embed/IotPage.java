package com.android.learn.embed;



import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;


public class IotPage extends AppCompatActivity implements OnClickListener {

    private ImageButton back, home;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iot);

        initializeComponent();

    }

    private void initializeComponent() {
        home = (ImageButton) findViewById(R.id.homeButtonIoT);
        home.setOnClickListener(this);

        back = (ImageButton) findViewById(R.id.backButtonIoT);
        back.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.homeButtonIoT:
                Intent l = new Intent(this, MainActivity.class);
                startActivity(l);
                finish();
                break;
            case R.id.backButtonIoT:
                Intent m = new Intent(this, Materi.class);
                startActivity(m);
                finish();
                break;
        }
    }
}
