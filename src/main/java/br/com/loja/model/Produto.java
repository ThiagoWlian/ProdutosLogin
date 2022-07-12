package br.com.loja.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name = "PRODUTO")
public class Produto {
	
	@Id
	@Column(name = "produto_id")
	private int id;
	
	@Column(name = "produto_nome")
	private String nome;
	
	@Column(name = "produto_descricao")
	private String descricao;
	
	@Column(name = "produto_valor")
	private float valor;
	
	@Lob()
	@Column(name = "produto_imagem")
	private byte[] imagem;
	
	public Produto() {}
	
	public Produto(String nome, String descricao, float valor, byte[] imagem) {
		this.nome = nome;
		this.descricao = descricao;
		this.valor = valor;
		this.imagem = imagem;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public byte[] getImagem() {
		return imagem;
	}

	public void setImagem(byte[] imagem) {
		this.imagem = imagem;
	}
	
	
}
