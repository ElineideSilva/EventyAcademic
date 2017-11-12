package es.ufpi.br.eventyacademic.controle;

import es.ufpi.br.eventyacademic.dados.RepositorioEventos;
import es.ufpi.br.eventyacademic.dados.Usuario;
import es.ufpi.br.eventyacademic.dados.Workshop;

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
