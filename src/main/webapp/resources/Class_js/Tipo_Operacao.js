angular.module("projecJava", [])
	   .value('urlBase', 'http://localhost:9080/projecJava/rest/')
	   .controller("Tipo_OperacaoController", function($http, urlBase) {
		   
		   var self = this;
		   self.tipoOperacoes = [];
		   self.tipoOperaco = undefined;
		   
		   self.novotip = function () {
			   self.tipoOperacao = {};
		   };
	   
		   self.atualizarTabela = function () {
               $http({
                   method: 'GET',
                   url: urlBase + 'tipoOperacao/'
               }).then(function successCallback(response) {
            	   self.tipoOperacoes = response.data;
                   self.tipoOperacao = undefined;
               }, function errorCallback(response) {
                   self.ocorreuErro();
               });
           };  
           
           self.activate = function () {
               self.atualizarTabela();
           };
           self.activate();
       });