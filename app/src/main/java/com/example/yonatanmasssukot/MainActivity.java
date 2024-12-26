package com.example.yonatanmasssukot;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    TextView tvOutput;
    Button btnShow;
    Button btnColor;
    EditText etInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        tvOutput = findViewById(R.id.tvOutput);
        btnColor = findViewById(R.id.btnColor);
        btnShow = findViewById(R.id.btnShow);
        etInput = findViewById(R.id.etInput);

        btnShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String [] arr = {"you kidding me?","you write:","Hello!","are you serious?","that's fine...","it's a nice day", "that's cool:","haha it's:","great atmosphere and...","it's ok,"};
                Random r=new Random();
                tvOutput.setText(r.nextInt(9)+""+etInput);
            }
        });
        btnColor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvOutput.setTextColor(Color.RED);
                tvOutput.setTextColor(Color.BLUE);
                tvOutput.setTextColor(Color.BLACK);
            }
        });
    }
}