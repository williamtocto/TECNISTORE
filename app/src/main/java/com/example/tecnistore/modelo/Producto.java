package com.example.tecnistore.modelo;

public class Producto {

    private Long id_producto;
    private String nombre_producto;
    private int stock;
    private String url_img;
    private String detalleProducto;
    private double precioProducto;

    public Producto() {
    }

    public Producto(Long id_producto, String nombre_producto, int stock, String url_img) {
        this.id_producto = id_producto;
        this.nombre_producto = nombre_producto;
        this.stock = stock;
        this.url_img = url_img;
    }

    public Long getId_producto() {
        return id_producto;
    }

    public void setId_producto(Long id_producto) {
        this.id_producto = id_producto;
    }

    public String getNombre_producto() {
        return nombre_producto;
    }

    public void setNombre_producto(String nombre_producto) {
        this.nombre_producto = nombre_producto;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getUrl_img() {
        return url_img;
    }

    public void setUrl_img(String url_img) {
        this.url_img = url_img;
    }

    public String getDetalleProducto() {
        return detalleProducto;
    }

    public void setDetalleProducto(String detalleProducto) {
        this.detalleProducto = detalleProducto;
    }

    public double getPrecioProducto() {
        return precioProducto;
    }

    public void setPrecioProducto(double precioProducto) {
        this.precioProducto = precioProducto;
    }
}
