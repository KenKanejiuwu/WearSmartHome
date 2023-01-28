package com.example.wearsmarthome;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.wearsmarthome.databinding.ActivityDevicesSetting2Binding;

public class DevicesSettingActivity2 extends Activity {

    private TextView mTextView;
    private ActivityDevicesSetting2Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityDevicesSetting2Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        mTextView = binding.text;
    }
}