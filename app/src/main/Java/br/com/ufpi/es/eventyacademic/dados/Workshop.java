package br.com.ufpi.es.eventyacademic.dados;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by eline on 11/11/2017.
 */
public class Workshop {
    private String nome;
    private Date data_inicio;
    private Date data_fim;
    private Usuario apresentador;
    private ArrayList<Usuario> participantes;

    public Workshop(String nome,Date data_inicio, Date data_fim, Usuario apresentador) {
        super();
        this.nome = nome;
        this.data_inicio = data_inicio;
        this.data_fim = data_fim;
        this.apresentador = apresentador;
        this.participantes = null;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getData_inicio() {
        return data_inicio;
    }

    public void setData_inicio(Date data_inicio) {
        this.data_inicio = data_inicio;
    }

    public Date getData_fim() {
        return data_fim;
    }

    public void setData_fim(Date data_fim) {
        this.data_fim = data_fim;
    }

    public Usuario getapresentador() {
        return apresentador;
    }

    public void setapresentador(Usuario ministrante) {
        this.apresentador = ministrante;
    }

    public ArrayList<Usuario> getParticipantes() {
        return participantes;
    }

    public void setParticipantes(ArrayList<Usuario> participantes) {
        this.participantes = participantes;
    }
}
