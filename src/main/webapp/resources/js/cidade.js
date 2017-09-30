angular.module("projecJava",[])
	   .value('urlBase', 'http://localhost:9080/projecJava/rest/')
	   .controller("CidadeController", function ($http, urlBase){
		   var self = this;
		   self.cidades = [];
		   self.cidade = undefined;
		   
		   self.novo = function () {
			   self.cidade = {};
		   };
		   
		   self.atualizarTabela = function () {
			   $http({
				   method: 'GET',
				   url: urlBase + 'cidades/'
			   }).then(function successCallback(response){
				   self.cidades = response.data;
				   self.cidade = undefined;
			   }, function errorCallback(response){
				   self.ocorreuErro();
			   });
		   };
		   self.activate = function() {
			   self.atualizarTabela();
		   };
		   self.activate();
	   });