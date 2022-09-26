package com.grupo1.act1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Recibe extends AppCompatActivity {
    TextView tx1;
    TextView tx2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recibe);
        tx1=(TextView) findViewById(R.id.txnombre);
        tx2=(TextView) findViewById(R.id.txapellido);
        String nombre=getIntent().getStringExtra("sends");
        String apellido=getIntent().getStringExtra("send2");;
        tx1.setText(nombre);
        tx2.setText(apellido);
    }
}