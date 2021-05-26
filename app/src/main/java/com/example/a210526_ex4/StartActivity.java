package com.example.a210526_ex4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class StartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
    }

    @Override
    public void onBackPressed() {
        finish();
    }

}