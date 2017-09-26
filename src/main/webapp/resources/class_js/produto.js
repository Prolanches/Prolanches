angular.module("projecJava", [])
        .value('urlBase', 'http://localhost:9080/projecJava/rest/')
        .controller("ProdutoController", function ($http, urlBase) {
            var self = this;

            self.produtos = [];
            self.produto = undefined;

            self.novopro = function () {
                self.produto = {};
            };

            self.salvarpro = function () {
                var metodo = 'POST';
                if (self.produto.codigo) {
                    metodo = 'PUT';
                }

                $http({
                    method: metodo,
                    url: urlBase + 'produto/',
                    data: self.produto
                }).then(function successCallback(response) {
                    self.atualizarTabela();
                }, function errorCallback(response) {
                	console.log(response);
                    self.ocorreuErro();
                });
            };

            self.alterarpro = function (produto) {
                self.produto = produto;
            };

            self.deletarpro = function (produto) {
                self.produto = produto;

                $http({
                    method: 'DELETE',
                    url: urlBase + 'produto/' + self.produto.codigo + '/'
                }).then(function successCallback(response) {
                    self.atualizarTabela();
                }, function errorCallback(response) {
                    self.ocorreuErro();
                });
            };

            self.concluirpro = function (produto) {
                self.produto = produto;

                $http({
                    method: 'PUT',
                    url: urlBase + 'produto/' + self.produto.id + '/'
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
                    url: urlBase + 'produto/'
                }).then(function successCallback(response) {
                    self.produtos = response.data;
                    self.produto = undefined;
                }, function errorCallback(response) {
                    self.ocorreuErro();
                });
            };

            self.activate = function () {
                self.atualizarTabela();
            };
            self.activate();
        });