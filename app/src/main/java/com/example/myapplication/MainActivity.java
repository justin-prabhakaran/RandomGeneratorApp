package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;


import java.util.Random;

public class MainActivity extends AppCompatActivity {
    TextView txtrand;
    TextView rangeper;
    Button btn;
    SeekBar seekBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtrand = findViewById(R.id.txtrand);
        btn = findViewById(R.id.btnrand);
        seekBar = findViewById(R.id.rangevaluebar);
        rangeper = findViewById(R.id.rangeper);
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                rangeper.setText(String.valueOf(i));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
            }
        });
    }

    public void onClickbtn(View v) {
        Random r = new Random();
        int ra = r.nextInt(seekBar.getProgress());
        txtrand.setText(String.valueOf(ra));
    }


}



