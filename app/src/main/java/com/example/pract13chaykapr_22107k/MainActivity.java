package com.example.pract13chaykapr_22107k;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button btn;

   ImageView image;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.btnCalm);
        btn.setOnClickListener(this);
        image = findViewById(R.id.imagevEmile);
        image.setOnClickListener(this);

    }
    @Override
    public void onClick(View view) {
        if(view.getId()==R.id.btnCalm) {
            String text = "Сегодня ты чувствуешь себя спокойным";
            int duration = Toast.LENGTH_SHORT;
            Toast toast = Toast.makeText(this, text, duration);
            toast.show();
        }
        else if(view.getId()==R.id.btnRelax) {
            String text = "Сегодня ты чувствуешь себя расслабленным";
            int  duration = Toast.LENGTH_SHORT;
            Toast toast = Toast.makeText(this, text, duration);
            toast.show();
        }

        else if(view.getId()==R.id.btnFocused) {
            String  text = "Сегодня ты чувствуешь себя сосредоточенным";
            int  duration = Toast.LENGTH_SHORT;
            Toast toast = Toast.makeText(this, text, duration);
                toast.show();
            }

        else if(view.getId()==R.id.btnExcited) {
            String  text = "Сегодня ты чувствуешь себя взволнованным";
            int duration = Toast.LENGTH_SHORT;
            Toast toast = Toast.makeText(this, text, duration);
            toast.show();
        }
        else if(view.getId()==R.id.imagevEmile){
            startActivity(new Intent(MainActivity.this,profile.class ));
        }
    }


}