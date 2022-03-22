package com.example.androidlt6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showText(String nametext) {
        Fragment1 show
                = (Fragment1) this.getSupportFragmentManager()
                .findFragmentById(R.id.Fragment1);
        show.showText(nametext);
    }

}