package es.ufpi.br.eventyacademic.dados;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by Laftel on 10/11/2017.
 */

public class Usuario {
    private String Username;
    private String Email;
    private String Senha;
    private String Nome;
    private String CPF;
    private static final int Tipo = 0;
    private ArrayList<Evento> Eventos;
    private Date Nascimento;

    public Usuario (String User, String Email, String Senha, String Nome, String CPF, Date Nascimento){
        this.Username = User;
        this.Email = Email;
        this.Senha = Senha;
        this.Nome = Nome;
        this.CPF = CPF;
        this.Nascimento = Nascimento;
    }

    public static int getTipo() {
        return Tipo;
    }


    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getSenha() {
        return Senha;
    }

    public void setSenha(String senha) {
        Senha = senha;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public ArrayList<Evento> getEventos() {
        return Eventos;
    }

    public void setEventos(ArrayList<Evento> eventos) {
        Eventos = eventos;
    }

    public Date getNascimento() {
        return Nascimento;
    }

    public void setNascimento(Date nascimento) {
        this.Nascimento = nascimento;
    }
}