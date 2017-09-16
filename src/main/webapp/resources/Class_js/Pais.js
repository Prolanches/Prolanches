angular.module("projecJava", [])
	   .value('urlBase', 'http://localhost:9080/projecJava/rest/')
	   .controller("PaisController",function ($http, urlBase) {
		   var self = this;
		   self.paises = [];
		   self.pais = undefined;
		   
		   self.novo = function () {
			   self.pais = {};
		   };
	   
		   self.atualizarTabela = function () {
               $http({
                   method: 'GET',
                   url: urlBase + 'pais/'
               }).then(function successCallback(response) {
            	   self.paises = response.data;
                   self.pais = undefined;
               }, function errorCallback(response) {
                   self.ocorreuErro();
               });
           };  
           
           self.activate = function () {
               self.atualizarTabela();
           };
           self.activate();
       });