package com.example.pproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

public class LogIn extends AppCompatActivity implements View.OnClickListener {

     //declare variable for textview and  button
    private TextView tv1,tv2;
    private Button bt1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);  //link to activity login
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);

        //link each ids to its respective variables
         tv1 = findViewById(R.id.forgot_password);
         tv2 = findViewById(R.id.sign_up);
         bt1= findViewById(R.id.bt_login);

         tv1.setOnClickListener(this);
        tv2.setOnClickListener(this);
        bt1.setOnClickListener(this);

    }

    //onclick event 
    public void onClick(View view) {

        switch (view.getId()) {
            
            case R.id.forgot_password:
                Intent i1 = new Intent(this, ForgotPassword.class);
                startActivity(i1);
                break;

            case R.id.sign_up:
                Intent i2 = new Intent(this, SignUp.class);
                startActivity(i2);
                break;

                //just an example to show how the code is works ..
            //TODO
            case R.id.bt_login:
                Intent i3 = new Intent(this, MainHome.class);
                startActivity(i3);
                break;


            default:
                break;

        }

    }
}
