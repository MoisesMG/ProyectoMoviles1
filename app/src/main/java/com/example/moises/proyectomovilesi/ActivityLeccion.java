package com.example.moises.proyectomovilesi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class ActivityLeccion extends AppCompatActivity {
    Button Bopc1;
    Button Bopc2;
    Button Bopc3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leccion);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        Button Bopc1= (Button) findViewById(R.id.Opcion1L);
        Bopc1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(ActivityLeccion.this, MainActivity.class);
                startActivity(intent);
            }
        });
        Button Bopc2= (Button) findViewById(R.id.Opcion2L);
        Bopc2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(ActivityLeccion.this, ActivityTema.class);
                startActivity(intent);
            }
        });

        Button Bopc3= (Button) findViewById(R.id.Opcion3L);
        Bopc2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(ActivityLeccion.this, ActivityLeccion.class);
                startActivity(intent);
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
