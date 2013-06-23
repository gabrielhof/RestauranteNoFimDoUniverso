package br.feevale.rfu.service;

import br.feevale.rfu.model.Prato;
import br.feevale.rfu.model.Tarefa;

public interface TarefaService {

	public void save(Tarefa tarefa);
	
	public Tarefa[] listAll();
	
	public Tarefa[] getTarefas(Prato prato);
	
}
