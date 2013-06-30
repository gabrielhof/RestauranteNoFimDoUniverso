package br.feevale.rfu.proxy;

import br.feevale.rfu.model.Usuario;
import br.feevale.rfu.model.list.Usuarios;
import br.feevale.rfu.service.UsuarioService;
import br.feevale.rfu.utils.ServiceUtils;

public class UsuarioServiceProxy implements UsuarioService {

	@Override
	public void save(Usuario usuario) {
		ServiceUtils.request("/Usuario/save", usuario, String.class);
	}

	@Override
	public Usuarios listAll() {
		Usuarios usuarios = ServiceUtils.request("/Prato/listAll", Usuarios.class);
		return usuarios;
	}

}
