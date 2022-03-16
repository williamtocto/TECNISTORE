package com.example.tecnistore.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tecnistore.R;
import com.example.tecnistore.modelo.Producto;
import com.squareup.picasso.Picasso;

import java.util.List;

public class ProductoAdapter extends RecyclerView.Adapter<ProductoAdapter.ProductoViewHolder>{

    Context context;
    List<Producto> prodcutoList;

    public ProductoAdapter(Context context, List<Producto> prodcutoList) {
        this.context = context;
        this.prodcutoList = prodcutoList;
    }

    @NonNull
    @Override
    public ProductoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.lista_productos, parent, false);

        return new ProductoViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProductoViewHolder holder, int position) {
        holder.nombreProdcuto.setText(prodcutoList.get(position).getNombre());
        holder.detalleProducto.setText(prodcutoList.get(position).getDescripcion());
        holder.precioProdcuto.setText(String.valueOf(prodcutoList.get(position).getPrecio()));

        Picasso.get()
                .load(prodcutoList.get(position).getFotoUrl())
                .error(R.mipmap.ic_launcher)
                .into(holder.productoImg);
    }

    @Override
    public int getItemCount() {
        return prodcutoList.size();
    }

    public static class ProductoViewHolder extends RecyclerView.ViewHolder{

        ImageView productoImg;
        TextView nombreProdcuto;
        TextView detalleProducto;
        TextView precioProdcuto;

        public ProductoViewHolder(@NonNull View itemView) {
            super(itemView);

            productoImg = itemView.findViewById(R.id.imgProducto);
            nombreProdcuto= itemView.findViewById(R.id.txtNombreProducto);
            detalleProducto= itemView.findViewById(R.id.txtDetalleProdcuto);
            precioProdcuto= itemView.findViewById(R.id.txtPrecioProducto);

        }
    }
}
