package br.feevale.rfu.model.list;

import java.util.ArrayList;
import java.util.List;

import br.feevale.rfu.model.Tarefa;

public class Tarefas {

	private List<Tarefa> tarefas;
	
	public List<Tarefa> getTarefas() {
		return tarefas;
	}
	
	public void setTarefas(List<Tarefa> tarefas) {
		this.tarefas = tarefas;
	}
	
	public void add(Tarefa tarefa) {
		if (tarefas == null) {
			setTarefas(new ArrayList<Tarefa>());
		}
		
		tarefas.add(tarefa);
	}
	
}
