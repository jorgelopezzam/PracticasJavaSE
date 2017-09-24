<html>
<head>
	<script src="js/jquery-1.9.1.js"></script>
	<link href="css/bootstrap.css" rel="stylesheet">
	<link href="css/bootstrap-responsive.css" rel="stylesheet">
</head>

<body>
<form action="OperacionesServlet" method="post">
	<div class="navbar navbar-inverse navbar-fixed-top"></div>
	<div class="container">
	Operador 1: <input type="text" name="operador1">
	<br/>
	Operador 2: <input type="text" name="operador2">
	<br/>
	<br/>
	Tipo de Operación: <select name="operacion">
						<option value="1">Suma</option>
						<option value="2">Resta</option>
						<option value="3">Division</option>
						<option value="4">Multiplicacion</option>
						</select>
	<br/>
	<br/>
	<input type="submit" value="Realizar Operación">
		<footer>
			<p>&copy; Company 2017</p>
		</footer>
	</div>
	</form>
</body>
</html>
