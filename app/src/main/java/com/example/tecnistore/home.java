package com.example.tecnistore;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.example.tecnistore.adapter.CategoryAdapter;
import com.example.tecnistore.api.servicioApi;
import com.example.tecnistore.modelo.Categoria;


import java.util.ArrayList;
import java.util.List;

import static com.example.tecnistore.R.drawable.*;

public class home extends AppCompatActivity {

    RecyclerView discountRecyclerView, categoryRecyclerView, recyclerViewProdcutos, list_categorias;

    CategoryAdapter categoryAdapter;
    List<Categoria> categoryList;

    TextView allCategory;

    public static String VARIABLE_GLOBAL= "bde7-170-246-87-193";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        /*Llamado del componete*/
        list_categorias = findViewById(R.id.list_categorias);
        recyclerViewProdcutos= findViewById(R.id.listProductos);

        /*Cargo info de las categorias*/
        categoryList = new ArrayList<>();
        categoryList.add(new Categoria(1, ico_categoria_celular));
        categoryList.add(new Categoria(2, ic_home_fruits));
        categoryList.add(new Categoria(3, ic_home_fruits));
        categoryList.add(new Categoria(4, ic_home_fruits));
        categoryList.add(new Categoria(5, ic_home_fruits));
        categoryList.add(new Categoria(6, ic_home_fruits));

        setCategoryRecycler(categoryList);
        servicioApi service= new servicioApi(this,recyclerViewProdcutos);


    }

    private void setCategoryRecycler(List<Categoria> categoryDataList) {
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        list_categorias.setLayoutManager(layoutManager);
        categoryAdapter = new CategoryAdapter(this,categoryDataList);
        list_categorias.setAdapter(categoryAdapter);
    }

    public void enviarMensaje(View view){

        Intent window_mensaje= new Intent(this, home.class);
        startActivity(window_mensaje);
    }


}