package br.com.loja.control.acoes;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.loja.control.servlet.Acao;
import br.com.loja.model.ControleAcesso;
import br.com.loja.model.Usuario;

public class Login implements Acao {

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String usuarioNome = request.getParameter("usuarioNome");
		String usuarioSenha = request.getParameter("usuarioSenha");
		Usuario usuario = new Usuario(usuarioNome,usuarioSenha);
		ControleAcesso controleAcesso = new ControleAcesso();
		Boolean validSession = controleAcesso.isValidSession(request);
		Boolean validLogin = controleAcesso.login(usuario);
		
		
		if(validSession || validLogin) {
			return "redirect:hub?acao=CadastroProdutoForm";
		} else {
			return "redirect:hub?acao=LoginForm";
		}
	}

}
