<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html ng-app="miapp">
<head>
<title>MPA</title>

</head>

<body ng-controller="micontrolador">
<input ng-model="placa" type="text" ng-keyup="uppercase_placa()" placeholder="ABC123" />
<input type="button" value="Existe La placa" ng-click="post_existe()" />
<input type="button" value="Infracciones" ng-click="get_infraccion()" />
<input type="button" value="Papeletas" ng-click="post_papeleta()" />
<input type="button" value="Permisos" ng-click="post_permiso()" />
<input type="button" value="Datos" ng-click="post_dato()" />
<br />
Resultado:<br />
{{rp}}

 <script src="angular/angular.min.js"></script>
 <script src="angular/app.js"></script>

</body>

</html>