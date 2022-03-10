package com.example.tecnistore;

import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.example.tecnistore.adapter.CategoryAdapter;
import com.example.tecnistore.modelo.Categoria;

import java.util.ArrayList;
import java.util.List;

import  static com.example.tecnistore.R.drawable.*;

public class MainActivity extends AppCompatActivity {

    RecyclerView list_categorias;

    CategoryAdapter categoryAdapter;
    List<Categoria> categoryList;

    TextView allCategory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*Llamado del componete*/
        list_categorias = findViewById(R.id.list_categorias);
        allCategory = findViewById(R.id.ver_mas);

        /*Cargo info de las categorias*/
        categoryList = new ArrayList<>();
        categoryList.add(new Categoria(1, ico_categoria_celular));
        categoryList.add(new Categoria(2, ico_categoria_celular));
        categoryList.add(new Categoria(3, ico_categoria_celular));
        categoryList.add(new Categoria(4, ico_categoria_celular));
        categoryList.add(new Categoria(5, ico_categoria_celular));
        categoryList.add(new Categoria(6, ico_categoria_celular));

        setCategorias(categoryList);
    }

    private void setCategorias(List<Categoria> categoryDataList) {
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        list_categorias.setLayoutManager(layoutManager);
        categoryAdapter = new CategoryAdapter(this,categoryDataList);
        list_categorias.setAdapter(categoryAdapter);

        /*
        dsnuajdkjanjnjkasd
         */
        //soy danny
    }
}