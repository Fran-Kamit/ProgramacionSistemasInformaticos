<%--
  Created by IntelliJ IDEA.
  User: Programador
  Date: 24/04/2024
  Time: 19:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="stylesheet" href="https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined:opsz,wght,FILL,GRAD@24,400,0,0" />
    <title>Listas y tablas</title>
</head>
<body>
    <h1>
        <center>Listas y tablas</center>
    </h1>

    <center>
        <a href="index.jsp"><span class="material-symbols-outlined">home</span></a>
        <a href="listas_y_tablas.jsp"><span class="material-symbols-outlined">list</span></a>
    </center>
    
    <div style="display: flex; margin: auto; width: 95%">
        <div style="width: 33%">
            <h2>Lista ordenada</h2>
            <ol>
                <li>Pera</li>
                <li>Manzana</li>
                <li>Uva</li>
                <li>Piña</li>
                <li>Tomate</li>
            </ol>
            <!-- ol>li*5 | Abreviación para poner de forma automática 'ol' con 5 'li' -->
            <ol type="I" reversed>
                <li>Pera</li>
                <li>Manzana</li>
                <li>Uva</li>
                <li>Piña</li>
                <li>Tomate</li>
            </ol>
            <ol start="15">
                <li>Pera</li>
                <li>Manzana</li>
                <li>Uva</li>
                <li>Piña</li>
                <li>Tomate</li>
            </ol>
            <ol>
                <li>Pera</li>
                <li>Manzana
                    <ol type="a">
                        <li>Golden</li>
                        <li>Royal</li>
                        <li>Fuji</li>
                    </ol>
                </li>
                <li>Uva</li>
                <li>Piña</li>
                <li>Tomate</li>
            </ol>
        </div>
        <div style="width:33%">
            <h2>Lista no ordenada</h2>
            <ul>
                <li>Pera</li>
                <li>Manzana</li>
                <li>Uva</li>
                <li>Piña</li>
                <li>Tomate</li>
            </ul>
            <ul>
                <li>Pera</li>
                <li>Manzana
                    <ul>
                        <li>Golden</li>
                        <li>Royal</li>
                        <li>Fuji</li>
                    </ul>
                </li>
                <li>Uva</li>
                <li>Piña</li>
                <li>Tomate</li>
            </ul>
        </div>
        <div style="width: 33%">
            <h2>Lista de definición</h2>
            <dl>
                <dt>Java</dt>
                <dd>Lenguaje de programación de lado del servidor</dd>
                <dt>JavaScript</dt>
                <dd>Lenguaje de programación del lado del cliente</dd>
            </dl>
        </div>
    </div>
    <hr>

    <h1><center>Tablas</center></h1>

    <div style="display: flex; margin: auto; width: 95%">
    <table border="1" style="border-collapse: collapse">
        <tr>
            <td>Nombre</td>
            <td>Apellidos</td>
            <td>Dirección</td>
            <td>Teléfono</td>
            <td>Edad</td>
            <td>Acciones</td>
        </tr>
        <tr>
            <td>Francisco José</td>
            <td>González</td>
            <td>San Roque</td>
            <td>635000000</td>
            <td>32</td>
            <td><a href="#" title="modificar">✏</a>
                <a href="#" title="eliminar">🗑</a>
            </td>
        </tr>
        <tr>
            <td>Isabel</td>
            <td>García</td>
            <td>Calle la Estación</td>
            <td>654678890</td>
            <td>35</td>
            <td><a href="#" title="modificar">✏</a>
                <a href="#" title="eliminar">🗑</a>
            </td>
        </tr>
    </table>
    </div>
</body>
</html>