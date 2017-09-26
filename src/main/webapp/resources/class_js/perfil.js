angular.module("projecJava", [])
	   .value('urlBase', 'http://localhost:9080/projecJava/rest/')
	   .controller("PerfilController", function($http, urlBase) {
		   var self = this;
		   self.perfis = [];
		   self.perfil = undefined;
		   
		   self.novoperf = function () {
			   self.perfil = {};
		   };
	   
		   self.atualizarTabela = function () {
               $http({
                   method: 'GET',
                   url: urlBase + 'perfil/'
               }).then(function successCallback(response) {
            	   self.perfis = response.data;
                   self.perfil = undefined;
               }, function errorCallback(response) {
                   self.ocorreuErro();
               });
           };  
           
           self.activate = function () {
               self.atualizarTabela();
           };
           self.activate();
       });