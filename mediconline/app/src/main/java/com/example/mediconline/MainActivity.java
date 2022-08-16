package com.example.mediconline;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TimerTask tarea = new TimerTask() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this,PrincipalActivity.class);
                startActivity(intent);
                finish(); //Para que solo se muestre una vez al abrir la aplicación
            }
        };

        Timer tiempo = new Timer();
        tiempo.schedule(tarea,3000); //Muestra la pantalla durante 3seg
    }

}