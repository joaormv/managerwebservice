package br.com.bsemanager.domain.DAO;

import java.util.List;

import org.hibernate.Query;
import org.springframework.stereotype.Component;

import br.com.brbsemanager.util.HibernateDAO;
import br.com.bsemanager.domain.Entidades.Cliente;

@Component
public class ClienteDAO extends HibernateDAO<Cliente> {

	public ClienteDAO() {
		super(Cliente.class);
	}

	public Cliente getClienteById(Long id) {

		return get(id);
	}

	public List<Cliente> getClientes() {

		Query q = getSession().createQuery("SELECT d from Cliente d ORDER BY d.nome");

		List<Cliente> clientes = q.list();

		return clientes;

	}

	public Cliente getClienteByCpf(String cpf) {

		String query = "from Cliente c where c.cpf = :cpfQuery";
		Query q = getSession().createQuery(query);
		q.setString("cpfQuery", cpf);
		Cliente cliente = (Cliente) q.list().get(0);
		return cliente;
	}

	public void salvar(Cliente c) {
		save(c);
	}

	public void update(Cliente c) {
		saveOrUpdate(c);
	}

}
