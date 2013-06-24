package br.feevale.rfu.service;

import br.feevale.rfu.model.Pedido;

public interface PedidoService {

	public void save(Pedido pedido);
	
	public Pedido[] listAll();
	
}
