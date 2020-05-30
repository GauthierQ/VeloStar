package com.example.velostar;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;


public class SplashScreen extends Activity {

    //time
    private  static  int SPLASH_TIME_OUT = 5000;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        new Handler().postDelayed(new Runnable() {

              //start the activity
            @Override
            public void run() {
                Intent i = new Intent(SplashScreen.this, Maps.class);
                startActivity(i);
                finish();
            }
            }, SPLASH_TIME_OUT);
    }


}
