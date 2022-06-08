package com.example.mrs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.mrs.MainActivity2;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b= (Button) findViewById(R.id.button);
        b.setOnClickListener(this::onClick);

    }

    @Override
    public void onClick(View view) {
        int a=1;

        if(view==b) {
            if(a==1){
                Intent intent=new Intent(getApplicationContext(), MainActivity2.class);
                startActivity(intent);
            }
        }
    }
}