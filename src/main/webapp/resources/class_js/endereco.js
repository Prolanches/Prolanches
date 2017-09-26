angular.module("projecJava", [])
        .value('urlBase', 'http://localhost:9080/projecJava/rest/')
        .controller("EnderecoController", function ($http, urlBase) {
            var self = this;

            self.enderecos = [];
            self.endereco = undefined;

            self.novoend = function () {
                self.endereco = {};
            };

            self.salvarend = function () {
                var metodo = 'POST';
                if (self.endereco.codigo) {
                    metodo = 'PUT';
                }

                $http({
                    method: metodo,
                    url: urlBase + 'endereco/',
                    data: self.endereco
                }).then(function successCallback(response) {
                    self.atualizarTabela();
                }, function errorCallback(response) {
                	console.log(response);
                    self.ocorreuErro();
                });
            };

            self.alterarend = function (endereco) {
                self.endereco = endereco;
            };

            self.deletarend = function (endereco) {
                self.endereco = endereco;

                $http({
                    method: 'DELETE',
                    url: urlBase + 'endereco/' + self.endereco.codigo + '/'
                }).then(function successCallback(response) {
                    self.atualizarTabela();
                }, function errorCallback(response) {
                    self.ocorreuErro();
                });
            };

            self.concluirend = function (endereco) {
                self.endereco = endereco;

                $http({
                    method: 'PUT',
                    url: urlBase + 'endereco/' + self.endereco.id + '/'
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
                    url: urlBase + 'endereco/'
                }).then(function successCallback(response) {
                    self.enderecos = response.data;
                    self.endereco = undefined;
                }, function errorCallback(response) {
                    self.ocorreuErro();
                });
            };

            self.activate = function () {
                self.atualizarTabela();
            };
            self.activate();
        });