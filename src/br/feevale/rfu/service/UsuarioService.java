package br.feevale.rfu.service;

import br.feevale.rfu.model.Usuario;
import br.feevale.rfu.model.list.Usuarios;

public interface UsuarioService {

	public void save(Usuario usuario);
	
	public Usuarios listAll();

}
