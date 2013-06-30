package br.feevale.rfu.proxy;

import br.feevale.rfu.model.Pedido;
import br.feevale.rfu.model.list.Pedidos;
import br.feevale.rfu.service.PedidoService;
import br.feevale.rfu.utils.ServiceUtils;

public class PedidoServiceProxy implements PedidoService {

	@Override
	public void save(Pedido pedido) {
		ServiceUtils.request("/Pedido/save", pedido, String.class);
	}

	@Override
	public Pedidos listAll() {
		Pedidos pedidos = ServiceUtils.request("/Pedido/listAll", Pedidos.class);
		return pedidos;
	}

}
