package com.example.learnnplay;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class parentFeedBack extends AppCompatActivity {
Button confirm;
EditText emailValidation;
EditText passValidation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_login);
        emailValidation = (EditText) findViewById(R.id.emailEditText);
        passValidation = (EditText) findViewById(R.id.passValidateEditText);
        confirm = (Button) findViewById(R.id.confirmButton);
        confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(emailValidation.getText().toString() != null && passValidation.getText().toString() != null){
                    Intent intent = new Intent(parentFeedBack.this,about.class);
                    startActivity(intent);
                }
            }
        });


    }
}