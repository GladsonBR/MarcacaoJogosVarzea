<%--
  Created by IntelliJ IDEA.
  User: vinif
  Date: 19/07/2022
  Time: 18:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="stylesheet" href="../css/style.css">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">
</head>
<body>
    <div>
        <h3 style=" background-color: white !important;;font-weight: bold; text-align:center;color:green; font-family:Roboto, sans-serif">Esporticias-Seu site de noticias e gerenciamento de marcação de jogos de varzea</h3>
    </div>
    <header class="cent-just">
               <nav class="navbar navbar-expand-lg navbar-light bg-light" >
                       <div class="container-fluid" id="bckground-nav">
                           <a class="navbar-brand" href="#"></a>
                           <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                               <span class="navbar-toggler-icon"></span>
                           </button>
                           <div class="collapse col-8 navbar-collapse" id="navbarSupportedContent">
                               <ul class="navbar-nav me-auto mb-2 mb-lg-0 center-align">
                                   <li class="nav-item">
                                       <a class="nav-link active" aria-current="page" href="#">Home</a>
                                   </li>
                                   <li class="nav-item">
                                       <a class="nav-link" href="http://localhost:8080/Sporticias/cadastrar">Cadastrar Times</a>
                                   </li>
                                   <li class="nav-item">
                                       <a class="nav-link" href="http://localhost:8080/Sporticias/marcacao">Marcar Jogos</a>
                                   </li>
                                   <li class="nav-item">
                                       <a class="nav-link" href="#">Contato</a>
                                   </li>
                                   <li class="nav-item">
                                       <a class="nav-link disabled"></a>
                                   </li>
                               </ul>
                               <form class="d-flex">
                                   <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
                                   <button class="btn btn-outline-success" type="submit">Search</button>
                               </form>
                           </div>
                       </div>
                   </nav>
       </header>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
</body>
</html>
