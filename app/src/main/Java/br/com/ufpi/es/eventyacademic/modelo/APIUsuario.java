package br.com.ufpi.es.eventyacademic.modelo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class APIUsuario {

    @SerializedName("data")
    @Expose
    private Usuario u;

    public Usuario getData() {
        return u;
    }
    public void setData(Usuario data) {
        this.u = data;
    }

}
