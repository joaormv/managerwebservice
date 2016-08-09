package br.com.bsemanager.domain.Entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Entity
@Component
public class Operador implements Serializable {

	@Id
	@Column(name = "id_operador", unique = true, nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "user", nullable = false, length = 45)
	private String user;
	
	@Column(name = "senha", nullable = false, length = 6)
	private String senha;

	// Getters-----------------------------------------------------

	
	
	public String getUser() {
		return user;
	}

	public long getId() {
		return id;
	}

	public void setUser(String user) {
		this.user = user;
	}

	// Setters-----------------------------------------------------

	public void setId(long id) {
		this.id = id;
	}
	
	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

}
