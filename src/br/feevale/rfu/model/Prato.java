package br.feevale.rfu.model;

public class Prato {

	private Integer idPrato;
	private String nome;
	private String descricao;
	private Double valor;
	private Integer nTarefas;

	public Integer getIdPrato() {
		return idPrato;
	}

	public String getNome() {
		return nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public Double getValor() {
		return valor;
	}

	public Integer getnTarefas() {
		return nTarefas;
	}

	public void setIdPrato( Integer idPrato ) {
		this.idPrato = idPrato;
	}

	public void setNome( String nome ) {
		this.nome = nome;
	}

	public void setDescricao( String descricao ) {
		this.descricao = descricao;
	}

	public void setValor( Double valor ) {
		this.valor = valor;
	}

	public void setnTarefas( Integer nTarefas ) {
		this.nTarefas = nTarefas;
	}
	
}
