package br.feevale.rfu.service;

import br.feevale.rfu.model.TarefasPendente;

public interface TarefaPendenteService {

	public void save(TarefasPendente tarefaPendente);
	
	public TarefasPendente[] listAll();
	
}
