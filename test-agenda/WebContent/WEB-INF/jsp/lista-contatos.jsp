<%@page
	import="com.sun.org.apache.xalan.internal.xsltc.compiler.util.TestGenerator"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@taglib uri="http://displaytag.sf.net" prefix="display"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%-- <%request.setAttribute("contatos", new ContatoDao().getLista());%> --%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="css/displaytag.css">
<link rel="stylesheet" type="text/css" href="css/all.css">

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Lista contatos JSP - Taglib</title>
</head>
<body>
	<c:import url="cabecalho.jsp" />
<%-- 	<jsp:useBean id="dao" class="br.local.dns.jdbc.modelo.dao.ContatoDao"></jsp:useBean> --%>
	<table>
		<tr>
			<td></td>
			<td>Nome</td>
			<td>E-mail</td>
			<td>Endereço</td>
			<td>Data Nascimento</td>
		</tr>
		<c:forEach var="contato" items="${contatos}" varStatus="id">
			<tr bgcolor="#${id.count % 2 == 0 ? '477979' : 'ffffff' }">
				<td>${id.count}</td>
				<td>${contato.name}</td>
				<td>
<%-- 				<c:if test="${not empty contato.email}"> --%>
<%-- 						<a href="mailto:${contato.email}">${contato.email}</a> --%>
<%-- 					</c:if> <c:if test="${empty contato.email}"> --%>
<%-- 					E-mail não informado</c:if>  --%>
					<c:choose>
						<c:when test="${not empty contato.email}">
							<a href="mailto:${contato.email}">${contato.email}</a>
						</c:when>
						<c:otherwise>Email não informado</c:otherwise>
					</c:choose></td>
				<td>${contato.address}</td>
				<%-- 				<td>${contato.birthDate.time}</td>  --%>
				<td><fmt:formatDate value="${contato.birthDate.time}"
						pattern="dd/MM/yyyy" /></td>
				<td><a href="mvc?logica=RemoveContatoLogic&id=${contato.id}">Remover</a></td>
				<td><a href="mvc?logica=DadosContatoLogic&id=${contato.id}">Alterar</a></td>
			</tr>
		</c:forEach>
	</table>

	<display:table name="contatos" export="true" pagesize="5"
		defaultsort="1" defaultorder="descending">
		<display:caption>
			<span class="label warning">TESTE</span>
		</display:caption>
		<display:column property="id" title="ID" sortable="true"></display:column>
		<display:column property="name" title="Nome" sortable="true"></display:column>
		<display:column property="email" title="E-mail" format="email is {0}"
			autolink="true"></display:column>
		<display:column property="address" title="Endereço"></display:column>
		<display:column property="birthDate.time" title="Data Nascimento"
			format="{0,date,dd/MM/yyyy}"></display:column>
<%-- 			<display:column href="mvc?logica=RemoveContatoLogic&id=${id}" property="Remover" title="Remover"></display:column> --%>
	</display:table>

	<c:import url="rodape.jsp"></c:import>
</body>
</html>