angular.module("projecJava", [])
        .value('urlBase', 'http://localhost:9080/projecJava/rest/')
        .controller("FornecedorController", function ($http, urlBase) {
            var self = this;

            self.fornecedores = [];
            self.fornecedor = undefined;

            self.novo = function () {
                self.fornecedor = {};
            };

            self.salvar = function () {
                var metodo = 'POST';
                if (self.fornecedor.codigo) {
                    metodo = 'PUT';
                }

                $http({
                    method: metodo,
                    url: urlBase + 'fornecedor/',
                    data: self.fornecedor
                }).then(function successCallback(response) {
                    self.atualizarTabela();
                }, function errorCallback(response) {
                	console.log(response);
                    self.ocorreuErro();
                });
            };

            self.alterar = function (fornecedor) {
                self.fornecedor = fornecedor;
            };

            self.deletar = function (fornecedor) {
                self.fornecedor = fornecedor;

                $http({
                    method: 'DELETE',
                    url: urlBase + 'fornecedor/' + self.fornecedor.codigo + '/'
                }).then(function successCallback(response) {
                    self.atualizarTabela();
                }, function errorCallback(response) {
                    self.ocorreuErro();
                });
            };

            self.concluir = function (fornecedor) {
                self.fornecedor = fornecedor;

                $http({
                    method: 'PUT',
                    url: urlBase + 'fornecedor/' + self.fornecedor.id + '/'
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
                    url: urlBase + 'fornecedor/'
                }).then(function successCallback(response) {
                    self.fornecedores = response.data;
                    self.fornecedor = undefined;
                }, function errorCallback(response) {
                    self.ocorreuErro();
                });
            };

            self.activate = function () {
                self.atualizarTabela();
            };
            self.activate();
        });