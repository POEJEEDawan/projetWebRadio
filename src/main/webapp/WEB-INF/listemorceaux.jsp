<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<jsp:include page="header.jsp">
	<jsp:param value="Liste des morceaux" name="title" />
</jsp:include>
<table class="table">
	<thead>
		<tr>
			<th>ID</th>
			<th>Nom</th>
		</tr>
	</thead>
	<tbody>

		<c:forEach var="morceau" items="${morceaux}">
			<tr>
				<td><c:out value="${morceau.id}" /></td>

				<td><a href="<c:url value="/index">
						<c:param name="nom" value="${morceau.nom }" />
					</c:url>"><c:out value="${morceau.nom}" /></a>
					</td>
			</tr>
		</c:forEach>
</table>
</tbody>
<jsp:include page="footer.jsp" />