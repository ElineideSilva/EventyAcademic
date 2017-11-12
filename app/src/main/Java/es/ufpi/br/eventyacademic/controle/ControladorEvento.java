package es.ufpi.br.eventyacademic.controle;

import java.util.ArrayList;
import java.util.Date;

import es.ufpi.br.eventyacademic.dados.*;


public class ControladorEvento {
    RepositorioEventos r = new RepositorioEventos();
    Evento e;

    /**
     * Verifica se existe um evento cadastrado com os dados informados,
     * em caso negativo, cadastra o novo evento
     */

    public boolean cadastraEvento(String nome, String local, int tipo, Date data_inicio,
                                  Date data_fim, Usuario organizador, ArrayList<Usuario> participantes){

        if(r.buscar(nome) == null){
            e = new Evento(nome, local, tipo, data_inicio, data_fim, organizador, participantes);
            r.inserir(e);
        }else{
            return false;
        }
        return true;
    }

    public Evento buscarEvento(String nome){

        return r.buscar(nome);

    }
}
