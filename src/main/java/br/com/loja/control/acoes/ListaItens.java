package br.com.loja.control.acoes;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.loja.control.servlet.Acao;
import br.com.loja.model.Produto;
import br.com.loja.model.dao.ProdutoDao;

public class ListaItens implements Acao{

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		ProdutoDao produtoDao = new ProdutoDao();
		List<Produto> listaProdutos = produtoDao.getProdutoList();
		request.setAttribute("listaProdutos", listaProdutos);
		
		return "forward:itens.jsp";
	}

}
