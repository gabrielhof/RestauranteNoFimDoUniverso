package br.feevale.rfu.service;

import br.feevale.rfu.model.Pedido;
import br.feevale.rfu.model.list.Pedidos;

public interface PedidoService {

	public void save(Pedido pedido);
	
	public Pedidos listAll();
	
}
