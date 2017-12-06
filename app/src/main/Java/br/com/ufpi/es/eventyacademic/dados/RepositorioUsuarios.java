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

    //Insere usuarios no array para testes
    public void popoulaRepositorioUsuarios(){
        Usuario usuario1 = new Usuario();
        usuario1.setUsername("EliSilva");
        usuario1.setEmail("elineide.silva.inf@gmail.com");
        usuario1.setSenha("123");
        usuario1.setNome("Elineide Silva");
        usuario1.setCPF("12345678");



        Usuario usuario2 = new Usuario();
        usuario2.setUsername("gustavo");
        usuario2.setEmail("gustavo@gmail.com");
        usuario2.setSenha("12345");
        usuario2.setNome("Gustavo");
        usuario2.setCPF("666");

        Usuario usuario3 = new Usuario();
        usuario1.setUsername("peixe");
        usuario1.setEmail("peixe@gmail.com");
        usuario1.setSenha("1111");
        usuario1.setNome("quem dera ser um peixe");
        usuario1.setCPF("1111");

        Usuario usuario4 = new Usuario();
        usuario1.setUsername("segundo");
        usuario1.setEmail("2@gmail.com");
        usuario1.setSenha("123");
        usuario1.setNome("Elineide Silva");
        usuario1.setCPF("12345678");

        inserir(usuario1);
        inserir(usuario2);
        inserir(usuario3);
        inserir(usuario4);
    }



}
