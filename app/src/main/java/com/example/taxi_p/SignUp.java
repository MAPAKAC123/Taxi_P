package com.example.taxi_p;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SignUp extends AppCompatActivity implements View.OnClickListener {
    Button signup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        signup = findViewById(R.id.btn_signup);
        signup.setOnClickListener(this);
    }
    @Override
    public void onClick(View v){
        if(v.getId() == R.id.btn_signup){
            startActivity(new Intent(this,mapa.class));
        }
    }
}