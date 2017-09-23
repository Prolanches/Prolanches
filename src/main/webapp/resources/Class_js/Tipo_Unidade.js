angular.module("projecJava", [])
	   .value('urlBase', 'http://localhost:9080/projecJava/rest/')
	   .controller("Tipo_UnidadeController", function($http, urlBase) {
		   var self = this;
		   self.tipoUnidades = [];
		   self.tipoUnidade = undefined;
		   
		   self.novo = function () {
			   self.tipoUnidade = {};
		   };
	   
		   self.atualizarTabela = function () {
               $http({
                   method: 'GET',
                   url: urlBase + 'tipoUnidade/'
               }).then(function successCallback(response) {
            	   self.tipoUnidades = response.data;
                   self.tipoUnidade = undefined;
               }, function errorCallback(response) {
                   self.ocorreuErro();
               });
           };  
           
           self.activate = function () {
               self.atualizarTabela();
           };
           self.activate();
       });