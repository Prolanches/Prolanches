angular.module("projecJava", []).value('urlBase',
		'http://localhost:9080/projecJava/rest/').controller("MarcaController",
		function($http, urlBase) {
			var self = this;

			self.marcas = [];
			self.marca = undefined;

			self.novomar = function() {
				self.marca = {};
			};

			self.salvarmar = function() {
				var metodo = 'POST';
				if (self.marca.codigo) {
					metodo = 'PUT';
				}

				$http({
					method : metodo,
					url : urlBase + 'marca/',
					data : self.marca
				}).then(function successCallback(response) {
					self.atualizarTabela();
				}, function errorCallback(response) {
					console.log(response);
					self.ocorreuErro();
				});
			};
			self.deletarmar = function(marca) {
				self.marca = marca;

				$http({
					method : 'DELETE',
					url : urlBase + 'marca/' + self.marca.codigo + '/'
				}).then(function successCallback(response) {
					self.atualizarTabela();
				}, function errorCallback(response) {
					self.ocorreuErro();
				});
			};

			self.ocorreuErro = function() {
				alert("Ocorreu um erro inesperado!");
			};

			self.atualizarTabela = function() {
				$http({
					method : 'GET',
					url : urlBase + 'marca/'
				}).then(function successCallback(response) {
					self.marcas = response.data;
					self.marca = undefined;
				}, function errorCallback(response) {
					self.ocorreuErro();
				});
			};

			self.activate = function() {
				self.atualizarTabela();
			};
			self.activate();
		});
