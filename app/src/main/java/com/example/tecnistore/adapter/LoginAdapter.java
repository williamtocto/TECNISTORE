package com.example.tecnistore.adapter;


import android.os.AsyncTask;

import com.example.tecnistore.validaciones.Validacion_user;

public class LoginAdapter extends AsyncTask <Object, Void, Boolean> {
    private Validacion_user comunicacion;

    public LoginAdapter(Validacion_user comunicacion) {
        this.comunicacion = comunicacion;
    }

    @Override
    protected void onPreExecute() {
        comunicacion.toggleProgressBar(true);
    }

    @Override
    protected Boolean doInBackground(Object... objects) {
        try {
            Thread.sleep((int)objects[2]);
            String user = (String) objects[0];
            String pass = (String) objects[1];
            if (user.equals("admin") && pass.equals("admin")){
                return true;
            }else{
                return false;
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    protected void onPostExecute(Boolean bo) {
        if (bo){
            this.comunicacion.showMessage("Datos Correctos");
            this.comunicacion.toggleProgressBar(false);
        }else{
            this.comunicacion.showMessage("Datos Incorrectos");

        }
    }


}
