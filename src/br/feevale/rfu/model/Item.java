package br.feevale.rfu.model;


@SuppressWarnings("serial")
public class Item extends Prato {
	
	private Integer idItem;
	private Integer idPedido;
	
	public Integer getIdItem() {
		return idItem;
	}
	
	public Integer getIdPedido() {
		return idPedido;
	}
	
	public void setIdItem( Integer idItem ) {
		this.idItem = idItem;
	}
	
	public void setIdPedido( Integer idPedido ) {
		this.idPedido = idPedido;
	}
}
