angular.module("projecJava",[])
	   .value('urlBase', 'http://localhost:9080/projecJava/rest/')
	   .controller("EstadoController", function ($http, urlBase){
		   var self = this;
		   self.estados = [];
		   self.estado = undefined;
		   
		   self.novo = function () {
			   self.estado = {};
		   };
		   
		   self.atualizarTabela = function () {
			   $http({
				   method: 'GET',
				   url: urlBase + 'estado/'
			   }).then(function sucessCallback(response){
				   self.estados = response.data;
				   self.estado = undefined;
			   }, function errorCallback(response){
				   self.ocorreuErro();
			   });
		   };
		   self.active = function() {
			   self.atualizarTabela();
		   };
		   self.active();
	   });