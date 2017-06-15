package com.example.dptoredes.prueba;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    String tag = "holi";
    EditText user;
    EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //final Button button = (Button) findViewById(R.id.button1);
        //final EditText usuario = (EditText) findViewById(R.id.editText);
        //final EditText pass = (EditText) findViewById(R.id.editPass);
        final Button ingresar = (Button) findViewById(R.id.btnIngresar);
        /*button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Log.d(tag,"confirmar");
                Intent intent = new Intent (MainActivity.this,AcercaDe.class);
                startActivity(intent);
            }
        });*/
    }

    public void fnIngresar(View view){
        user = (EditText)findViewById(R.id.editText);
        password = (EditText)findViewById(R.id.editPass);
        Intent intent = new Intent(MainActivity.this, AcercaDe.class);
        intent.putExtra("user", user.getText().toString());
        intent.putExtra("password",password.getText().toString());
        startActivity(intent);
    }

    public void abrirLlamada(View view){
        Log.d(tag,"confirmar si llam{o a la funcion");
        Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:996522449"));
        startActivity(intent);
    }

    protected void onStart() {
        super.onStart();
        Log.d("Hola mundo", "onStart");
    }

    protected void onPause() {
        super.onPause();
        Log.d("Hola mundo", "onPause");
    }

    protected void onRestart() {
        super.onRestart();
        Log.d("Hola mundo", "onRestart");
    }

    protected void onStop() {
        super.onStop();
        Log.d("Hola mundo", "onStop");
    }

    protected void onResume() {
        super.onResume();
        Log.d("Hola mundo", "onResume");
    }

    protected void onDestroy() {
        super.onDestroy();
        Log.d("Hola mundo", "onDestroy");
    }



    public void abrirAcercDe(){
        Log.d(tag,"Confirmar si llama a funcion");
        Intent intent = new Intent (this,AcercaDe.class);
        startActivity(intent);
    }

}
