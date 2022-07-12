package br.com.loja.model;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import br.com.loja.control.servlet.settings.HibernateSettings;
import br.com.loja.model.Usuario;
import br.com.loja.model.dao.UsuarioDao;

public class ControleAcesso {
	
	public boolean isValidSession(HttpServletRequest request){
		HttpSession session = request.getSession();	
		
		if(session.getAttribute("usuarioNome") != null) {
			return true;
		}
		return false;
	}
	
	public void setSessionValid(HttpServletRequest request, Usuario usuario) {
		HttpSession session = request.getSession();	
		session.setAttribute("usuarioNome", usuario.getNome());
	}
	
	public boolean login(Usuario usuario) {
		try {
			UsuarioDao usuarioDao = new UsuarioDao();
			Usuario usuarioBanco = usuarioDao.getUsuarioBancoPorUsuarioSenha(usuario);
			return true;
		}
		catch (NoResultException e) {
			return false;
		}
	}

}
