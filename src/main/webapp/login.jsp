<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link href="css/style.css" rel="stylesheet" type="text/css">
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<div class="container">
  <div class="message signup">
    <div class="btn-wrapper">
      <button class="button" id="signup">Registrarse</button>
      <button class="button" id="login"> Acceder</button>
    </div>
  </div>
  <div class="form form--signup">
    <div class="form--heading">Bienvenido! Registrate</div>
    <form autocomplete="off">
      <input type="text" placeholder="Usuario">
      <input type="email" placeholder="Email">
      <input type="password" placeholder="Contraseña">
      <button class="button">Registrarse</button>
    </form>
  </div>
  <div class="form form--login">
    <div class="form--heading">Bienvenido de vuelta! </div>
    <form autocomplete="off">
      <input type="text" placeholder="Usuario">
      <input type="password" placeholder="Contraseña">
      <button class="button">Acceder</button>
    </form>
  </div>
</div>

</body>
</html>