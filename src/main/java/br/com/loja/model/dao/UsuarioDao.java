package br.com.loja.model.dao;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;

import org.jboss.jandex.ThrowsTypeTarget;

import br.com.loja.control.servlet.settings.HibernateSettings;
import br.com.loja.model.Usuario;

public class UsuarioDao {

	EntityManager gerenciadorEntidade = HibernateSettings.getEntityManager("loja");

	public Usuario getUsuarioBancoPorUsuarioSenha(Usuario usuario) {
		Usuario usuarioDatabase = null;
		String query = "SELECT u FROM Usuario u WHERE usuario_nome = :nome AND usuario_senha = :senha";
		usuarioDatabase = (Usuario) gerenciadorEntidade.createQuery(query)
				.setParameter("nome", usuario.getNome())
				.setParameter("senha", usuario.getSenha()).getSingleResult();
		return usuarioDatabase;
	}
}
