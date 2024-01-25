package com.example.taxi_p;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;

public class mapa extends AppCompatActivity implements View.OnClickListener {

    ImageButton menu, img1;
    Button btn,btn1;
    ImageView img, img2, img3;
    TextView txt, txt1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mapa);

        menu = findViewById(R.id.btn_menu);
        menu.setOnClickListener(this);
        img = findViewById(R.id.imageView14);
        img1 = findViewById(R.id.imageView18);
        img1.setOnClickListener(this);
        img2 = findViewById(R.id.imageView19);
        img3 = findViewById(R.id.imageView20);
        txt = findViewById(R.id.textView);
        txt1 = findViewById(R.id.textView2);
        btn = findViewById(R.id.button2);
        btn.setOnClickListener(this);
        btn1 = findViewById(R.id.button3);
    }
    @Override
    public void onClick(View v){
        if(v.getId() == R.id.btn_menu){
            img.setVisibility(View.VISIBLE);
            img1.setVisibility(View.VISIBLE);
            img2.setVisibility(View.VISIBLE);
            img3.setVisibility(View.VISIBLE);
            txt.setVisibility(View.VISIBLE);
            txt1.setVisibility(View.VISIBLE);
            btn.setVisibility(View.VISIBLE);
            btn1.setVisibility(View.VISIBLE);
        }
        else if(v.getId() == R.id.button2){
            startActivity(new Intent(this,History.class));
        }
        else if(v.getId() == R.id.imageView18){
            img.setVisibility(View.INVISIBLE);
            img1.setVisibility(View.INVISIBLE);
            img2.setVisibility(View.INVISIBLE);
            img3.setVisibility(View.INVISIBLE);
            txt.setVisibility(View.INVISIBLE);
            txt1.setVisibility(View.INVISIBLE);
            btn.setVisibility(View.INVISIBLE);
            btn1.setVisibility(View.INVISIBLE);
        }
    }
}
