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
    <script src="js/script.js"></script>
    <title>Formulaire Livre</title>
</head>
<body>
    <div id="container" class="ms-5">
        <h2>Validation Formulaire Livre</h2>
        <p>Titre: ${livre.titre}</p>
        <p>Auteur: ${livre.auteur}</p>
        <p>Prix: ${livre.prix}</p>
        <p>Editeur: ${livre.editeur}</p>
        <p>Edition: ${livre.edition}</p>
        <ul>
            <c:forEach var="genre" items="${livre.genre}">
                <li>Genre: ${genre}</li>
            </c:forEach>
        </ul>
        <button type="submit" class="btn btn-outline-info"><a href="afficheLivreForm" onclick="retour()" style="text-decoration: none;">Retour</a></button> 
    </div>
    

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous">
    </script>
</body>
</html>