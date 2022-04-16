package com.example.riyac.animation;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button;

        imageView=(ImageView)findViewById(R.id.img);
        button=(Button)findViewById(R.id.button);


        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.animation);
                imageView.startAnimation(animation);
                final MediaPlayer mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.song);
                animation.setAnimationListener(new Animation.AnimationListener() {
                    @Override
                    public void onAnimationStart(Animation animation) {
                        mediaPlayer.start();
                    }

                    @Override
                    public void onAnimationEnd(Animation animation) {
                        mediaPlayer.stop();
                    }

                    @Override
                    public void onAnimationRepeat(Animation animation) {

                    }

                });

            }
        });



    }}
