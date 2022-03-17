package com.example.tecnistore;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import com.bumptech.glide.Glide;
import com.example.tecnistore.R;
import com.example.tecnistore.Sign_up_1;

public class MainActivity extends AppCompatActivity {
    private Button btn_signUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla_inicio);
        startPresentacion();

        btn_signUp= findViewById(R.id.btn_sign_up);

        btn_signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewIngresoNombres();
            }
        });
    }

    private void startPresentacion(){

        String urlGif = "https://cdn.fbsbx.com/v/t59.2708-21/273296501_495643082001960_5288339092571745465_n.gif?_nc_cat=111&ccb=1-5&_nc_sid=041f46&_nc_ohc=fmhz_xB321oAX-2zIpt&_nc_ht=cdn.fbsbx.com&oh=03_AVJ4R5sNotRnWRnMpFW5eYWS3cftf6ZPDEXl5YI5Sv7ESw&oe=623400A9";
        //Agregar implementacion Glide dentro de archivo build.gradle.
        ImageView imageView = (ImageView)findViewById(R.id.gifView);
        Uri uri = Uri.parse(urlGif);
        Glide.with(getApplicationContext()).load(uri).into(imageView);
    }

    private void viewIngresoNombres(){

        Intent view_signUp1= new Intent(this, Sign_up_1.class);
        startActivity(view_signUp1);

    }
}