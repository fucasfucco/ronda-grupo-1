<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<link href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>


</head>
<body>
<div class="container">
<div class="row">
<form action="LoginServlet" method="post">

	<div class="panel panel-default" style="width: 300px; margin: 5%;"> 
	   <div class="panel-heading"> 
	      <!-- cabeçalho do painel --> 
	      <label>AUTENTICAÇÃO</label>       
	   </div> 
	   <div class="panel-body"> 
	   <!-- corpo do painel --> 
	      <label>Email</label>
	      <input type="text" name="email" class="form-control">

	      <label>Senha</label>
	      <input type="password" name="senha" class="form-control">   
	   </div> 
	   <div class="panel-footer"> 
	      <!-- rodapé do painel --> 
	      <button type="submit">Login</button>   
	      <br>	      
	   </div> 
	</div> 

</form>
<form action="RegisterServlet" method="post">
	<div class="panel panel-default" style="width: 300px; margin: 5%;"> 
	   <div class="panel-heading"> 
	      <!-- cabeçalho do painel --> 
	      <label>Registro</label>      
	   </div> 
	   <div class="panel-body"> 
	   <!-- corpo do painel --> 
	   	  <label>Id</label>
	      <input type="text" name="id" class="form-control">	
	   
	      <label>Email</label>
	      <input type="text" name="email" class="form-control">

		  <label>Nome</label>
	      <input type="text" name="nome" class="form-control">	 

	      <label>Senha</label>
	      <input type="password" name="senha" class="form-control">	   
	   </div> 
	   <div class="panel-footer"> 
	      <!-- rodapé do painel --> 
	      <button type="submit">Registrar</button>   
	      <br>      
	   </div> 
	</div> 
</form>
</div>
</div>

<center>
<h4>${requestScope.mensagemLogin}</h4>
<h4>${requestScope.mensagemRegister}</h4>
 </center>




</body>
</html>