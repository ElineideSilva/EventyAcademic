package es.ufpi.br.eventyacademic.controle;

import es.ufpi.br.eventyacademic.dados.Minicurso;
import es.ufpi.br.eventyacademic.dados.Palestra;
import es.ufpi.br.eventyacademic.dados.RepositorioEventos;
import es.ufpi.br.eventyacademic.dados.Usuario;

import java.util.Date;

/**
 * Created by eline on 11/11/2017.
 */

public class ControladorPalestra {
    Palestra p;
    RepositorioEventos r = new RepositorioEventos();

    /**
     * Verifica se existe um usuario cadastrado com os dados informados,
     * em caso negativo, cadastra o novo usuario
     */

    public boolean incluirMinicurso(String Nome, Date datainicio,
                                    Date dataFim, Usuario palestrante){

        if(r.buscar(Nome) == null){
            p = new Palestra(Nome, datainicio, dataFim, palestrante);
            r.inserirPalestra(p);
        }else{
            return false;
        }
        return true;

    }
}
