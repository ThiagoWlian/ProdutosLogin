package br.com.loja.control.servlet.settings;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class HibernateSettings {
	
	static EntityManagerFactory  gerenciadorDeEntidadeFactory = null;
	
	public static EntityManager getEntityManager(String persistenceUnitName) {
		gerenciadorDeEntidadeFactory = Persistence.createEntityManagerFactory(persistenceUnitName);
		EntityManager gerenciadorDeEntidade = gerenciadorDeEntidadeFactory.createEntityManager();
		return gerenciadorDeEntidade;
	}
}
