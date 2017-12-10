package com.android.learn.embed;


import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v4.view.animation.FastOutLinearInInterpolator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class QuizPage extends AppCompatActivity {

    private Button answer1, answer2, answer3, answer4;
    private TextView score, soal;
    private QuizHelp mSoal = new QuizHelp();

    private String mJawaban;
    private int mScore = 0;
    private int panjangSoal = mSoal.aSoal.length;

    private int soalNumb = 0;
    private String skor;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kuis);



        answer1 = (Button) findViewById(R.id.answer1);
        answer2 = (Button) findViewById(R.id.answer2);
        answer3 = (Button) findViewById(R.id.answer3);
        answer4 = (Button) findViewById(R.id.answer4);

        score = (TextView) findViewById(R.id.quizScore);
        soal = (TextView) findViewById(R.id.quizSoal);

        skor = String.valueOf(mScore*20);

        score.setText("Nilai Anda : " + skor);


        updateSoal(soalNumb);

        answer1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                    if (answer1.getText() == mJawaban) {
                        mScore++;
                        skor = String.valueOf(mScore*20);
                        score.setText("Nilai Anda : " + skor);
                        soalNumb++;
                        if (soalNumb == panjangSoal) {
                            finishQuiz(mScore);
                        } else {
                            updateSoal(soalNumb);
                        }
                    } else {
                        soalNumb++;
                        if (soalNumb == panjangSoal) {
                            finishQuiz(mScore);
                        } else {
                            updateSoal(soalNumb);
                        }
                    }

            }
        });

        answer2.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {

                    if (answer2.getText() == mJawaban) {
                        mScore++;
                        skor = String.valueOf(mScore*20);
                        score.setText("Nilai Anda : " + skor);
                        soalNumb++;
                        if (soalNumb == panjangSoal) {
                            finishQuiz(mScore);
                        } else {
                            updateSoal(soalNumb);
                        }
                    } else {
                        soalNumb++;
                        if (soalNumb == panjangSoal) {
                            finishQuiz(mScore);
                        } else {
                            updateSoal(soalNumb);
                        }
                    }

            }
        });

        answer3.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {

                    if (answer3.getText() == mJawaban) {
                        mScore++;
                        skor = String.valueOf(mScore*20);
                        score.setText("Nilai Anda : " + skor);
                        soalNumb++;
                        if (soalNumb == panjangSoal) {
                            finishQuiz(mScore);
                        } else {
                            updateSoal(soalNumb);
                        }
                    } else {
                        soalNumb++;
                        if (soalNumb == panjangSoal) {
                            finishQuiz(mScore);
                        } else {
                            updateSoal(soalNumb);
                        }
                    }
                }

        });

        answer4.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {

                    if (answer4.getText() == mJawaban) {
                        mScore++;
                        skor = String.valueOf(mScore*20);
                        score.setText("Nilai Anda : " + skor);
                        soalNumb++;
                        if (soalNumb == panjangSoal) {
                            finishQuiz(mScore);
                        } else {
                            updateSoal(soalNumb);
                        }
                    } else {
                        soalNumb++;
                        if (soalNumb == panjangSoal) {
                            finishQuiz(mScore);
                        } else {
                            updateSoal(soalNumb);
                        }
                    }
                }

        });

    }

    public void updateSoal(int num) {
        soal.setText(mSoal.getSoal(num));
        answer1.setText(mSoal.getPilihan1(num));
        answer2.setText(mSoal.getPilihan2(num));
        answer3.setText(mSoal.getPilihan3(num));
        answer4.setText(mSoal.getPilihan4(num));

        mJawaban = mSoal.getJawaban(num);
    }

    public void finishQuiz(int nilai) {
        AlertDialog.Builder builder = new AlertDialog.Builder(QuizPage.this);
        builder.setCancelable(false);
        skor = String.valueOf(nilai*20);
        builder.setMessage("Skor kuis anda adalah : " + skor);
        builder.setNeutralButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int I) {
                //if user pressed "yes", then he is allowed to exit from application
                finish();
            }
        });
        AlertDialog alert = builder.create();
        alert.show();
    }
}
