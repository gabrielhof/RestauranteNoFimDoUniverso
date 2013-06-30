package br.feevale.rfu.proxy;

import br.feevale.rfu.model.Prato;
import br.feevale.rfu.model.list.Pratos;
import br.feevale.rfu.service.PratoService;
import br.feevale.rfu.utils.ServiceUtils;

public class PratoServiceProxy implements PratoService {

	@Override
	public void save(Prato prato) {
		ServiceUtils.request("/Prato/save", prato, String.class);
	}

	@Override
	public Pratos listAll() {
		Pratos pratos = ServiceUtils.request("/Pedido/listAll", Pratos.class);
		return pratos;
	}

}
