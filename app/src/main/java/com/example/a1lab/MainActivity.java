package com.example.a1lab;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvmain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.tvmain=findViewById(R.id.tvmain);
    }

    public void OnBtnclick(View view) {
        this.tvmain.setText("Text was changed!");
    }
}