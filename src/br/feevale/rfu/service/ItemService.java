package br.feevale.rfu.service;

import br.feevale.rfu.model.Item;

public interface ItemService {

	public void save(Item item);
	
	public Item[] listAll();
	
}
