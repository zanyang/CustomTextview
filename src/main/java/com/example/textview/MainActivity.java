package com.example.textview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.weiget.CustomTextView;

public class MainActivity extends AppCompatActivity {
    private CustomTextView tvCleanerPmOut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvCleanerPmOut = (CustomTextView) findViewById(R.id.ctv_cleaner_fragment_pm25_out);
        tvCleanerPmOut.setTextSize(10);
    }
}
