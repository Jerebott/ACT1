package com.grupo1.act1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public EditText nom;
    public EditText ap;
    private Button b;
    //hola
    String a;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nom = (EditText)findViewById(R.id.Nom);
        ap = (EditText)findViewById(R.id.Ap);
        b = (Button) findViewById(R.id.enviar);

    }
    public void enviar(View a){
        Intent sgte= new Intent(this,Recibe.class);
        sgte.putExtra("sends",nom.getText().toString());
        sgte.putExtra("send2",ap.getText().toString());
        startActivity(sgte);
        Toast.makeText(this, "Enviado con exito", Toast.LENGTH_SHORT).show();
    }
}