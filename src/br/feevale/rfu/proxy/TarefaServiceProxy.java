package br.feevale.rfu.proxy;

import br.feevale.rfu.model.Prato;
import br.feevale.rfu.model.Tarefa;
import br.feevale.rfu.model.list.Tarefas;
import br.feevale.rfu.service.TarefaService;
import br.feevale.rfu.utils.ServiceUtils;

public class TarefaServiceProxy implements TarefaService {

	@Override
	public void save(Tarefa tarefa) {
		ServiceUtils.request("/Tarefa/save", tarefa, String.class);
	}

	@Override
	public Tarefas listAll() {
		Tarefas tarefas = ServiceUtils.request("/Tarefa/listAll", Tarefas.class);
		return tarefas;
	}

	@Override
	public Tarefas getTarefas(Prato prato) {
		Tarefas tarefas = ServiceUtils.request("/Tarefa/getTarefas", prato, Tarefas.class);
		return tarefas;
	}

}
