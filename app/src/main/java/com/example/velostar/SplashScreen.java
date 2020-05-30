package com.example.velostar;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.ImageView;


public class SplashScreen extends Activity {

    //time
    private  static  int SPLASH_DISPLAY_LENGTH = 2000;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        new Handler().postDelayed(new Runnable() {

              //start the activity
            @Override
            public void run() {
                /* Create an Intent that will start the Menu-Activity. */
                ImageView logo = (ImageView) findViewById(R.id.appLogo);

                Animation fadeOut = new AlphaAnimation(1, 0);  // the 1, 0 here notifies that we want the opacity to go from opaque (1) to transparent (0)
                fadeOut.setInterpolator(new AccelerateInterpolator());
                fadeOut.setDuration(1000); // Fadeout duration should be 1000 milli seconds

                logo.setAnimation(fadeOut);
                Intent i = new Intent(SplashScreen.this, Maps.class);
                startActivity(i);
                finish();
            }
            }, SPLASH_DISPLAY_LENGTH);
    }


}
