package es.ufpi.br.eventyacademic.controle;
import java.util.Date;

import es.ufpi.br.eventyacademic.dados.*;

public class ControladorCadastro {
    Usuario u;
    RepositorioUsuarios r = new RepositorioUsuarios();

    /**
     * Verifica se existe um usuario cadastrado com os dados informados,
     * em caso negativo, cadastra o novo usuario
     */

    public boolean incluirUsuario(Usuario u){

        if(r.buscar(u.getNome()) == null){
            //u = new Usuario(u.getUsername(),u.getNome(), u.getEmail(), u.getEmail(), u.getCPF(), u.getCPF());
            r.inserir(u);
        }else{
            return false;
        }
        return true;

    }
}
