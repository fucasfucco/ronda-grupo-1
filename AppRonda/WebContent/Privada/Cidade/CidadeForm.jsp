<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="CidadeCon" method="post">
	<fieldset>
        <label>Id</label><br>
        <input type="number" name="id" value="${obj.id}"><br>

        <label>Nome</label><br>
        <input type="text" name="nome" value="${obj.nome}"><br>

        <label>UF</label><br>
        <input type="text" name="uf" value="${obj.uf}"><br><br>
        
        <label>Data Cadastro</label><br>
        <input type="date" name="dataCadastro" value="${obj.dataCadastro}"><br><br>
        	
        <button type="submit" name="gravar">Gravar</button>	
        <button type="submit" name="cancelar">Cancelar</button>
	
	</fieldset>
</form>

</body>
</html>