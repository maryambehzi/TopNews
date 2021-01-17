package com.maryambehzi.topnews.view;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import com.maryambehzi.topnews.R;

public class Splash extends Activity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_splash);


            Thread time = new Thread(){

                public void run(){
                    try {
                        sleep(2000);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }finally {
                        Intent start = new Intent(Splash.this, MainActivity.class);
                        startActivity(start);
                    }
                }
            };
            time.start();
        }

        @Override
        protected void onPause() {
            super.onPause();
            finish();
        }

}