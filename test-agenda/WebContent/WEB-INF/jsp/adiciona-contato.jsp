<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="dnsloc" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Contato</title>
<link href="css/jquery.css" rel="stylesheet">
<script src="js/jquery.js"></script>
<script src="js/jquery-ui.js"></script>
</head>
<body>
	<c:import url="WEB-INF/jsp/cabecalho.jsp"></c:import>
	<h1>Adiciona Contatos</h1>
	<hr />
	<form action="adicionaContato" method="post">
		Nome: <input type="text" name="nome" /><br />
		E-mail: <input type="text" name="email" /><br />
		Endere�o: <input type="text" name="endereco" /><br />
		Data Nascimento: <dnsloc:campoData id="dataNascimento" /><br />
		<input type="submit" value="Gravar">

	</form>
	<c:import url="WEB-INF/jsp/rodape.jsp"></c:import>
</body>
</html>