package com.example.dptoredes.prueba;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class AcercaDe extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acerca_de);


        String user1;
        final TextView text1 = (TextView) findViewById(R.id.textView);
        user1 = getIntent().getStringExtra("user");
        text1.setText("Hola" +user1);
    }



}
