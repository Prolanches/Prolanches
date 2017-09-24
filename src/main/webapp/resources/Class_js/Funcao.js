angular.module("projecJava", [])
        .value('urlBase', 'http://localhost:9080/projecJava/rest/')
        .controller("FuncaoController", function ($http, urlBase) {
            var self = this;

            self.funcoes = [];
            self.funcao = undefined;

            self.novo = function () {
                self.funcao = {};
            };

            self.salvar = function () {
                var metodo = 'POST';
                if (self.funcao.codigo) {
                    metodo = 'PUT';
                }

                $http({
                    method: metodo,
                    url: urlBase + 'funcao/',
                    data: self.funcao
                }).then(function successCallback(response) {
                    self.atualizarTabela();
                }, function errorCallback(response) {
                	console.log(response);
                    self.ocorreuErro();
                });
            };

            self.alterar = function (funcao) {
                self.funcao = funcao;
            };

            self.deletar = function (funcao) {
                self.funcao = funcao;

                $http({
                    method: 'DELETE',
                    url: urlBase + 'funcao/' + self.funcao.codigo + '/'
                }).then(function successCallback(response) {
                    self.atualizarTabela();
                }, function errorCallback(response) {
                    self.ocorreuErro();
                });
            };

            self.concluir = function (funcao) {
                self.funcao = funcao;

                $http({
                    method: 'PUT',
                    url: urlBase + 'funcao/' + self.funcao.id + '/'
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
                    url: urlBase + 'funcao/'
                }).then(function successCallback(response) {
                    self.funcoes = response.data;
                    self.funcao = undefined;
                }, function errorCallback(response) {
                    self.ocorreuErro();
                });
            };

            self.activate = function () {
                self.atualizarTabela();
            };
            self.activate();
        });