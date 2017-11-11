package es.ufpi.br.eventyacademic.dados;

import java.util.LinkedList;
import java.util.List;


public class RepositorioEventos {
	
static List<Evento> listaEve = new LinkedList<Evento>();
	
	/**
	 * Dado um evento este � inserido na lista de eventos
	 */
	public void inserir(Evento u) {
		listaEve.add(u);
	}

	/**
	 * Retorna a lista de eventos
	 */
	public List<Evento> listar() {
		return listaEve;
	}
	
	/**
	 * busca um evento pelo nome
	 * @param nome nome do evento desejado  para procura
	 * @return retorna o evento se ele existir
	 */

	public Evento buscar(String nome) {		
		Evento evento=null;
		//percorre toda a lista e checa se o evento existe
		for(Evento u:listaEve){
			if (u.getNome().equals(nome) ){
				evento = u;
				return evento;
			}
		}
		return evento;
	}
	
	
	
	/**
	 * Remove um evento da base de dados
	 * @param u Evento a ser removido
	 */

	public void remover(Evento u) {
		listaEve.remove(u);
		
	}



}
