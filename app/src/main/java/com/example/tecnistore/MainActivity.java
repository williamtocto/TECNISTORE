package com.example.tecnistore;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import com.bumptech.glide.Glide;

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
    //
        String urlGif = "https://lh3.googleusercontent.com/57jQwxUNbJzbqp16Ilds16xRKOxmlWfnAjQIvczZm4e1zjPCEeb-5XR4tgfQd77X8oh9ZUfULX216NwL5Gy015MpNCbMIfJ3Wvdrhq0EElxj7zCERVq9rYR529XLwaoj7n2ZDqhkc8aGXbzK0hDmnNvto2GTj04idk1j3g6vm_WP6wuM_sOoYyKMhXGvZBksrStKDLoiZvP78rnNhCBvy1pRA8yYIDQNmw5nf6K6Qs1wa_FBGCCOfNR70l5JAX9xwF6jdUI0yNsWVZaKAEXkVclsTAHBtE7NonTMWacD4XKVy-jYOzxVW-s0v5JeWowpiSqXUBMbqJoWBMjXl2pSwh7g4Wb0kvr3OWqp3vhs6E_Pa8Q-gY7Gohk-VmSGK8_L_BIwPj_Vv4YZ3FxVqM1VDGUgLFebEs-r0lg8M533aPkbnSYiycIk5UXij_AcNYSkCVLxDDrjU0f8ffZzyG2IhNsDIxRuYraONg7jc2f66DiiIndgaofh44iUF6EzJC_StacXiI-1zu94cp9wqwY_xybYaIey80MsStZnRpQ2UtiJpFQOTAOQssJCr2oRcDqqNPzIgkmxWLNvhBqj-5jOnJuMZo7czDVwgvd6_LUK5oPmfMESxEWKUrDZQ2py1Ic9IswS3y1mwUCa4prQXhdUpngrPFWlaE5u-vMVYpPHNLLq5PSc2xi_ngqJEa-Ih7msrVRf3JSlNk5Tl3An9XwQ98ic=w391-h220-no?authuser=0";
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