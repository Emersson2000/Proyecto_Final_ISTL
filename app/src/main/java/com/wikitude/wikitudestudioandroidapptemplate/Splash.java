package com.wikitude.wikitudestudioandroidapptemplate;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.os.Bundle;


public class Splash extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        int duraction_splash = 500;

        //NOS PERMITE EJECUTAR CODIGO POR UN DETERMINADO TIEMPO:
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                //intent para pasar de una activity a otra: contexto,a donde vamos a ir;
                Intent intent = new Intent(Splash.this, MainActivity.class);
                startActivity(intent);
                finish();
                //CODIGO QUE SE EJECUTARA:


            };
        }, duraction_splash);

    }
}