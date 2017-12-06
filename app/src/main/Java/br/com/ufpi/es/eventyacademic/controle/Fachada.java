package br.com.ufpi.es.eventyacademic.controle;

import java.util.ArrayList;
import java.util.List;

import br.com.ufpi.es.eventyacademic.dados.Evento;

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
     * Uso do padrÃ£o singleton para garantir que a Fachada Ã© Ãºnica para toda a aplicaÃ§Ã£o
     * @return
     */
    public static Fachada getIntance(){
        if (singleton == null){
            singleton = new Fachada();
        }
        return singleton;
    }
    
    /*
    inscreve o participante no evento usando o email do mesmo e o nome do evento
     */
    
    public boolean increverNoEvento(String email, String nomedoevento) {
    	
    	return cv.increverNoEvento(email, nomedoevento);
    	
    }

    /*
    confirma o evento
     */
    
    public boolean confirmarEvento(String nome) {
    	
    	return cv.confirmarEvento(nome);
    }
    
    /*
    retorna a lista de eventos ainda não confirmados
     */
    
    public List<Evento> verEventosPendentes(){
    	
    	return cv.verEventosPendentes();
    	
    }
    
    public List<Evento> verTodosEventos(){
    	
    	return cv.verEventosPendentes();
    	
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
     * Popula usuÃ¡rios aleatÃ³rios no repositÃ³rio para efeito de testes
     */
    public void populaUsuarios(){
        cu.popular();
    }

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
     * Dado um usuÃ¡rio retorna todas as suas viagens cadastradas
     * @param usuario Usuarios
     * @return lista com todas as vigens do usuÃ¡rio
     */



}