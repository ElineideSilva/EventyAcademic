package br.com.ufpi.es.eventyacademic.controle;

import br.com.ufpi.es.eventyacademic.dados.RepositorioEventos;
import br.com.ufpi.es.eventyacademic.dados.Usuario;
import br.com.ufpi.es.eventyacademic.dados.Workshop;

import java.util.Date;

/**
 * Created by eline on 11/11/2017.
 */

public class ControladorWokshop {
    Workshop w;
    RepositorioEventos r = new RepositorioEventos();

    /**
     * Verifica se existe um usuario cadastrado com os dados informados,
     * em caso negativo, cadastra o novo usuario
     */

    public boolean incluirMinicurso(String Nome, Date datainicio,
                                    Date dataFim, Usuario apresentador){

        if(r.buscar(Nome) == null){
            w = new Workshop(Nome, datainicio, dataFim, apresentador);
            r.inserirWorkshop(w);
        }else{
            return false;
        }
        return true;

    }
}
