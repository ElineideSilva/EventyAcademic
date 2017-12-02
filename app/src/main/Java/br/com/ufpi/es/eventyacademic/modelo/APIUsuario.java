package br.com.ufpi.es.eventyacademic.modelo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class APIUsuario {

    @SerializedName("data")
    @Expose
    private Usuario data;

    public Usuario getData() {
        return data;
    }
    public void setData(Usuario data) {
        this.data = data;
    }

}
