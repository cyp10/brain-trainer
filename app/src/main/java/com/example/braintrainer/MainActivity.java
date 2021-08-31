package com.example.braintrainer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Button gobutton;
    Button button0;
    Button button1;
    Button button2;
    Button button3;
    Random rand;
    CountDownTimer countDownTimer;
    TextView  timerTextView;
    TextView result ;
    int s1;
    int s2;
    int s3;
    int s4;
    int sum;
    TextView sumTextView;


    public void pos1( int sum){

        button0.setText(String.valueOf(sum));
        int p1r=rand.nextInt(41);
        int p2r=rand.nextInt(41);
        int p3r=rand.nextInt(41);
        int p4r=rand.nextInt(41);
         s1=sum;

        if(p1r!=sum){ button1.setText(String.valueOf(p1r));}
        if(p2r!=sum&&p2r!=p1r){ button2.setText(String.valueOf(p2r));}
        else{
            p2r=rand.nextInt(41);
        }
        if(p3r!=sum&&p3r!=p1r&&p3r!=p2r){ button3.setText(String.valueOf(p3r));}
        else {
            p3r=rand.nextInt(41);
        }

    }
    public void pos2( int sum){

        button1.setText(String.valueOf(sum));
        int p1r=rand.nextInt(41);
        int p2r=rand.nextInt(41);
        int p3r=rand.nextInt(41);
        int p4r=rand.nextInt(41);
         s2=sum;


        if(p1r!=sum){ button2.setText(String.valueOf(p1r));}
        if(p2r!=sum&&p2r!=p1r){ button3.setText(String.valueOf(p2r));}
        else{
            p2r=rand.nextInt(41);
        }
        if(p3r!=sum&&p3r!=p1r&&p3r!=p2r){ button0.setText(String.valueOf(p3r));}
        else {
            p3r=rand.nextInt(41);
        }

    }

    public void pos3( int sum){

        button2.setText(String.valueOf(sum));
        int p1r=rand.nextInt(41);
        int p2r=rand.nextInt(41);
        int p3r=rand.nextInt(41);
        int p4r=rand.nextInt(41);
         s3=sum;

        if(p1r!=sum){ button3.setText(String.valueOf(p1r));}
        if(p2r!=sum&&p2r!=p1r){ button1.setText(String.valueOf(p2r));}
        else{
            p2r=rand.nextInt(41);
        }
        if(p3r!=sum&&p3r!=p1r&&p3r!=p2r){ button0.setText(String.valueOf(p3r));}
        else {
            p3r=rand.nextInt(41);
        }

    }
    public void pos4( int sum){

        button3.setText(String.valueOf(sum));
        int p1r=rand.nextInt(41);
        int p2r=rand.nextInt(41);
        int p3r=rand.nextInt(41);
        int p4r=rand.nextInt(41);
        s4=sum;

        if(p1r!=sum){ button2.setText(String.valueOf(p1r));}
        if(p2r!=sum&&p2r!=p1r){ button1.setText(String.valueOf(p2r));}
        else{
            p2r=rand.nextInt(41);
        }
        if(p3r!=sum&&p3r!=p1r&&p3r!=p2r){ button0.setText(String.valueOf(p3r));}
        else {
            p3r=rand.nextInt(41);
        }

    }
    public void click(View view){
        if (sum == s1) {
            result.setText("correct");
        } else if (sum == s2) {
            result.setText("correct");
        } else if (sum == s3) {
            result.setText("correct");
        } else {
            result.setText("Wrong");
        }
        timerTextView.setVisibility(View.INVISIBLE);


    }









    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView sumTextView = (TextView) findViewById(R.id.sumTextView);
        timerTextView = (TextView) findViewById(R.id.timerTextView);
        result = (TextView) findViewById(R.id.result);
        button0 = (Button) findViewById(R.id.button0);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        rand = new Random();


        countDownTimer=new CountDownTimer(30000, 1000) {

            public void onTick(long millisUntilFinished) {
                timerTextView.setText(Integer.toString((int) (millisUntilFinished / 1000)));
                ;
            }

            public void onFinish() {




            }
        }.start();




        int a = rand.nextInt(21);
        int b = rand.nextInt(21);
        sum = a + b;
        sumTextView.setText(Integer.toString(a) + "+" + Integer.toString(b));
        int g = rand.nextInt(4);
        if (g == 1) {
            pos1(sum);
        } else if (g == 2) {
            pos2(sum);
        } else if (g == 3) {
            pos3(sum);
        } else {
            pos4(sum);
        }





        
    }



    }
