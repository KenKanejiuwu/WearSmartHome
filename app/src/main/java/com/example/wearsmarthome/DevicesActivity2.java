package com.example.wearsmarthome;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.wearsmarthome.databinding.ActivityDevices2Binding;

public class DevicesActivity2 extends Activity {

    private Button mButton;
    private Button mButton2;
    private TextView mTextView;
    private ActivityDevices2Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityDevices2Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        mTextView = binding.text;

        mButton = binding.btnDevice1;
        mButton2 = binding.btnDevice2;

        binding.btnDevice1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DevicesActivity2.this, DevicesSettingActivity2.class);
                startActivity(intent);
                finish();
            }
        });

        binding.btnDevice2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DevicesActivity2.this, DevicesSettingActivity2.class);
                startActivity(intent);
                finish();
            }
        });
    }
}