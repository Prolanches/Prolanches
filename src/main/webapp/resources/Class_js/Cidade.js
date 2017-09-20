angular.module("projecJava", [])
	   .value('urlBase', 'http;//localhost:9080/projecJava/rest/')
	   .controller("CidadeController", function($http, urlBase){
		   var self = this;
		   self.cidades = [];
		   self.cidade = undefined;
		   
		   self.novo = function () {
			   self.cidade = {};
		   };
		   
		   self.atualizarTabela = function () {
			   $http({
				   method: 'GET',
				   url: urlBase + 'cidade/'
			   }).then(function sucessCallback(response){
				   self.cidades = response.data;
				   self.cidade = undefined;
			   },function erroCallback(response){
				   self.ocorreuErro();
			   });
		   };
		   self.activate = function() {
			   self.atualizarTabela();
		   };
		   self.activate();
	   });