angular.module("projecJava", [])
        .value('urlBase', 'http://localhost:9080/projecJava/rest/')
        .controller("PedidoController", function ($http, urlBase) {
            var self = this;

            self.pedidos = [];
            self.pedido = undefined;

            self.novoped = function () {
                self.pedido = {};
            };

            self.salvarped = function () {
                var metodo = 'POST';
                if (self.pedido.codigo) {
                    metodo = 'PUT';
                }

                $http({
                    method: metodo,
                    url: urlBase + 'pedido/',
                    data: self.pedido
                }).then(function successCallback(response) {
                    self.atualizarTabela();
                }, function errorCallback(response) {
                	console.log(response);
                    self.ocorreuErro();
                });
            };

            self.alterarped = function (pedido) {
                self.pedido = pedido;
            };

            self.deletarped = function (pedido) {
                self.pedido = pedido;

                $http({
                    method: 'DELETE',
                    url: urlBase + 'pedido/' + self.pedido.codigo + '/'
                }).then(function successCallback(response) {
                    self.atualizarTabela();
                }, function errorCallback(response) {
                    self.ocorreuErro();
                });
            };

            self.concluirped = function (pedido) {
                self.pedido = pedido;

                $http({
                    method: 'PUT',
                    url: urlBase + 'pedido/' + self.pedido.id + '/'
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
                    url: urlBase + 'pedido/'
                }).then(function successCallback(response) {
                    self.pedidos = response.data;
                    self.pedido = undefined;
                }, function errorCallback(response) {
                    self.ocorreuErro();
                });
            };

            self.activate = function () {
                self.atualizarTabela();
            };
            self.activate();
        });