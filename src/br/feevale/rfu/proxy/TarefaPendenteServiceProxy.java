package br.feevale.rfu.proxy;

import br.feevale.rfu.model.TarefasPendente;
import br.feevale.rfu.model.list.TarefasPendentes;
import br.feevale.rfu.service.TarefaPendenteService;
import br.feevale.rfu.utils.ServiceUtils;

public class TarefaPendenteServiceProxy implements TarefaPendenteService {

	@Override
	public void save(TarefasPendente tarefaPendente) {
		ServiceUtils.request("/TarefaPendente/save", tarefaPendente, String.class);
	}

	@Override
	public TarefasPendentes listAll() {
		TarefasPendentes tarefasPendentes = ServiceUtils.request("/Prato/save", TarefasPendentes.class);
		return tarefasPendentes;
	}

}
