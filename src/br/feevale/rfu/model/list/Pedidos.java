package br.feevale.rfu.model.list;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import br.feevale.rfu.model.Bean;
import br.feevale.rfu.model.Pedido;

@SuppressWarnings("serial")
@XmlRootElement
public class Pedidos extends Bean {

	private List<Pedido> pedidos;

	public List<Pedido> getPedidos() {
		return pedidos;
	}

	public void setPedidos(List<Pedido> pedidos) {
		this.pedidos = pedidos;
	}
	
	public void add(Pedido pedido) {
		if (pedidos == null) {
			setPedidos(new ArrayList<Pedido>());
		}
		
		pedidos.add(pedido);
	}
	
}
