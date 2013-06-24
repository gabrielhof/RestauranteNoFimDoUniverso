package br.feevale.rfu.service;

import br.feevale.rfu.model.Prato;

public interface PratoService {

	public void save(Prato prato);
	
	public Prato[] listAll();
	
}
