<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<!--Library Form Spring-->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    <meta charset="ISO-8859-1">
    <link rel="stylesheet" type="text/css" href="css/style.css">
    <title>Formulaire Livre</title>
</head>
<body>
    <div id="container" class="ms-5">
        <h2>Formulaire Livre</h2>
        <form:form action="processForm" modelAttribute="livre">
            <div class="mb-3">
              <label for="titre" class="form-label">Titre : </label>
              <form:input path="titre"/>
            </div>
            <div class="mb-3">
              <label for="auteur" class="form-label">Auteur : </label>
              <form:input path="auteur"/>
            </div>
            <div class="mb-3">
                <label for="prix" class="form-label">Prix : </label>
                <form:input path="prix"/>
            </div>
            <div class="input-group mb-3">
                <label class="input-group-text" for="editeur">Editeurs</label>
                <form:select path="editeur" items="${monEditeur}" />
            </div>
            <div class="form-check mb-3">
                <form:radiobuttons path="edition" items="${monEdition}" />
            </div>
            <div class="form-check mb-3">
                <label for="classique">Classique</label>
                <form:checkbox path="genre" value="Classique" />
                <label for="genre">Science-fiction</label>
                <form:checkbox path="genre" value="Science-fiction" />
                <label for="genre">Aventure</label>
                <form:checkbox path="genre" value="Aventure" />
                <label for="genre">Policier</label>
                <form:checkbox path="genre" value="Policier" />
            </div>
              
              <br>
            <button type="submit" class="btn btn-outline-info" style="text-decoration: none;">Submit</button>

        </form:form>
    </div>

      <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous">
    </script>
</body>
</html>