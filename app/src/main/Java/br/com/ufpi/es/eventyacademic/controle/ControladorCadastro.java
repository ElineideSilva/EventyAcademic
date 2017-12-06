package br.com.ufpi.es.eventyacademic.controle;

import br.com.ufpi.es.eventyacademic.dados.RepositorioUsuarios;
import br.com.ufpi.es.eventyacademic.dados.*;

public class ControladorCadastro {
    Usuario u;
    RepositorioUsuarios r = new RepositorioUsuarios();

    /**
     * Verifica se existe um usuario cadastrado com os dados informados,
     * em caso negativo, cadastra o novo usuario
     */

    public boolean incluirUsuario(Usuario u){

        if(r.buscar(u.getEmail()) == null){
            //u = new Usuario(u.getUsername(),u.getNome(), u.getEmail(), u.getEmail(), u.getCPF(), u.getCPF());
            r.inserir(u);
        }else{
            return false;
        }
        return true;

    }

    /**
     * Dado um email retorna os dados do usuario
     * @param email email do usuario
     * @return usuario
     */
    public Usuario carregarDadosUsuario(String email){
        Usuario usuario = new Usuario();

        //Recupera informacoes do repositorio ou servico de base de usuarios
        usuario = r.buscar(email);

        if (usuario != null){
            return usuario;
        }else {
            return null;
        }
    }

    //Inseri alguns usuarios no array para testes
    public void popular(){
        r.popoulaRepositorioUsuarios();
    }
}
