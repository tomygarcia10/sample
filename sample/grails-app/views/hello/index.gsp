<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main"/>
		<title>Render Domain</title>
	</head>
	<body>
		<table>
			<tr>
				<td>Name</td>
				<td>Age</td>
			</tr>
			<g:each in="${lista}" var="person">
			<tr>
				<td>${person.lastName}, ${person.firstName}</td>
				<td>${person.age}</td>
			</tr>
			</g:each>			
		</table>	
	</body>
</html>