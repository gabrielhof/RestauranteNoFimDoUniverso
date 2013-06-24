package br.feevale.rfu.service;

import br.feevale.rfu.model.Usuario;

public interface UsuarioService {

	public void save(Usuario usuario);
	
	public Usuario[] listAll();

}
