var app = angular.module('miapp', []);

app.controller('micontrolador', ['$scope','$http',function($scope,$http){
	$scope.rp="Aqui va la respuesta";
	$scope.placa="";
	
	$scope.uppercase_placa = function (){
		$scope.placa = $scope.placa.toUpperCase(); 
	};
		
	$scope.get_infraccion= function(){
		$http.get("http://localhost:8080/PuridiomServicesMpaSF/consult/infraccion.do").success(function(data, status, headers, config){
			$scope.rp=data;
		}).error(function(){
			alert('Falla en la conexion');
		});
	}
	
	$scope.post_papeleta= function(){
		var dato = { 'placa' : $scope.placa.toLowerCase()};//JSON.stringify(placa) PARA CONVERTIR en AJAX FALLA
		$http.post("http://localhost:8080/PuridiomServicesMpaSF/consult/papeleta.do",dato).success(function(data, status, headers, config){
			$scope.rp=data;
		}).error(function(){
			alert('Falla en la conexion');
		});
	}
	
	$scope.post_permiso= function(){
		var dato = { 'placa' : $scope.placa.toLowerCase()};//JSON.stringify(placa) PARA CONVERTIR en AJAX FALLA
		$http.post("http://localhost:8080/PuridiomServicesMpaSF/consult/permiso.do",dato).success(function(data, status, headers, config){
			$scope.rp=data;
		}).error(function(){
			alert('Falla en la conexion');
		});
	}
	
	$scope.post_dato= function(){
		var dato = { 'placa' : $scope.placa.toLowerCase()};//JSON.stringify(placa) PARA CONVERTIR en AJAX FALLA
		$http.post("http://localhost:8080/PuridiomServicesMpaSF/consult/dato.do",dato).success(function(data, status, headers, config){
			$scope.rp=data;
			//alert(data[0].marca);
		}).error(function(){
			alert('Falla en la conexion');
		});
	}
	
	$scope.post_existe= function(){
		var dato = { 'placa' : $scope.placa.toLowerCase()};//JSON.stringify(placa) PARA CONVERTIR en AJAX FALLA
		$http.post("http://localhost:8080/PuridiomServicesMpaSF/consult/existe.do",dato).success(function(data, status, headers, config){
			if(data) $scope.rp="La placa "+$scope.placa+" existe!";
			else $scope.rp="La placa "+$scope.placa+" no existe!";
		}).error(function(){
			alert('Falla en la conexion');
		});
	}
	
 }]);