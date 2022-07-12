package br.com.loja.model.dao;

import java.sql.SQLException;
import java.util.Collections;
import java.util.List;

import javax.persistence.EntityManager;

import com.mysql.cj.x.protobuf.MysqlxCrud.Collection;

import br.com.loja.control.servlet.settings.HibernateSettings;
import br.com.loja.model.Produto;

public class ProdutoDao {

	EntityManager gerenciadorEntidade = HibernateSettings.getEntityManager("loja");

	public void setProdutoDatabase(Produto produto) {
		try {
			gerenciadorEntidade.getTransaction().begin();
			gerenciadorEntidade.persist(produto);
			gerenciadorEntidade.getTransaction().commit();
		} catch (Exception e) {
			gerenciadorEntidade.getTransaction().rollback();
			System.out.println(e.getMessage());
		} finally {
			gerenciadorEntidade.close();
		}
	}

	public List<Produto> getProdutoList() {
		List<Produto> listaProdutos;
		String query = "Select p from Produto p";
		try {
			listaProdutos = gerenciadorEntidade.createQuery(query).getResultList();
			return listaProdutos;
		} catch (Exception e) {
			System.out.print(e.getMessage());
			return Collections.EMPTY_LIST;
		}
	}

}
