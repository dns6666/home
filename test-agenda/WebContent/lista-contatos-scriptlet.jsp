<%@page import="java.text.SimpleDateFormat"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"
	import="br.local.dns.jdbc.modelo.dao.*, java.util.*, br.local.dns.jdbc.modelo.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Lista Contatos</title>
</head>
<body>
	<table>
		<tr>
			<td>Nome</td>
			<td>Email</td>
			<td>Endereço</td>
			<td>Data Nascimento</td>
		</tr>
		<%
		    ContatoDao dao = new ContatoDao();
		    List<Contato> contatos = dao.getLista();

		    for (Contato contato : contatos) {
		        SimpleDateFormat simple = new SimpleDateFormat("dd/MM/yyyy");
		%>
		<tr>
			<td><%=contato.getName()%></td>
			<td><%=contato.getEmail()%></td>
			<td><%=contato.getAddress()%></td>
			<td><%=simple.format(contato.getBirthDate().getTime())%></td>
		</tr>
		<%
		    }
		%>
	</table>
</body>
</html>