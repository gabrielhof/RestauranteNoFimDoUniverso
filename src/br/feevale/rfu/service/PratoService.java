package br.feevale.rfu.service;

import br.feevale.rfu.model.Prato;
import br.feevale.rfu.model.list.Pratos;

public interface PratoService {

	public void save(Prato prato);
	
	public Pratos listAll();
	
}
