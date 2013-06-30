package br.feevale.rfu.model.list;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import br.feevale.rfu.model.Bean;
import br.feevale.rfu.model.Prato;

@SuppressWarnings("serial")
@XmlRootElement
public class Pratos extends Bean {

	private List<Prato> pratos;

	public List<Prato> getPratos() {
		return pratos;
	}

	public void setPratos(List<Prato> pratos) {
		this.pratos = pratos;
	}
	
	public void add(Prato prato) {
		if (pratos == null) {
			setPratos(new ArrayList<Prato>());
		}
		
		pratos.add(prato);
	}
	
}
