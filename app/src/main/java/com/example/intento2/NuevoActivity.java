package com.example.intento2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.intento2.db.DbDatadex;

public class NuevoActivity extends AppCompatActivity {

    EditText txtNombre, txtNumero, txtRegion;
    Button btnGuarda;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nuevo);
        txtNombre  = findViewById(R.id.txtNombre);
        txtNumero  = findViewById(R.id.editTextNumber);
        txtRegion  = findViewById(R.id.txtRegion);
        btnGuarda = findViewById(R.id.btnGuarda);

        btnGuarda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DbDatadex dbDatadex = new DbDatadex(NuevoActivity.this);
                dbDatadex.insertarDatadex(txtNombre.getText().toString(),txtNumero.getText().toString(), txtRegion.getText().toString());

            }
        });

    }
}