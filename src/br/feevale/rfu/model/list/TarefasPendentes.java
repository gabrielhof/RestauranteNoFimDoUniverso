package br.feevale.rfu.model.list;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import br.feevale.rfu.model.Bean;
import br.feevale.rfu.model.TarefasPendente;

@SuppressWarnings("serial")
@XmlRootElement
public class TarefasPendentes extends Bean {

	private List<TarefasPendente> tarefasPendetes;
	
	public List<TarefasPendente> getTarefasPendetes() {
		return tarefasPendetes;
	}
	
	public void setTarefasPendetes(List<TarefasPendente> tarefasPendetes) {
		this.tarefasPendetes = tarefasPendetes;
	}
	
	public void add(TarefasPendente tarefaPendente) {
		if (tarefasPendetes == null) {
			setTarefasPendetes(new ArrayList<TarefasPendente>());
		}
		
		tarefasPendetes.add(tarefaPendente);
	}
	
}
