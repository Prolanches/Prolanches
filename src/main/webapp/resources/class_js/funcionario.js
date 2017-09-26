angular.module("projecJava", [])
        .value('urlBase', 'http://localhost:9080/projecJava/rest/')
        .controller("FuncionarioController", function ($http, urlBase) {
            var self = this;

            self.funcionarios = [];
            self.funcionario = undefined;

            self.novofunc = function () {
                self.funcionario = {};
            };

            self.salvarfunc = function () {
                var metodo = 'POST';
                if (self.funcionario.codigo) {
                    metodo = 'PUT';
                }

                $http({
                    method: metodo,
                    url: urlBase + 'funcionario/',
                    data: self.funcionario
                }).then(function successCallback(response) {
                    self.atualizarTabela();
                }, function errorCallback(response) {
                	console.log(response);
                    self.ocorreuErro();
                });
            };

            self.alterarfunc = function (funcionario) {
                self.funcionario = funcionario;
            };

            self.deletarfunc = function (funcionario) {
                self.funcionario = funcionario;

                $http({
                    method: 'DELETE',
                    url: urlBase + 'funcionario/' + self.funcionario.codigo + '/'
                }).then(function successCallback(response) {
                    self.atualizarTabela();
                }, function errorCallback(response) {
                    self.ocorreuErro();
                });
            };

            self.concluirfunc = function (funcionario) {
                self.funcioanrio = funcionario;

                $http({
                    method: 'PUT',
                    url: urlBase + 'funcionario/' + self.funcionario.id + '/'
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
                    url: urlBase + 'funcionario/'
                }).then(function successCallback(response) {
                    self.funcionarios = response.data;
                    self.funcionario = undefined;
                }, function errorCallback(response) {
                    self.ocorreuErro();
                });
            };

            self.activate = function () {
                self.atualizarTabela();
            };
            self.activate();
        });