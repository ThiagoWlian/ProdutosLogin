package br.com.loja.control.acoes;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import br.com.loja.control.servlet.Acao;
import br.com.loja.model.Produto;
import br.com.loja.model.Usuario;
import br.com.loja.model.dao.ProdutoDao;

@MultipartConfig ( 
		  fileSizeThreshold = 1024 * 1024 * 1, // 1 MB 
		  maxFileSize = 1024 * 1024 * 10, // 10 MB 
		  maxRequestSize = 1024 * 1024 * 100 // 100 MB 
		) 
public class CadastroProduto implements Acao{

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Part produtoFile = request.getPart("produtoImagem");
		String produtoNome = request.getParameter("produtoNome");
		String produtoDescricao = request.getParameter("produtoDescricao");
		float produtoValor = Float.parseFloat(request.getParameter("produtoValor"));
		byte[] produtoImagem = produtoFile.getInputStream().readAllBytes();
		Produto produto = new Produto(produtoNome,produtoDescricao,produtoValor,produtoImagem);
		
		ProdutoDao produtoDao = new ProdutoDao();
		produtoDao.setProdutoDatabase(produto);
		
		return "redirect:hub?acao=ListaItens";
	}

}
