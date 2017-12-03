package br.com.ufpi.es.eventyacademic.dados;

import java.util.ArrayList;
import java.util.Date;

public class Evento {
	
	private String nome;
	private String local;
	private int tipo;
	private Date data_inicio;
	private Date data_fim;
	private Usuario organizador;
	private ArrayList<Usuario> participantes;
	//private Calendario calendario;
	
	
	public Evento(String nome, String local, int tipo, Date data_inicio, Date data_fim, Usuario organizador) {
		super();
		this.nome = nome;
		this.local = local;
		this.tipo = tipo;
		this.data_inicio = data_inicio;
		this.data_fim = data_fim;
		this.organizador = organizador;
		this.participantes = new ArrayList<Usuario>();
	}


	
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getLocal() {
		return local;
	}


	public void setLocal(String local) {
		this.local = local;
	}


	public int getTipo() {
		return tipo;
	}


	public void setTipo(int tipo) {
		this.tipo = tipo;
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


	public Usuario getOrganizador() {
		return organizador;
	}


	public void setOrganizador(Usuario organizador) {
		this.organizador = organizador;
	}


	public ArrayList<Usuario> getParticipantes() {
		return participantes;
	}


	public void setParticipantes(Usuario novousuario) {
		participantes.add(novousuario);
	}
	
}
