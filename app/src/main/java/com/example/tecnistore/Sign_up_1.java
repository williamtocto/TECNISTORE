package com.example.tecnistore;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class Sign_up_1 extends AppCompatActivity {

    private Button btn_prueba;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_1);

        btn_prueba= findViewById(R.id.btn_siguiente_nombres);

        btn_prueba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewHome();
            }
        });

    }

    private void viewHome(){
        Intent view= new Intent(this, home.class);
        startActivity(view);
    }

}