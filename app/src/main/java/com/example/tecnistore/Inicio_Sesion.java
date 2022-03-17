package com.example.tecnistore;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;




import android.content.Intent;

import android.widget.Toast;

import com.example.tecnistore.adapter.LoginAdapter;
import com.example.tecnistore.validaciones.Validacion_user;

public class Inicio_Sesion extends AppCompatActivity {

private ProgressBar progressBar;
private Button btn_ingresa;
private TextView txtUsuario,txtClave;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio_sesion);
        progressBar=findViewById(R.id.progressBar);
        btn_ingresa=findViewById(R.id.btn_sign_up);
        txtUsuario=findViewById(R.id.textUsuario);
        txtClave=findViewById(R.id.txt_clave);

        btn_ingresa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new LoginAdapter((Validacion_user) Inicio_Sesion.this).execute(txtUsuario.getText().toString(),
                        txtClave.getText().toString(), 3000);
            }
        });

    }


    public void toggleProgressBar(boolean status) {
        if (status) {
            progressBar.setVisibility(View.VISIBLE);
        } else {
            progressBar.setVisibility(View.GONE);
        }
    }


    public void lanzarActividad(Class<?> tipoActividad) {
        Intent intent = new Intent(this, tipoActividad);
        startActivity(intent);
    }


    public void showMessage(String msg) {
        Toast.makeText(this, msg, Toast.LENGTH_LONG).show();
    }
}