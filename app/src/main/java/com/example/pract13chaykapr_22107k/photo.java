package com.example.pract13chaykapr_22107k;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class photo extends AppCompatActivity implements View.OnClickListener{
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.photo);
        text = findViewById(R.id.tvClose);
        text.setOnClickListener(this);
    }
    @Override
    public void onClick(View view) {
            startActivity(new Intent(photo.this,profile.class ));
    }
}