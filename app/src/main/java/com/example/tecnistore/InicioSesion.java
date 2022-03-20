package com.example.tecnistore;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;




import android.content.Intent;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.Volley;
import com.example.tecnistore.adapter.LoginAdapter;
import com.example.tecnistore.modelo.Login;
import com.example.tecnistore.validaciones.Validacion_user;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;


public class InicioSesion extends AppCompatActivity implements Validacion_user{


    public static ArrayList<Login> arrayDatos =new ArrayList<Login>();


    private ProgressBar progressBar;
    private TextView txtUsuario,txtClave;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio_sesion);
        Button btn_ingresa = findViewById(R.id.btn_inicio_sesion);
        txtUsuario = findViewById(R.id.textUsuario);
        txtClave = findViewById(R.id.txt_clave);
        progressBar=findViewById(R.id.progressBar);

        //LoginAdapter service=new LoginAdapter(this,InicioSesion.this).execute(txtUsuario.getText(),txtClave.getText(),3000);

        btn_ingresa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                obtenerDatos();
                new LoginAdapter(InicioSesion.this).execute(txtUsuario.getText(), txtClave.getText(), 3000);

            }
        });

    }

    private void obtenerDatos(){

        // String direccion="https://jsonplaceholder.typicode.com/posts";
        String direccion="https://tecnistoreaapi.rj.r.appspot.com/usuario/read";

        JsonArrayRequest jsonArrayRequest= new JsonArrayRequest(direccion, new Response.Listener<JSONArray>() {
            @Override
            public void onResponse(JSONArray response) {
                pasarJson(response);
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(getApplicationContext(), error.getMessage(),Toast.LENGTH_LONG).show();
            }
        });
        Request<JSONArray> add = Volley.newRequestQueue(this).add(jsonArrayRequest);


    }

    private void pasarJson( JSONArray array) {


        for (int i = 0; i < array.length(); i++) {
            Login post = new Login();
            JSONObject json;
            try {
                json = array.getJSONObject(i);
                post.setUsuario(json.getString("usuario"));
                post.setClave(json.getString("clave"));
                post.setClave(json.getString("tipoUsuario"));
                arrayDatos.add(post);

            } catch (JSONException e) {
                e.printStackTrace();
            }
        }

    }


    @Override
    public void toggleProgressBar(boolean status) {
        if (status) {
            progressBar.setVisibility(View.VISIBLE);
        } else {
            progressBar.setVisibility(View.GONE);
        }

    }

    @Override
    public void lanzarActividad(Class<?> tipoActividad) {
        Intent intent = new Intent(this, tipoActividad);
        startActivity(intent);
    }

    @Override
    public void showMessage(String msg) {
        Toast.makeText(this, msg, Toast.LENGTH_LONG).show();

    }


}
