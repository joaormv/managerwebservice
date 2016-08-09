package br.com.bsemanager.domain.Entidades;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.stereotype.Component;

/**
 * Created by João on 01/08/2016.
 */

@Entity
@Component
public class Cliente implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id_cliente", unique = true, nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column(name = "nome", nullable = false, length = 45)
	private String nome;

	@Column(name = "cpf", nullable = false, length = 14)
	private String cpf;

	@Column(name = "rg", nullable = false, length = 15)
	private String rg;

	@Column(name = "matricula", nullable = false, length = 20)
	private String matricula;

	@Column(name = "senha", nullable = true, length = 10)
	private String senha;

	@Temporal(TemporalType.DATE)
	@Column(name = "data_nasc", nullable = true, length = 10)
	private Date data_nasc;

	//Relacionamento 1>* configurado no atributo "cliente" do outro lado, na entidade Emprestimo
	@OneToMany(mappedBy = "cliente")
	private List<Emprestimo> emprestimos;
	
	//Configura o relacionamento entre a tabela endereço
	@OneToOne
	@JoinColumn(name = "id_endereco")
	private Endereco endereco;

	@Column(name = "orgao", nullable = true, length = 30)
	private String orgao;

	@Column(name = "convenio", nullable = false, length = 10)
	private String convenio;

	@Column(name = "tel", nullable = false, length = 15)
	private String tel;

	@Column(name = "tel2", nullable = true, length = 15)
	private String tel2;


	// Getters ---------------------------------------

	public long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public String getRg() {
		return rg;
	}

	public String getCpf() {
		return cpf;
	}

	public String getMatricula() {
		return matricula;
	}

	public String getSenha() {
		return senha;
	}

	public Date getData_nasc() {
		return data_nasc;
	}

	public String getOrgao() {
		return orgao;
	}

	public String getConvenio() {
		return convenio;
	}

	public String getTel1() {
		return tel;
	}

	public String getTel2() {
		return tel2;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public List<Emprestimo> getEmprestimos() {
		return emprestimos;
	}

	// Setters ------------------------------

	public void setId(Long id) {
		this.id = id;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public void setData_nasc(Date data_nasc) {
		this.data_nasc = data_nasc;
	}

	public void setOrgao(String orgao) {
		this.orgao = orgao;
	}

	public void setConvenio(String convenio) {
		this.convenio = convenio;
	}

	public void setTel1(String tel1) {
		this.tel = tel1;
	}

	public void setTel2(String tel2) {
		this.tel2 = tel2;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public void setEmprestimos(List<Emprestimo> emprestimos) {
		this.emprestimos = emprestimos;
	}

}
