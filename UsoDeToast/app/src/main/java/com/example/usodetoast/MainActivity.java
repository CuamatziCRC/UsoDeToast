package com.example.usodetoast;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int matematicas = 10;
        int quimica = 6;
        int fisica =5;
        int promedio = 0;

        promedio = (matematicas+quimica+fisica)/3;

        if (promedio >= 6) {
            Toast.makeText(this, "Usted esta aprobado", Toast.LENGTH_SHORT).show();
        }else if(promedio<=5) {
            Toast.makeText(this, "Usted puede mejorar", Toast.LENGTH_LONG).show();
        }


    }


}
