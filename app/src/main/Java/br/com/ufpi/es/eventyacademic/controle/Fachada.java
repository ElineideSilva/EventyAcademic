package br.com.ufpi.es.eventyacademic.controle;

import android.app.Application;

import br.com.ufpi.es.eventyacademic.dados.Usuario;

/**
 * Created by eline on 13/11/2017.
 */
public class Fachada extends Application {


    private static Fachada singleton=null;

    private ControladorCadastro cu;
    private ControladorEvento cv;
    private ControladorLogin cc;
    private ControladorMinicurso cg;
    private ControladorPalestra cp;
    private ControladorWokshop cW;

    public Fachada() {
        cu = new ControladorCadastro();
        cv = new ControladorEvento();
        cc = new ControladorLogin();
        cg = new ControladorMinicurso();
        cp = new ControladorPalestra();
        cW = new ControladorWokshop();
    }

    /**
     * Uso do padrão singleton para garantir que a Fachada é única para toda a aplicação
     * @return
     */
    public static Fachada getIntance(){
        if (singleton == null){
            singleton = new Fachada();
        }
        return singleton;
    }

    /*
    Insere usuário via ControladorUsuario
     */
    public void inserirUsuario(Usuario u){
        cu.incluirUsuario(u);
    }

    /*
    Faz a busca de um usuário dado um e-mail
     */
    public Usuario buscarUsuarioEmail(String email){
      return cu.carregarDadosUsuario(email);
    }

    /**
     * Popula usuários aleatórios no repositório para efeito de testes
     */
    //public void populaUsuarios(){
     //   cu.popular();
   // }

    /**
     * Lista todos os usuários cadastrados
     */
    public void listarUsuarios(){
        //TODO implementar listarUsuarios
    }

    /**
     * Altera um usuários
     * @param original dados originais
     * @param novo novos dados do usuário
     */
    public void alterarUsuario(Usuario original, Usuario novo){
        //TODO implementar alterarUsuario
    }

    /**
     * Dado um usuário retorna todas as suas viagens cadastradas
     * @param usuario Usuarios
     * @return lista com todas as vigens do usuário
     */



}