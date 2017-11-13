package br.com.ufpi.es.eventyacademic.dados;


import java.util.LinkedList;
import java.util.List;

/**
 * Created by Laftel on 10/11/2017.
 */

public class RepositorioUsuarios {
    /*
    * Instanciando a Lista de Alunos
     */
    static List<Usuario> listaUse = new LinkedList<>();


    /**
     * Dado um Usuario este � inserido na lista de Usuarios
     */
    public void inserir(Usuario u) {
        listaUse.add(u);
    }

    /**
     * Retorna a lista de Usuarios
     */
    public List<Usuario> listar() {
        return listaUse;
    }

    /**
     * busca um Usuario pelo nome
     * @param email email do Usuario desejado  para procura
     * @return retorna o Usuario se ele existir
     */

    public Usuario buscar(String email) {
        Usuario Usuario=null;
        //percorre toda a lista e checa se o Usuario existe
        for(Usuario u:listaUse){
            if (u.getEmail().equals(email) ){
                Usuario = u;
                return Usuario;
            }
        }
        return Usuario;
    }



    /**
     * Remove um Usuario da base de dados
     * @param u Usuario a ser removido
     */

    public void remover(Usuario u) {
        listaUse.remove(u);

    }



}
