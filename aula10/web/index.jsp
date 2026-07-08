<%@page import="model.Dados"%>
<% 
Dados d = new Dados();
if ( request.getAttribute("imc") != null ){
    d = (Dados)request.getAttribute("imc");
}
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>IMC</title>
    </head>
    <body>
        <h1>IMC</h1>
        <h2>Calculo do índice de massa corpórea</h2>
        
        <form action="CalculoController" method="post">
            
           <label for="text">Peso:(kg)</label> 
           <input type="number" id="peso" name="peso" placeholder="Ex: 85.985" step="0.001" min="0.001" required >
         
        <br><br>
        
           <label for="text">Altura:(m)</label> 
           <input type="number" id="altura" name="altura" placeholder="Ex: 1.98" step="0.01" min="0.01" required >
 
       <br><br>

         <input type="submit"  id="calcular" value="Calcular">  
         
         <input type="reset"  id="limpar" value="Limpar">
         
        </form> 
        
        <%
            if( request.getAttribute("imc") != null ){
                out.print(d);
            }
        %>
    </body>
</html>
