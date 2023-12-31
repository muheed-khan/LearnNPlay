package com.example.learnnplay;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class about extends AppCompatActivity {
Button contactPT;
Button submitFeedback;
EditText feedBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        feedBack = (EditText) findViewById(R.id.feedbackTextView);
        contactPT = (Button) findViewById(R.id.contactTecaherButton);
        submitFeedback = (Button) findViewById(R.id.submitFeedbackButton);
        contactPT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(about.this,ParentTeacherChatBox.class);
                startActivity(intent);
            }
        });
        submitFeedback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(feedBack.getText().toString() != null){
//                    Post the feedback to db
                }
            }
        });
    }
}