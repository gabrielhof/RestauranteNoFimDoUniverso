package br.feevale.rfu.service;

import br.feevale.rfu.model.TarefasPendente;
import br.feevale.rfu.model.list.TarefasPendentes;

public interface TarefaPendenteService {

	public void save(TarefasPendente tarefaPendente);
	
	public TarefasPendentes listAll();
	
}
