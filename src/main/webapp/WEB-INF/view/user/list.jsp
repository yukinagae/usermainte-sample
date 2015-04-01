<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>User List</title>
</head>
<body>
	<table>
		<thead>
			<tr>
				<th>id</th>
				<th>name</th>
			</tr>
		</thead>

		<tbody>
			<c:forEach var="user" items="${userDtos}">
				<tr>
					<td>${user.id}</td>
					<td>${user.name}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>
