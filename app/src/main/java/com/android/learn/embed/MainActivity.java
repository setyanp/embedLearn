package com.android.learn.embed;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.view.View;
import android.view.View.OnClickListener;

public class MainActivity extends AppCompatActivity implements OnClickListener {

    private ImageView materiClick, quizClick, videoClick;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initializeComponent();
    }

    private void initializeComponent() {
        materiClick = (ImageView) findViewById(R.id.imageMateri);
        materiClick.setOnClickListener(this);

        quizClick = (ImageView) findViewById(R.id.imageQuiz);
        quizClick.setOnClickListener(this);

        videoClick = (ImageView) findViewById(R.id.imageVideo);
        videoClick.setOnClickListener(this);
    }

    public void onClick(View v){
        switch (v.getId()) {
            case R.id.imageMateri:
                Intent i = new Intent(this, Materi.class);
                startActivity(i);
                break;
            case R.id.imageQuiz:
                Intent j = new Intent(this, QuizPage.class);
                startActivity(j);
                break;
            case R.id.imageVideo:
                Intent k = new Intent(this, videoMain.class);
                startActivity(k);
                break;
        }
    }

    @Override
    public void onBackPressed() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setCancelable(false);
        builder.setMessage("Do you want to Exit?");
        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                //if user pressed "yes", then he is allowed to exit from application
                MainActivity.super.onBackPressed();
                finish();
                System.exit(0);
            }
        });
        builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                //if user select "No", just cancel this dialog and continue with app
                dialog.cancel();
            }
        });
        AlertDialog alert = builder.create();
        alert.show();
    }
}
