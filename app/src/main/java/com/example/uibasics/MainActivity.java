package com.example.uibasics;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void operations(View view) {
        Button btn = (Button) view;
        if(btn.getId() == R.id.helloBtn) {
            TextView txtWelcome = findViewById(R.id.txtWelcome);
            txtWelcome.setText("Hello Again");
        }

    }
}