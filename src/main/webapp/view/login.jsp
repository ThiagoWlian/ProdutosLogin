<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:url value="/hub" var="linkHubServlet"/>

<!DOCTYPE html>
<html>
<head>
    <meta charset='utf-8'>
    <meta http-equiv='X-UA-Compatible' content='IE=edge'>
    <title>Login</title>
    <meta name='viewport' content='width=device-width, initial-scale=1'>
    <link rel='stylesheet' type='text/css' href='view/css/reset.css'>
    <link rel='stylesheet' type='text/css' href='view/css/styleLogin.css'>
</head>
<body>
    <main class="main">
        <section class="conteudo">
            <img class="logo" src="view/img/icon.png" alt="">
            <h1>Welcome Page</h1>
            <p>Sign in to continue acess</p>
        </section>
        <section class="login">
            <h2>Bem Vindo</h2>
            <form class="formulario" action="${linkHubServlet}" method="post">
                <input class="inputlogin" placeholder="Usuário" type="text" name="usuarioNome" id="">
                <input class="inputlogin" placeholder="Senha" type="password" name="usuarioSenha" id="">
                <input type="hidden" name="acao" value="Login">
                <input class="inputbutton" type="submit" value="LOGIN">
            </form>
    </section>
    </main>
</body>
</html>