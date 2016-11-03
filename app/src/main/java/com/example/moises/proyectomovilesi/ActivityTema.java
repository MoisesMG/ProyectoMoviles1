package com.example.moises.proyectomovilesi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class ActivityTema extends AppCompatActivity {
    Button Bopc1;
    Button Bopc2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tema);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        Button Bopc1= (Button) findViewById(R.id.Opcion1T);
        Bopc1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent (ActivityTema.this, MainActivity.class);
                startActivity(intent);
            }
        });

        Button Bopc2= (Button) findViewById(R.id.Opcion2T);
        Bopc2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1= new Intent(ActivityTema.this, ActivityTema.class);
                startActivity(intent1);
            }
        });

    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home: //hago un case por si en un futuro agrego mas opciones
                finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);


        }
    }
}
