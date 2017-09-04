<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="dnsloc"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
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
	<c:import url="cabecalho.jsp"></c:import>
	<h1>Altera Contato</h1>
	<hr />
	<c:forEach var="contato" items="${contato}">
		<form action="alteraContato" method="get">
			Nome: <input type="text" name="nome" value="${contato.name}" /><br />
			E-mail: <input type="text" name="email" value="${contato.email}" /><br />
			Endereço: <input type="text" name="endereco" value="${contato.address}" /><br />
			Data Nascimento: <dnsloc:campoData id="dataNascimento" date="${contato.birthDate.time}"/><br />
			
			<input type="submit" value="Gravar">

		</form>
	</c:forEach>
	<c:import url="rodape.jsp"></c:import>
</body>
</html>