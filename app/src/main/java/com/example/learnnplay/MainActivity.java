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
//    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
//<<<<<<< Updated upstream
        mail = (EditText) findViewById(R.id.emailEditText);
        password = (EditText) findViewById(R.id.passwordEditText);
        btn = (Button) findViewById(R.id.loginSignupButton);
//=======
        mail = (EditText) findViewById(R.id.mail);
        password = (EditText) findViewById(R.id.pass);
        btn = (Button) findViewById(R.id.loginBtn);
        signUp = (TextView) findViewById(R.id.toggleTextView);
//>>>>>>> Stashed changes
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