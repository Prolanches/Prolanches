angular.module("projecJava", [])
        .value('urlBase', 'http://localhost:9080/projecJava/rest/')
        .controller("Contas_ReceberController", function ($http, urlBase) {
            var self = this;

            self.recebes = [];
            self.recebe = undefined;

            self.novo = function () {
                self.recebe = {};
            };

            self.salvar = function () {
                var metodo = 'POST';
                if (self.recebe.codigo) {
                    metodo = 'PUT';
                }

                $http({
                    method: metodo,
                    url: urlBase + 'contasreceber/',
                    data: self.recebe
                }).then(function successCallback(response) {
                    self.atualizarTabela();
                }, function errorCallback(response) {
                	console.log(response);
                    self.ocorreuErro();
                });
            };

            self.alterar = function (recebe) {
                self.recebe = recebe;
            };

            self.deletar = function (recebe) {
                self.recebe = recebe;

                $http({
                    method: 'DELETE',
                    url: urlBase + 'contasreceber/' + self.recebe.codigo + '/'
                }).then(function successCallback(response) {
                    self.atualizarTabela();
                }, function errorCallback(response) {
                    self.ocorreuErro();
                });
            };

            self.concluir = function (recebe) {
                self.recebe = recebe;

                $http({
                    method: 'PUT',
                    url: urlBase + 'contasreceber/' + self.recebe.id + '/'
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
                    url: urlBase + 'contasreceber/'
                }).then(function successCallback(response) {
                    self.recebes = response.data;
                    self.recebe = undefined;
                }, function errorCallback(response) {
                    self.ocorreuErro();
                });
            };

            self.activate = function () {
                self.atualizarTabela();
            };
            self.activate();
        });