angular.module("projecJava", [])
        .value('urlBase', 'http://localhost:9080/projecJava/rest/')
        .controller("EmpresaController", function ($http, urlBase) {
            var self = this;

            self.empresas = [];
            self.empresa = undefined;

            self.novo = function () {
                self.empresa = {};
            };

            self.salvar = function () {
                var metodo = 'POST';
                if (self.empresa.codigo) {
                    metodo = 'PUT';
                }

                $http({
                    method: metodo,
                    url: urlBase + 'empresa/',
                    data: self.empresa
                }).then(function successCallback(response) {
                    self.atualizarTabela();
                }, function errorCallback(response) {
                	console.log(response);
                    self.ocorreuErro();
                });
            };

            self.alterar = function (empresa) {
                self.empresa = empresa;
            };

            self.deletar = function (empresa) {
                self.empresa = empresa;

                $http({
                    method: 'DELETE',
                    url: urlBase + 'empresa/' + self.empresa.codigo + '/'
                }).then(function successCallback(response) {
                    self.atualizarTabela();
                }, function errorCallback(response) {
                    self.ocorreuErro();
                });
            };

            self.concluir = function (empresa) {
                self.empresa = empresa;

                $http({
                    method: 'PUT',
                    url: urlBase + 'empresa/' + self.empresa.id + '/'
                }).then(function successCallback(response) {
                    self.atualizarTabela();
                }, function errorCallback(response) {
                    self.ocorreuErro();
                });
            };

            self.ocorreuErro = function () {
                alert("Ocorreu um erro inesperado!");
            };

            self.atualizarTabela = function () {
                $http({
                    method: 'GET',
                    url: urlBase + 'empresa/'
                }).then(function successCallback(response) {
                    self.empresas = response.data;
                    self.empresa = undefined;
                }, function errorCallback(response) {
                    self.ocorreuErro();
                });
            };

            self.activate = function () {
                self.atualizarTabela();
            };
            self.activate();
        });