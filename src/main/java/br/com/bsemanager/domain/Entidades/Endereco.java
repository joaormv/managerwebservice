package br.com.bsemanager.domain.Entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.springframework.stereotype.Component;

/**
 * Created by João on 01/08/2016.
 */

@Entity
@Component
public class Endereco implements Serializable {

	@Id
	@Column(name = "id_endereco", unique = true, nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column(name = "rua", nullable = false, length = 45)
	private String rua;

	@Column(name = "numero", nullable = false, length = 5)
	private int numero;

	@Column(name = "bairro", nullable = false, length = 45)
	private String bairro;

	@Column(name = "cidade", nullable = false, length = 45)
	private String cidade;

	@Column(name = "estado", nullable = false, length = 45)
	private String estado;

	@Column(name = "rua", nullable = false, length = 9)
	private String cep;

	// Relacionamento 1>1 configurado no atributo "cliente" do outro lado, na entidade Cliente
	@OneToOne(mappedBy = "endereco")
	private Cliente cliente;

	// Getters-----------------------------------------------------

	public long getId() {
		return id;
	}

	public String getRua() {
		return rua;
	}

	public int getNumero() {
		return numero;
	}

	public String getBairro() {
		return bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public String getEstado() {
		return estado;
	}

	public String getCep() {
		return cep;
	}

	public Cliente getCliente() {
		return cliente;
	}

	// Setters-----------------------------------------------------

	public void setId(Long id) {
		this.id = id;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	/*
	 * public static Endereco getEndereco() {
	 * 
	 * Endereco endereco = new Endereco("Maria José Barroso", 1000, "Vila Maria"
	 * , "São Paulo", "SP", "02136-020");
	 * 
	 * return endereco;
	 * 
	 * }
	 */
}
