<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" 
           uri="http://www.springframework.org/tags" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
<title>Bienvenida</title>
</head>
<body>
	<section>
		<div class="jumbotron">
			<div class="container">
				<h1> ${saludo} </h1>
				<p> ${linea1} </p>
			</div>
                        <div>
                 
                        <a href="<spring:url value='/dvd/lista' />" >
                            Ver Lista DVD 
                        </a>
                           <br />
                           <a href="<spring:url value='/dvd/nuevo' />" >
                            Nuevo DVD 
                        </a>
                            
                        </div>
		</div>
                        
	</section>
</body>
</html>
