package br.com.ufpi.es.eventyacademic.controle;

import br.com.ufpi.es.eventyacademic.dados.RepositorioUsuarios;
import br.com.ufpi.es.eventyacademic.dados.*;


public class ControladorLogin {

    Usuario u;
    RepositorioUsuarios r = new RepositorioUsuarios();

    /**
     * Verifica se existe um usuario cadastrado com os dados informados,
     * em caso positivo, verifica se a senha informada está correta
     */

    public boolean realizaLogin(String nome, String senha) {

        u = r.buscar(nome);
        if(u == null)
            return false;
        else
        if(u.getSenha().equals(senha) == false)
            return false;
        return true;

    }
}
