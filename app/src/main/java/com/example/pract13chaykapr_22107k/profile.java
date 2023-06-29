package com.example.pract13chaykapr_22107k;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class profile extends AppCompatActivity implements View.OnClickListener{
    TextView text;
    ImageView image;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile);
        text = findViewById(R.id.tvExit);
        text.setOnClickListener(this);
        image =findViewById(R.id.imageFire);
        image.setOnClickListener(this);
    }
    @Override
    public void onClick(View view) {
        if(view.getId()==R.id.tvExit){
            startActivity(new Intent(profile.this,login.class ));
        }
        else if(view.getId()==R.id.imagevEmile){
            startActivity(new Intent(profile.this,photo.class ));
        }

    }
}
