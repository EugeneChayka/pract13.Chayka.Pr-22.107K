package com.example.pract13chaykapr_22107k;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;



public class login extends AppCompatActivity implements View.OnClickListener{
    Button btn;
    Button btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        btn = findViewById(R.id.btnIn);
        btn.setOnClickListener(this);
        btn2 = findViewById(R.id.btnProfile);
        btn2.setOnClickListener(this);

    }
    @Override
    public void onClick(View view) {
        if(view.getId()==R.id.btnIn){
            startActivity(new Intent(login.this,MainActivity.class ));
        }
        else if(view.getId()==R.id.btnProfile){
            startActivity(new Intent(login.this,profile.class ));
        }
    }
}
