package com.example.learnnplay;

import androidx.appcompat.app.AppCompatActivity;

//import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private String email = "admin";
    private String pass = "admin";
    EditText mail;
    EditText password;
    Button btn;
    TextView signUp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        mail = (EditText) findViewById(R.id.emailLogInEditText);
        password = (EditText) findViewById(R.id.passwordEditText);
        btn = (Button) findViewById(R.id.loginSignupButton);
        signUp = (TextView) findViewById(R.id.toggleTextView);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast.makeText(getApplicationContext(),"Email : " + (mail.getText().toString()).getClass().getSimpleName()+ " Pass : " + password.getClass().getSimpleName(),Toast.LENGTH_LONG).show();
                if (mail.getText().toString().equals(email) && password.getText().toString().equals(pass)) {
                    Intent intent = new Intent(MainActivity.this, HomePage.class);
                    startActivity(intent);
//                    Log.d("MyApp", "after statement");
                }

            }
        });

        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SignUp.class);
                startActivity(intent);
            }
        });






    }
}