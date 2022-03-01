package com.example.a1lab;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvmain;
    TextView tvmainColor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.tvmain=findViewById(R.id.tvmain);
        this.tvmainColor=findViewById(R.id.txtChangeColor);

    }

    public void OnBtnclick(View view) {
        this.tvmain.setText(R.string.changed_label_caption);
    }
    public void OnBtnclickChangeColor(View view) { this.tvmainColor.setTextColor(Color.GREEN);
    }
}