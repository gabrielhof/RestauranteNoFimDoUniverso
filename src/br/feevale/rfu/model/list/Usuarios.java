package br.feevale.rfu.model.list;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import br.feevale.rfu.model.Bean;
import br.feevale.rfu.model.Usuario;

@SuppressWarnings("serial")
@XmlRootElement
public class Usuarios extends Bean {

	private List<Usuario> usuarios;
	
	public List<Usuario> getUsuarios() {
		return usuarios;
	}
	
	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}
	
	public void add(Usuario usuario) {
		if (usuarios == null) {
			setUsuarios(new ArrayList<Usuario>());
		}
		
		usuarios.add(usuario);
	}
	
}
