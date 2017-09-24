angular.module("projecJava", [])
        .value('urlBase', 'http://localhost:9080/projecJava/rest/')
        .controller("Contas_PagarController", function ($http, urlBase) {
            var self = this;

            self.pagaras = [];
            self.pagar = undefined;

            self.novo = function () {
                self.pagar = {};
            };

            self.salvar = function () {
                var metodo = 'POST';
                if (self.pagar.codigo) {
                    metodo = 'PUT';
                }

                $http({
                    method: metodo,
                    url: urlBase + 'contaspagar/',
                    data: self.pagar
                }).then(function successCallback(response) {
                    self.atualizarTabela();
                }, function errorCallback(response) {
                	console.log(response);
                    self.ocorreuErro();
                });
            };

            self.alterar = function (pagar) {
                self.pagar = pagar;
            };

            self.deletar = function (pagar) {
                self.pagar = pagar;

                $http({
                    method: 'DELETE',
                    url: urlBase + 'contaspagar/' + self.pagar.codigo + '/'
                }).then(function successCallback(response) {
                    self.atualizarTabela();
                }, function errorCallback(response) {
                    self.ocorreuErro();
                });
            };

            self.concluir = function (pagar) {
                self.pagar = pagar;

                $http({
                    method: 'PUT',
                    url: urlBase + 'contaspagar/' + self.pagar.id + '/'
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
                    url: urlBase + 'contaspagar/'
                }).then(function successCallback(response) {
                    self.pagaras = response.data;
                    self.pagar = undefined;
                }, function errorCallback(response) {
                    self.ocorreuErro();
                });
            };

            self.activate = function () {
                self.atualizarTabela();
            };
            self.activate();
        });