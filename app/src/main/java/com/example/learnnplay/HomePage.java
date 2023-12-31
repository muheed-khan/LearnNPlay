package com.example.learnnplay;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class HomePage extends AppCompatActivity {
    Button alpha;
    Button shape;
    Button color;
    Button progress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_page);
        alpha = (Button) findViewById(R.id.alphabetsButton);
        shape = (Button) findViewById(R.id.shapesButton);
        color =(Button) findViewById(R.id.colorsButton);
        progress = (Button) findViewById(R.id.progressFeedbackButton);
        alpha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });


    }
}