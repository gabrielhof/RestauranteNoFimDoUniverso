package br.feevale.rfu.model;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Pedido implements Serializable {

	private Integer idPedido;
	private Integer total;
	private Integer mesa;
	
	public Integer getIdPedido() {
		return idPedido;
	}
	
	public Integer getTotal() {
		return total;
	}
	
	public Integer getMesa() {
		return mesa;
	}
	
	public void setIdPedido( Integer idPedido ) {
		this.idPedido = idPedido;
	}
	
	public void setTotal( Integer total ) {
		this.total = total;
	}
	
	public void setMesa( Integer mesa ) {
		this.mesa = mesa;
	}
}
