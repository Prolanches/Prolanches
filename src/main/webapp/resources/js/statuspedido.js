angular.module("projecJava", [])
	   .value('urlBase', 'http://localhost:9080/projecJava/rest/')
	   .controller("Status_PedidoController", function($http, urlBase) {
		   var self = this;
		   self.statuspedidos = [];
		   self.statuspedido = undefined;
		   
		   self.novosta = function () {
			   self.statuspedido = {};
		   };
	   
		   self.atualizarTabela = function () {
               $http({
                   method: 'GET',
                   url: urlBase + 'statusPedido/'
               }).then(function successCallback(response) {
            	   self.statuspedidos = response.data;
                   self.statuspedido = undefined;
               }, function errorCallback(response) {
                   self.ocorreuErro();
               });
           };  
           
           self.activate = function () {
               self.atualizarTabela();
           };
           self.activate();
       });