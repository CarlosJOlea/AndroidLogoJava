package com.example.androidlogojava;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);


        // animaciones

        Animation animation1 = AnimationUtils.loadAnimation(this,R.anim.desplazamiento_arriba);
        Animation animation2 = AnimationUtils.loadAnimation(this,R.anim.desplazamiento_abajo);


        TextView textViewCodeGeas= findViewById(R.id.codeGeastextView);
        TextView  textViewDg = findViewById(R.id.dgtextView);
        ImageView loImageView = findViewById(R.id.imageView);

        textViewDg.setAnimation(animation2);
        textViewCodeGeas.setAnimation(animation2);
        loImageView.setAnimation(animation1);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this,LoginActivity.class);
                startActivity(intent);
                finish();
            }
        },4000);


    }


}