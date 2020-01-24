package com.example.appeasyeat;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

   public void entar(View v){
       Intent intent = new Intent(this, IngCodigo.class);
       startActivity(intent);
   }

    public void crearCuenta(View v){
        Intent intent = new Intent(this, Crear_cta.class);
        startActivity(intent);
    }
    public void olvidoPassword(View v){
        Intent intent = new Intent(this, RecuperarPassword.class);
        startActivity(intent);
    }

}
