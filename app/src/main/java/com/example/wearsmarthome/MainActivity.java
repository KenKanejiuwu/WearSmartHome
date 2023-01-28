package com.example.wearsmarthome;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.wearsmarthome.databinding.ActivityMainBinding;

public class MainActivity extends Activity {

    private Button mButton;
    private TextView mTextView;
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();          //Root xml or viewGroup will be a part of converted view over here
        setContentView(view);

        mTextView = binding.text;
        mButton = binding.btnSign;

        binding.btnSign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, RoomsActivity2.class);
                startActivity(intent);
                finish();
            }
        });
    }
}