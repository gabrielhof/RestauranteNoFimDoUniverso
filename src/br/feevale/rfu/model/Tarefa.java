package br.feevale.rfu.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@SuppressWarnings("serial")
public class Tarefa extends Bean {

	private String descricao;
	private Integer idTarefa;
	private Integer idPrato;

	public String getDescricao() {
		return descricao;
	}

	public Integer getIdTarefa() {
		return idTarefa;
	}

	public Integer getIdPrato() {
		return idPrato;
	}

	public void setDescricao( String descricao ) {
		this.descricao = descricao;
	}

	public void setIdTarefa( Integer idTarefa ) {
		this.idTarefa = idTarefa;
	}

	public void setIdPrato( Integer idPrato ) {
		this.idPrato = idPrato;
	}
	
}
