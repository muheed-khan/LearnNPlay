package com.example.learnnplay;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class HomePage extends AppCompatActivity {
Button alpha;
Button color;
Button num;
Button shape;
Button parent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_page);
        alpha = (Button) findViewById(R.id.alphabetsButton);
        color = (Button) findViewById(R.id.colorsButton);
        num = (Button) findViewById(R.id.numBtn);
        shape = (Button) findViewById(R.id.shapesButton);
        parent = (Button) findViewById(R.id.progressFeedbackButton);

        alpha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentAlpha = new Intent(HomePage.this, alphabets.class);
                startActivity(intentAlpha);
            }
        });

        color.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentColor = new Intent(HomePage.this, Colors.class);
                startActivity(intentColor);
            }
        });

        num.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentNum = new Intent(HomePage.this, numbers.class);
                startActivity(intentNum);
            }
        });

shape.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent intentShape =  new Intent(HomePage.this,Shapes.class);
        startActivity(intentShape);
    }
});
parent.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent intentParent = new Intent(HomePage.this,parentFeedBack.class);
        startActivity(intentParent);
    }
});

    }
}