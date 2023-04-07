package com.example.setfontexam;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivityJAVA extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_java);

        TextView textView = findViewById(R.id.textViewJava);
        textView.setTypeface(Typeface.createFromAsset(getAssets(), "nanum_square_bold.ttf"));
    }
}