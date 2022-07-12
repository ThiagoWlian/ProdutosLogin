package br.com.loja.model.dao;

import br.com.loja.model.ControleAcesso;
import br.com.loja.model.Usuario;

public class teste {

	public static void main(String[] args) {
		Usuario usuario = new Usuario();
		usuario.setNome("asdas");
		usuario.setSenha("sada");
		
		ControleAcesso cr = new ControleAcesso();
		System.out.print(cr.login(usuario));
		

	}

}
