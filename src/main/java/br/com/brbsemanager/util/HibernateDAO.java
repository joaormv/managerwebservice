package br.com.brbsemanager.util;

import java.io.Serializable;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class HibernateDAO<T> {

	protected Class<T> classe;
	protected Session session;

	@Autowired
	private SessionFactory sessionFactory;

	public HibernateDAO(Class<T> classe) {

		this.classe = classe;

	}

	public void delete(T entity) {
		getSession().delete(entity);
	}

	public void update(T entity) {
		getSession().update(entity);
	}

	public void save(T entity) {
		getSession().save(entity);
	}
	
	public void saveOrUpdate(T entity){
		getSession().saveOrUpdate(entity);
	}

	public T load(Serializable id) {
		return (T) getSession().load(this.classe, id);
	}

	public T get(Serializable id) {
		return (T) getSession().get(this.classe, id);
	}

	public Session getSession() {

		if (sessionFactory != null) {
			session = sessionFactory.getCurrentSession();
		}
		if (session == null) {

			throw new RuntimeException("Hibernate session if null");
		}
		return session;
	}
}
