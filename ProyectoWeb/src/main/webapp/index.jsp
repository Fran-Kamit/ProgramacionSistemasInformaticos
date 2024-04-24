<!doctype html> <!-- doctype -> indica al navegador el tipo de documento a mostrar-->
<html lang="es"> <!-- lang="es" -> estamos indicando que la página est´´a en español-->
<head> <!-- Encabezado del documento, la mayoría de los metas no se muestran -->
    <meta charset="UTF-8"/> <!-- Tipo de caracteres aceptados -->
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0"/>
    <meta http-equiv="X-UA-Compatible" content="ie=edge"/>
    <meta name="author" content="Francsico José González"/>
    <meta name="keyworks" content="html,java,jsp"/>
    <link rel="stylesheet" href="https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined:opsz,wght,FILL,GRAD@24,400,0,0" />
    <title>Mi primer JSP con HTML</title> <!-- Título obligatorio para la página -->
</head>
<body>
    <h1><center>Mi primer JSP con HTML</center></h1>

    <center>
    <a href="index.jsp"><span class="material-symbols-outlined">home</span></a>
    <a href="listas_y_tablas.jsp"><span class="material-symbols-outlined">list</span></a>
    </center>

    <h1>Encabezado H1</h1>
    <h2>Encabezado H2</h2>
    <h3>Encabezado H3</h3>
    <h4>Encabezado H4</h4>
    <h5>Encabezado H5</h5>
    <h6>Encabezado H6</h6>

    <p>
        Lorem ipsum dolor sit amet, consectetur adipisicing elit. Consequatur debitis delectus dolor et facilis illo inventore ipsam libero, magni minus modi mollitia, numquam omnis pariatur porro totam veniam vitae, voluptas.
        Lorem ipsum dolor sit amet, consectetur adipisicing elit. Ab accusantium ad adipisci amet consequuntur dignissimos distinctio doloribus esse itaque iusto minima nisi, quasi quos repellat sit, soluta ut vitae voluptas!
    </p>
    <hr/><!-- Línea -->
    <p>
        Lorem ipsum dolor sit amet, consectetur adipisicing elit. Accusamus, aperiam at autem dicta distinctio doloremque, dolorum est eum, exercitationem expedita ipsa laudantium maxime quam quod recusandae reprehenderit repudiandae ut veniam.
    </p>

    <div><img src="Views/images/SuperMan.jpg" alt="Póster de la película Superman"/></div>

    <br/><!-- Salto de línea -->

    <div><img src="Views/images/PechoSuperman.jpg" alt="Pecho de Superman"/></div>

    <div><video src='Views/video/TrailerSuper.mp4' autoplay muted controls loop></video></div>

    <div><iframe width="560" height="315" src="https://www.youtube.com/embed/shLNO7fY2hc?si=RhP1rAC83u7wgIKW" title="Batamanta" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" referrerpolicy="strict-origin-when-cross-origin" allowfullscreen></iframe></div>

    <div><iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d2187.4597075756906!2d-3.0245246323661346!3d39.162552469122375!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0xd68fc7957b0bb75%3A0xad9d7d14ed65567f!2sCentro%20de%20Estudios%20CEAT%20S.L.!5e0!3m2!1ses-419!2ses!4v1713975146522!5m2!1ses-419!2ses" width="600" height="450" style="border:0;" allowfullscreen="" loading="lazy" referrerpolicy="no-referrer-when-downgrade"></iframe></div>

    <hr/>

    <h1>Audio</h1>

    <div><audio src="Views/audio/BandaSonor.ogg" controls muted autoplay></audio></div>
</body>
</html>