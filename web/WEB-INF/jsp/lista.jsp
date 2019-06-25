
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" 
           uri="http://www.springframework.org/tags" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <link rel="stylesheet"
              href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
        <title>lista dvds</title>
    </head>
    <body>
        <section>
            <div class="jumbotron">
                <div class="container">
                    <h1>Tienda DVD</h1>
                    <p>Lista de DVDs en venta</p>
                </div>
            </div>
        </section>

        <section class="container">
            
            <c:forEach items="${listaDvds}" var="dvd">
            <div class="row">
                <div class="col-sm-6 col-md-3" style="padding-bottom: 15px">
                    <div class="thumbnail">
                        <div class="caption">
                            <h3>${dvd.id}  - ${dvd.titulo}  </h3>
                            <a href="<spring:url value='/dvd/detalle/${dvd.id}' />" >
                            Ver Detalle  
                            </a>
                        </div>
                    </div>
                </div>
            </div>
            </c:forEach>   
            
            
                        
        </section>
    </body>
</html>
