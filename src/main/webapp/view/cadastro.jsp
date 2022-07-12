<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:url value="/hub" var="linkHubServlet"/>

<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel='stylesheet' type='text/css' href='view/css/reset.css'>
    <link rel='stylesheet' type='text/css' href='view/css/styleCadastro.css'>
    <title>Home</title>
</head>
<body>
    <main class="main">
        <h1>Cadastro de Produto</h1>
        <form class="formulario" method="post" action="${linkHubServlet}" enctype="multipart/form-data">
            <input class="inputTextCadastro" type="text" placeholder="Nome do Produto" name="produtoNome">
            <input class="inputTextCadastro" type="text" placeholder="Valor do Produto" name="produtoValor">
            <textarea class="inputTextCadastro" placeholder="Descrição do Produto" name="produtoDescricao" cols="30" rows="10"></textarea>
            <label>Imagem do Produto:</label>
            <input class="buttonFileCadastro" type="file" name="produtoImagem" accept="image/png, image/jpeg">
            <input type="hidden" name="acao" value="CadastroProduto">
            <input class="buttonCadastro" type="submit" value="CADASTRAR">
        </form>
    </main>    
</body>
</html>