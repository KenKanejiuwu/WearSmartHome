package com.example.wearsmarthome;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.wearsmarthome.databinding.ActivitySplash2Binding;

public class SplashActivity2 extends Activity {

    private ImageView mImageView;
    private ActivitySplash2Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivitySplash2Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        mImageView = binding.imageViewLaunch;

        RotateAnimation rotate =  new RotateAnimation(0, 360, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
        rotate.setDuration(5000);
        rotate.setInterpolator(new LinearInterpolator());

        mImageView.startAnimation(rotate);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(SplashActivity2.this, MainActivity.class);
                startActivity(i);
                finish();
            }
        }, 2500);
    }
}