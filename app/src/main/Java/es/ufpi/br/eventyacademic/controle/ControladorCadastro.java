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

    public boolean incluirUsuario(String User, String Email,
                                  String Senha, String Nome, String CPF, Date Nascimento){

        if(r.buscar(Nome) == null){
            u = new Usuario(User, Email, Senha, Nome, CPF, Nascimento);
            r.inserir(u);
        }else{
            return false;
        }
        return true;

    }
}
