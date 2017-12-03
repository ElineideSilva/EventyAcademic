package br.com.ufpi.es.eventyacademic.controle;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;

import br.com.ufpi.es.eventyacademic.dados.Evento;
import br.com.ufpi.es.eventyacademic.dados.RepositorioEventos;
import br.com.ufpi.es.eventyacademic.dados.*;


public class ControladorEvento {
    RepositorioEventos r = new RepositorioEventos();
    RepositorioUsuarios ru = new RepositorioUsuarios();
    Evento e;

    /**
     * Verifica se existe um evento cadastrado com os dados informados,
     * em caso negativo, cadastra o novo evento
     */

    public boolean cadastraEvento(String nome, String local, int tipo, Date data_inicio,
                                  Date data_fim, Usuario organizador){

        if(r.buscar(nome) == null){
            e = new Evento(nome, local, tipo, data_inicio, data_fim, organizador);
            r.inserir(e);
        }else{
            return false;
        }
        return true;
    }

    public Evento consultarEvento(String nome){

        return r.buscar(nome);

    }
    
    public List<Evento> verTodosEventos(){
    	
    	return r.listar();
    	
    }

    /**
     * Recebe o email do usuario que quer se inscrever e o nome do evento.
     * Verifica se o mesmo já está inscrito no evento, em caso positivo retorna false,
     * em caso negativo adiciona na lista de participantes do evento e retorna true
     */

    public boolean increverNoEvento(String email, String nomedoevento) {
    	
    	Evento e = r.buscar(nomedoevento);
    	Usuario u = ru.buscar(email);
    	
    	if(e.getParticipantes().contains(u))
    		return false;
    	
    	e.setParticipantes(u);
    	return true;
    	
    }
    
}
