package com.example.appeasyeat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class IngCodigo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ing_codigo);
    }

    public void vamos(View v){
        Intent intent = new Intent(this, IngCodigo.class);
        startActivity(intent);
    }

}
