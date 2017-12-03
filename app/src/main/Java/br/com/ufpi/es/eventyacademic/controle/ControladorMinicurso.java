package br.com.ufpi.es.eventyacademic.controle;

import br.com.ufpi.es.eventyacademic.dados.RepositorioEventos;
import br.com.ufpi.es.eventyacademic.dados.RepositorioUsuarios;
import br.com.ufpi.es.eventyacademic.dados.Usuario;
import br.com.ufpi.es.eventyacademic.dados.Evento;
import br.com.ufpi.es.eventyacademic.dados.Minicurso;

import java.util.Date;

/**
 * Created by eline on 11/11/2017.
 */

public class ControladorMinicurso {

    Minicurso mini;
    RepositorioEventos r = new RepositorioEventos();
    RepositorioUsuarios ru = new RepositorioUsuarios();

    /**
     * Verifica se existe um usuario cadastrado com os dados informados,
     * em caso negativo, cadastra o novo usuario
     */

    public boolean incluirMinicurso(String Nome, Date datainicio,
                                  Date dataFim, Usuario ministrante){

        if(r.buscarminicurso(Nome) == null){
            mini = new Minicurso(Nome, datainicio, dataFim, ministrante);
            r.inserirMinicurso(mini);
        }else{
            return false;
        }
        return true;

    }
    
public boolean increverNoMinicurso(String email, String nomedominicurso) {
    	
    	Minicurso m = r.buscarminicurso(nomedominicurso);
    	Usuario u = ru.buscar(email);
    	
    	if(m.getParticipantes().contains(u))
    		return false;
    	
    	m.setParticipantes(u);
    	return true;
    	
    }
}
