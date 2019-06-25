
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <link rel="stylesheet"
              href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
        <title>Products</title>
    </head>
    <body>
        <section>
            <div class="jumbotron">
                <div class="container">
                    <h1>DVD</h1>
                    <p>Destalles de un DVD </p>
                </div>
            </div>
        </section>

        <section class="container">
            <div class="row">
                <div class="col-sm-6 col-md-3" style="padding-bottom: 15px">
                    <div class="thumbnail">
                        <div class="caption">
                            <h3>${dvd.id}  - ${dvd.titulo}  </h3>
                            <p>Autor: ${dvd.autor}</p>
                            <p>Año: ${dvd.anio} </p>
                            <p>Esta alquilado?  ${dvd.alquilado} </p>
                        </div>
                    </div>
                </div>
            </div>
        </section>
    </body>
</html>
