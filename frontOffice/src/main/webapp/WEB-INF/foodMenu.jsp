<%-- 
    Document   : foodMenu
    Created on : 10 juin 2022, 15:49:23
    Author     : matformation
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Gauchatami | Food Menu</title>
    </head>
    <body>
        <h1></h1>
        <div id="main-menu-state">
            <p><progress id="health" value=${gauchatami.getHealth()} max="100"></progress>Santé</p>
            <p><progress id="hunger" value=${gauchatami.getHunger()} max="100"></progress>Faim</p>
            <p><progress id="tiredness" value=${gauchatami.getTiredness()} max="100"></progress>Fatigue</p>
            <p><progress id="boredom" value=${gauchatami.getBoredom()} max="100"></progress>Ennui</p>
            <p><progress id="dirt" value=${gauchatami.getDirt()} max="100"></progress>Saleté</p>
        </div>
        <div id="main-picture">
           <img src="pictures/egg.png" width="width" height="height" alt="photo état Gauchatami"/>
        </div>
        <div id=""main-menutaste>
            <p><progress id="sweet" value=${gauchatami.getTastes().get("sweet")} max="100"></progress>Sucré</p>
            <p><progress id="salty" value=${gauchatami.getTastes().get("salty")} max="100"></progress>Salé</p>
            <p><progress id="acid" value=${gauchatami.getTastes().get("acid")} max="100"></progress>Acide</p>
            <p><progress id="bitter" value=${gauchatami.getTastes().get("bitter")} max="100"></progress>Amer</p>
            <p><progress id="umami" value=${gauchatami.getTastes().get("umami")} max="100"></progress>Umami</p>
        </div>
        <div id="button-action">
            <button id="to-feed" type="button">Nourir</button>
            <button id="to-wash" type="button">Laver</button>
            <button id="to-sleep" type="button">Mettre au lit</button>
            <button id="to-play" type="button">Jouer</button>
        </div>
</body>
</html>