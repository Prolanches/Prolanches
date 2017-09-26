angular.module("projecJava", [])
        .value('urlBase', 'http://localhost:9080/projecJava/rest/')
        .controller("UsuarioController", function ($http, urlBase) {
            var self = this;

            self.usuarios = [];
            self.usuario = undefined;

            self.novousu = function () {
                self.usuario = {};
            };

            self.salvarusu = function () {
                var metodo = 'POST';
                if (self.usuario.codigo) {
                    metodo = 'PUT';
                }

                $http({
                    method: metodo,
                    url: urlBase + 'usuario/',
                    data: self.usuario
                }).then(function successCallback(response) {
                    self.atualizarTabela();
                }, function errorCallback(response) {
                	console.log(response);
                    self.ocorreuErro();
                });
            };

            self.alterarusu = function (usuario) {
                self.usuario = usuario;
            };

            self.deletarusu = function (usuario) {
                self.usuario = usuario;

                $http({
                    method: 'DELETE',
                    url: urlBase + 'usuario/' + self.usuario.codigo + '/'
                }).then(function successCallback(response) {
                    self.atualizarTabela();
                }, function errorCallback(response) {
                    self.ocorreuErro();
                });
            };

            self.concluirusu = function (usuario) {
                self.usuario = usuario;

                $http({
                    method: 'PUT',
                    url: urlBase + 'usuario/' + self.usuario.id + '/'
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
                    url: urlBase + 'usuario/'
                }).then(function successCallback(response) {
                    self.usuarios = response.data;
                    self.usuario = undefined;
                }, function errorCallback(response) {
                    self.ocorreuErro();
                });
            };

            self.activate = function () {
                self.atualizarTabela();
            };
            self.activate();
        });