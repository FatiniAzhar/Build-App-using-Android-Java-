package com.example.pproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class SplashScreen extends AppCompatActivity {

    //declare image view variable 
    private ImageView iv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        iv=findViewById(R.id.icon); //image id
        Animation my_anim = AnimationUtils.loadAnimation(this,R.anim.mytransition);
        iv.startAnimation(my_anim);
         //link to login page 
        final Intent i = new Intent(this,LogIn.class);
        
        //set timer
        Thread timer = new Thread(){


            public void run(){

                try{
                    // set a time takes to load the splashscreen 
                    sleep(1000);   
                }catch (InterruptedException e){
                    e.printStackTrace();

                } finally {

                    startActivity(i);
                    finish();

                }
            }
        };
        timer.start();
    }
}
