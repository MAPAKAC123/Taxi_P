package com.example.taxi_p;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
Button btn, signin;
EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.btn_create);
        btn.setOnClickListener(this);
        signin = findViewById(R.id.btn_signup);
        signin.setOnClickListener(this);


    }
    @Override
    public void onClick(View v){
        if (v.getId() == R.id.btn_create){
            startActivity(new Intent(this,SignUp.class));
        }
        else if(v.getId() == R.id.btn_signup){
            startActivity(new Intent(this,mapa.class));
        }
    }
}