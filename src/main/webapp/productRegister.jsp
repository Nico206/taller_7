<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="java.util.Calendar" %>
<%@ page import="java.util.Date" %><%--
  Created by IntelliJ IDEA.
  User: WINDOWS10
  Date: 27/04/2023
  Time: 10:37 p. m.
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Registro de Productos</title>

  <meta name="viewport" content="width=device-witdh, initial.scale=1">

  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"
        rel="stylesheet"
        integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65"
        crossorigin="anonymous">
  <link rel="stylesheet" href="css/styleRegis.css">


</head>
<body class="text-center">
<main class="form-signin w-100 m-auto">
  <form action="register-product" method="post">
    <img class="mb-4" src="img/product.png" alt="Tool me" width="100">
    <h4 class="text-secondary">Bienvenido a Tool <me></me></h4>
    <h1 class="h5 mb-3 fw-normal">Pagina para registrar Productos</h1>
    <h0 class="h5 mb-3 fw-normal" >Por favor rellena los campos para poder registrar un nuevo producto</h0>
    <br><br>

    <div class="form-floating">
      <input type="text" class="form-control" id="product_name" name="product_name"
             placeholder="Ingrese el nombre del producto" required autofocus
             pattern="[A-Za-z0-9]{8, 12}">
      <label for="product_name">Nombre del producto:</label>

    </div> <br>
    <div class="form-floating">
      <input type="number" class="form-control" id="product_value" name="product_vale"
             placeholder="Ingrese el valor del producto" required
              pattern="{1,10000000">
      <label for="product_value">Ingrese el valor del producto </label>

    </div> <br>
    <div class="form-floating">
      <input type="number" class="form-control" id="category_id" name="category_id"
             placeholder="Ingrese a que categoria pertenece el producto" required
             pattern="[A-Za-z0-9]{8, 12}">
      <label for="category_id">Categoria del producto</label>

    </div> <br>

    <button class="btn btn-info text-white w-100 mt-7 fw-semibold shadow-sm" type="submit">Registrar producto</button> <br>
    <div id="register">
      <a href="index.jsp">inicia sesion</a>
    </div>
    <p class="mt-3 mb-3 text-muted">Todos los Derechos Reservados TOOL ME © <%=displayDate()%>
    </p>

  </form>
</main>

<%!
  public String displayDate(){
    SimpleDateFormat dateformat = new SimpleDateFormat("YYYY");
    Date date = Calendar.getInstance().getTime();
    return  dateformat.format(date);
  }
%>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4"
        crossorigin="anonymous"></script>
</body>
</html>