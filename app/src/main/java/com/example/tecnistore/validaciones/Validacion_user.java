package com.example.tecnistore.validaciones;

public interface Validacion_user {
    void toggleProgressBar(boolean status);
    void lanzarActividad(Class<?> tipoActividad);
    void showMessage(String msg);
}
