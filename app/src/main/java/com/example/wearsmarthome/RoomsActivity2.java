package com.example.wearsmarthome;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.wearsmarthome.databinding.ActivityRooms2Binding;

public class RoomsActivity2 extends Activity {

    private Button mButton;
    private Button mButton2;
    private Button mButton3;
    private TextView mTextView;
    private ActivityRooms2Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityRooms2Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        mTextView = binding.text;
        mButton = binding.btnRoom1;
        mButton2 = binding.btnRoom2;
        mButton3 = binding.btnRoom3;

        binding.btnRoom1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RoomsActivity2.this, DevicesActivity2.class);
                startActivity(intent);
                finish();
            }
        });

        binding.btnRoom2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RoomsActivity2.this, DevicesActivity2.class);
                startActivity(intent);
                finish();
            }
        });

        binding.btnRoom3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RoomsActivity2.this, DevicesActivity2.class);
                startActivity(intent);
                finish();
            }
        });
    }
}