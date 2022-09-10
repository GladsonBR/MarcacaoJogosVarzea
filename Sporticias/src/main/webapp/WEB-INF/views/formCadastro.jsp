<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:directive.page isELIgnored="false"/>
<!doctype html>
<html lang="pt">
<head>
    <meta charset="ISO-8859-1">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">

    <link rel="stylesheet" href="./css/styleForm.css">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">
    <!--Import Google Icon Font-->
    <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">

    <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
    <title>Realizar Cadastro</title>
</head>
<body>
    <header>
        <jsp:include page="../../componentes/Header.jsp"/>
    </header>
    <div class="form-group margin-form">
        <form action="http://localhost:8080/Sporticias/cadastrar" method="post">
        <div class="row d-flex justify-content-center">
                    <div class="col-10 bg-light border border-secondary rounded p-5">
                        <div class="row">
                            <div class="col-12">
                                <div class="mb-4"><h2>Cadastro de Time</h2></div>
                            </div>
                        </div>
                        <div class="row d-flex">
                            <div class="col-12">
                                <div class="mt-3 mb-4">Preencha os campos abaixo para fazer o seu cadastro!</div>
                                <form action="http://localhost:8080/blueSupermarket/usuario" method="post">
                                    <div class="row mb-3">
                                        <div class="col-7">
                                            <label for="nome">Nome do Time:</label>
                                            <input class="form-control" name="nomeTime" type="text" required="required">
                                        </div>
                                        <div class="col-4">
                                            <label for="cor">Cor Predominante Uniforme:</label>
                                            <input class="form-control" name="corUniforme" type="text" required="required">
                                        </div>
                                    </div>
                                    <div class="row mb-5">
                                        <div class="col-3">
                                            <label for="horario">Horário Fixo da Partida:</label>
                                            <input class="form-control" name="horarioJogo" type="text" required="required">
                                        </div>
                                        <div class="col-4">
                                            <label for="login">Loggin do Usuário: </label>
                                            <input class="form-control" name="login" type="text" required="required">
                                        </div>
                                        <div class="col-4">
                                            <label for="senha">Senha do Usuário: </label>
                                            <input class="form-control" name="senha" type="password" required="required">
                                        </div>
                                    </div>
                                    <div class="row mb-3">
                                        <div class="col-3">
                                            <label for="cnpj">CNPJ Campo: </label>
                                            <input class="form-control" name="cnpj" type="text" required="required">
                                        </div>
                                        <div class="col-5">
                                            <label for="campo">Nome do Campo: </label>
                                            <input class="form-control" name="nomeCampo" type="text" required="required">
                                        </div>
                                        <div class="col-10>
                                            <label for="endereco">Endereço Completo do Campo (Logradoruro, Numero, Bairro, Cidade, Estado):</label>
                                            <input class="form-control" name="endereco" type="text" required="required">
                                        </div>
                                    </div>
                                    <div class="row mb-4">
                                        <div class="col-4">
                                            <label for="tipo">Tipo do Campo(Gramado ou Terra):</label>
                                            <input class="form-control" name="tipoCampo" type="text" required="required">
                                        </div>
                                        <div class="col-5">
                                            <label for="iluminacao">Tipo de Iluminação: </label>
                                            <input class="form-control"  name="iluminacao" type="text" required="required">
                                        </div>
                                    </div>


                                    <button class="btn btn-primary" type="submit" id="btn">Salvar</button>
                                </form>
                            </div>
                        </div>
                    </div>
                </div>
        </form>
    </div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
</body>
</html>