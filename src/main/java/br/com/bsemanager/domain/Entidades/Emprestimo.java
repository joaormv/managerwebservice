package br.com.bsemanager.domain.Entidades;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.stereotype.Component;

/**
 * Created by João on 01/08/2016.
 */

@Entity
@Component
public class Emprestimo implements Serializable {

	@Id
	@Column(name = "id_emprestimo", unique = true, nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	//Configura o relacionamento entre a tabela cliente
	@ManyToOne
	@JoinColumn(name = "id_cliente")
	private Cliente cliente;

	@Column(name = "valor", nullable = false, length = 9)
	private double valor;

	@Column(name = "qnt_parcelas", nullable = false, length = 3)
	private int qntParcelas;

	@Column(name = "valor_parcelas", nullable = false, length = 9)
	private double valorParcela;

	@Temporal(TemporalType.DATE)
	@Column(name = "data_emprestimo", nullable = true, length = 10)
	private Date dataEmprestimo;

	@Column(name = "banco", nullable = false, length = 40)
	private String banco;

	@Column(name = "corretora", nullable = true, length = 40)
	private String corretora;

	// Getters -----------------------------

	public long getId() {
		return id;
	}

	public Cliente getClienteNome() {
		return cliente;
	}

	public double getValor() {
		return valor;
	}

	public int getQntParcelas() {
		return qntParcelas;
	}

	public double getValorParcela() {
		return valorParcela;
	}

	public Date getDataEmprestimo() {
		return dataEmprestimo;
	}

	public String getBanco() {
		return banco;
	}

	public String getCorretora() {
		return corretora;
	}

	// Setters --------------------------------

	public void setId(Long id) {
		this.id = id;
	}

	public void setClienteNome(Cliente cliente) {
		this.cliente = cliente;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public void setQntParcelas(int qntParcelas) {
		this.qntParcelas = qntParcelas;
	}

	public void setValorParcela(double valorParcela) {
		this.valorParcela = valorParcela;
	}

	public void setDataEmprestimo(Date dataEmprestimo) {
		this.dataEmprestimo = dataEmprestimo;
	}

	public void setBanco(String banco) {
		this.banco = banco;
	}

	public void setCorretora(String corretora) {
		this.corretora = corretora;
	}

	/*
	 * public static List<Emprestimo> getEmprestimos(){
	 * 
	 * List<Emprestimo> emprestimos = new ArrayList<>();
	 * 
	 * emprestimos.add(new Emprestimo("Maria Joaquina Silva Sauro", 1500.00, 3,
	 * 500.00, "12/03/2015", "Itau BMG", "Credlink")); emprestimos.add(new
	 * Emprestimo("Maria Joaquina Silva Sauro", 1500.00, 3, 500.00,
	 * "12/03/2015", "Daicoval", "Credlink")); emprestimos.add(new Emprestimo(
	 * "Maria Joaquina Silva Sauro", 1500.00, 3, 500.00, "12/03/2015",
	 * "Cruzeiro do Sul", "Credlink")); emprestimos.add(new Emprestimo(
	 * "Maria Joaquina Silva Sauro", 1500.00, 3, 500.00, "12/03/2015",
	 * "Panamericano", "Credlink"));
	 * 
	 * return emprestimos;
	 * 
	 * }
	 */
}
