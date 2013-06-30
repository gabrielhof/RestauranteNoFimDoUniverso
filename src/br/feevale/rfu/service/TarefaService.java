package br.feevale.rfu.service;

import br.feevale.rfu.model.Prato;
import br.feevale.rfu.model.Tarefa;
import br.feevale.rfu.model.list.Tarefas;

public interface TarefaService {

	public void save(Tarefa tarefa);
	
	public Tarefas listAll();
	
	public Tarefas getTarefas(Prato prato);
	
}
