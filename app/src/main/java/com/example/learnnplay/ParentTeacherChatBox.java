package com.example.learnnplay;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.se.omapi.Session;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.Properties;



public class ParentTeacherChatBox extends AppCompatActivity {
Button sendMail;
EditText mailTxt;
EditText email_id;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parent_teacher_chat_box);
        sendMail = (Button) findViewById(R.id.sendMailBtn);
        mailTxt = (EditText) findViewById(R.id.pTMailEditText);
        email_id = (EditText) findViewById(R.id.parent_email_id);
        sendMail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mailTxt.getText().toString() != null && email_id.getText().toString() != null){
//mail sending code here
                }
            }
        });


    }
}