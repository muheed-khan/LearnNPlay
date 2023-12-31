package com.example.learnnplay;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SignUp extends AppCompatActivity {
    EditText fullNameStu;
    EditText fullNamePar;
    EditText emailSignUp;
    EditText passSignUp;
    Button btnSignUp;
    private static final String emailPattern = "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

    private static final Pattern pattern = Pattern.compile(emailPattern);
    public static boolean validateEmail(String email) {
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_up);

        fullNameStu = (EditText) findViewById(R.id.fullNameStudentEditText);
        fullNamePar = (EditText) findViewById(R.id.fullNameParentEditText);
        emailSignUp = (EditText) findViewById(R.id.emailSignUpEditText);
        passSignUp = (EditText) findViewById(R.id.passwordSignUpEditText);
        btnSignUp = (Button) findViewById(R.id.registerButton);
        btnSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(fullNameStu != null){
                    Toast.makeText(getApplicationContext(),)
                }
            }
        });



    }
}