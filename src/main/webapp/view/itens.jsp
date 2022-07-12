<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel='stylesheet' type='text/css' href='view/css/reset.css'>
<link rel='stylesheet' type='text/css' href='view/css/styleItens.css'>
<title>Home</title>
</head>
<body>
	<main class="itens">
		<c:forEach items="${listaProdutos}" var="item">
			<section class="item">
				<img class="itemImagem" src="" alt="">
				<section class="itemLayoutBlock">
					<div class="itemConteudo">
						<h1>${item.nome}</h1>
						<p>${item.descricao}</p>
					</div>
					<div class="menuInferior">
						<p>R$ ${item.valor}</p>
						<form class="itemMenuAcoes" action="">
							<input class="itemButton" type="submit" value="DELETAR">
							<input class="itemButton" type="submit" value="ATUALIZAR">
						</form>
					</div>
				</section>
			</section>
		</c:forEach>
	</main>
</body>
</html>