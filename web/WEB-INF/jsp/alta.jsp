<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" 
           uri="http://java.sun.com/jsp/jstl/core"%> 
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %> 
<!DOCTYPE html>
<html> 
    <head> 
        <link rel="stylesheet"
              href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
        <title>Alta Nuevo DVD</title> 
    </head> 
    <body> 
    <body> 
        <section> 
            <div class="jumbotron"> 
                <div class="container"> 
                    <h1>Tienda DVDs</h1> 
                    <p>Alta Nuevo DVD</p> 
                </div> 
            </div> 
        </section> 
        <section class="container"> 
            <form:form  method="POST" modelAttribute="nuevoDvd"               class="form-horizontal"> 
                <fieldset> 
                    <legend>Crear un nuevo DVD</legend> 

                    <div class="form-group"> 
                        <label class="control-label col-lg-2 col-lg-2" 
                            for="id">
                        </label> 
                        <div class="col-lg-10"> 
                            <form:input id="id" path="id"  type="text" class="form:input-large"/> 
                            <form:errors path="id" /> 
                        </div> 
                    </div>
                    <div class="form-group"> 
                        <label class="control-label col-lg-2 col-lg-2" 
                               for="tit">Título</label> 
                        <div class="col-lg-10"> 
                            <form:input id="tit" path="titulo"                           type="text" class="form:input-large"/> 
                            <form:errors path="titulo" /> 
                        </div> 
                    </div>

                    <div class="form-group"> 
                        <label class="control-label col-lg-2" 
                               for="aut">Autor</label> 
                        <div class="col-lg-10"> 
                            <form:input id="aut" path="autor" /> 
                            <form:errors path="autor" /> 
                        </div> 
                    </div> 
                    <div class="form-group"> 
                        <label class="control-label col-lg-2 col-lg-2" 
                               for="anio">Año</label> 
                        <div class="col-lg-10"> 
                            <form:input id="anio" path="anio"                           type="text" class="form:input-large"/> 
                            <form:errors path="anio" /> 
                        </div> 
                    </div>


                    <div class="form-group"> 
                        <label class="control-label col-lg-2" 
                               for="alquilado">Alquilado</label> 
                        <div class="col-lg-10"> 
                            <form:checkbox  id="alquilado"       
                                            path="alquilado"/> 
                        </div> 
                    </div> 

                    
                    <div class="form-group"> 
                        <div class="col-lg-offset-2 col-lg-10"> 
                            <input type="submit" id="btnCrear" class="btn 
                                   btn-primary" value ="Crear Nuevo"/> 
                        </div> 
                    </div> 
                </fieldset> 
            </form:form> 
            
           
        </section> 
    </body> 
</html> 

</body> 
</html> 
