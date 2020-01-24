package com.example.appeasyeat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class RecuperarPassword extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recuperar_password);
    }

    public void recuperarPassword(View v){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

}
