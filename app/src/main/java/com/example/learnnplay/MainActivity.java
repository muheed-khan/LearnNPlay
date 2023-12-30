package com.example.learnnplay;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private String email = "muheedk999@gmail.com";
    private String pass = "muheed123";
    EditText mail;
    EditText password;
    Button btn;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        mail = (EditText) findViewById(R.id.emailEditText);
        password = (EditText) findViewById(R.id.passwordEditText);
        btn = (Button) findViewById(R.id.loginSignupButton);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strMail = mail.getText().toString();
                String strPass = password.getText().toString();
                    if (email == strMail && pass == strPass){

        }
            }
        });






    }
}