package com.example.moises.proyectomovilesi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import static com.example.moises.proyectomovilesi.R.id.Opcion1;


public class MainActivity extends AppCompatActivity {
    Button Bopc1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    Button Bopc1= (Button) findViewById(R.id.Opcion1);
        Bopc1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, ActivityTema.class);
                startActivity(i);
            }
        });
    }








}