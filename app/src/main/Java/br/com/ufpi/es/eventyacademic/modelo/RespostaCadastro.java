package br.com.ufpi.es.eventyacademic.modelo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RespostaCadastro {

    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("data")
    @Expose
    private Usuario data;
    @SerializedName("errors")
    @Expose
    private Errors errors;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Usuario getData() {
        return data;
    }

    public void setData(Usuario data) {
        this.data = data;
    }

    public Errors getErrors() {
        return errors;
    }

    public void setErrors(Errors errors) {
        this.errors = errors;
    }

}