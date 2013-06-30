package br.feevale.rfu.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@SuppressWarnings("serial")
public class TarefasPendente extends Bean {

	private Integer idTarefaPendente;
	private Integer mesa;
	private Integer status;
	private String descricao;
	private String nomePrato;

	public Integer getIdTarefaPendente() {
		return idTarefaPendente;
	}

	public Integer getMesa() {
		return mesa;
	}

	public Integer getStatus() {
		return status;
	}

	public String getDescricao() {
		return descricao;
	}

	public String getNomePrato() {
		return nomePrato;
	}

	public void setIdTarefaPendente( Integer idTarefaPendente ) {
		this.idTarefaPendente = idTarefaPendente;
	}

	public void setMesa( Integer mesa ) {
		this.mesa = mesa;
	}

	public void setStatus( Integer status ) {
		this.status = status;
	}

	public void setDescricao( String descricao ) {
		this.descricao = descricao;
	}

	public void setNomePrato( String nomePrato ) {
		this.nomePrato = nomePrato;
	}

}
