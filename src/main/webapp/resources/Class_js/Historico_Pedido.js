angular.module("projecJava", [])
        .value('urlBase', 'http://localhost:9080/projecJava/rest/')
        .controller("Historico_PedidoController", function ($http, urlBase) {
            var self = this;

            self.historicos = [];
            self.historico = undefined;

            self.novo = function () {
                self.historico = {};
            };

            self.salvar = function () {
                var metodo = 'POST';
                if (self.historico.codigo) {
                    metodo = 'PUT';
                }

                $http({
                    method: metodo,
                    url: urlBase + 'historicopedido/',
                    data: self.historico
                }).then(function successCallback(response) {
                    self.atualizarTabela();
                }, function errorCallback(response) {
                	console.log(response);
                    self.ocorreuErro();
                });
            };

            self.alterar = function (historico) {
                self.historico = historico;
            };

            self.deletar = function (historico) {
                self.historico = historico;

                $http({
                    method: 'DELETE',
                    url: urlBase + 'historicopedido/' + self.historico.codigo + '/'
                }).then(function successCallback(response) {
                    self.atualizarTabela();
                }, function errorCallback(response) {
                    self.ocorreuErro();
                });
            };

            self.concluir = function (historico) {
                self.historico = historico;

                $http({
                    method: 'PUT',
                    url: urlBase + 'historicopedido/' + self.historico.id + '/'
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
                    self.historicos = response.data;
                    self.historico = undefined;
                }, function errorCallback(response) {
                    self.ocorreuErro();
                });
            };

            self.activate = function () {
                self.atualizarTabela();
            };
            self.activate();
        });
