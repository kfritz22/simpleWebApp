<!DOCTYPE html>
<html>
<head>

<meta charset="UTF-8">

<title>SimpleWebApp</title>
</head>
<body>

<jsp:useBean id="greeting" class="com.fhlmc.nimble.simplewebapp.bean.Greeting"/>

<h3 id="greeting">${greeting.hello}</h3>



</body>
</html>