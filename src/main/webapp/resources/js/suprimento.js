angular.module("projecJava", [])
        .value('urlBase', 'http://localhost:9080/projecJava/rest/')
        .controller("Suprimento_Controller", function ($http, urlBase) {
            var self = this;

            self.suprimentos = [];
            self.suprimento = undefined;

            self.novosup = function () {
                self.suprimento = {};
            };

            self.salvarsup = function () {
                var metodo = 'POST';
                if (self.suprimento.codigo) {
                    metodo = 'PUT';
                }

                $http({
                    method: metodo,
                    url: urlBase + 'suprimento/',
                    data: self.suprimento
                }).then(function successCallback(response) {
                    self.atualizarTabela();
                }, function errorCallback(response) {
                	console.log(response);
                    self.ocorreuErro();
                });
            };

            self.alterarsup = function (suprimento) {
                self.suprimento = suprimento;
            };

            self.deletarsup = function (suprimento) {
                self.suprimento = suprimento;

                $http({
                    method: 'DELETE',
                    url: urlBase + 'suprimento/' + self.suprimento.codigo + '/'
                }).then(function successCallback(response) {
                    self.atualizarTabela();
                }, function errorCallback(response) {
                    self.ocorreuErro();
                });
            };

            self.concluirsup = function (suprimento) {
                self.suprimento = suprimento;

                $http({
                    method: 'PUT',
                    url: urlBase + 'suprimento/' + self.suprimento.id + '/'
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
                    url: urlBase + 'suprimento/'
                }).then(function successCallback(response) {
                    self.suprimentos = response.data;
                    self.suprimento = undefined;
                }, function errorCallback(response) {
                    self.ocorreuErro();
                });
            };

            self.activate = function () {
                self.atualizarTabela();
            };
            self.activate();
        });