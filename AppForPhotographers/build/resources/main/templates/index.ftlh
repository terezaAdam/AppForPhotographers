[#ftl]
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>AppPhotography</title>
    <link href="/static/style.css" rel="stylesheet"/>
</head>
<body>
<div class="head">
    <img class="foto" src= "/static/img/img_1.jpg" width="6000" alt="">
</div>
<div class="text">
    <h1>Are you photographer? Do you need help to set up your camera?</h1>
    <h2>Use the cheatsheet bellow!</h2>
</div>
<div class="overview">
    [#list settings as Set]
    <table class="table table-hover">${Set.name}</table>
        <div>${Set.iso}</div>
        <div>${Set.time}</div>
        <div>${Set.clone}</div>
    [/#list]
</div>
<div>If you want to join to community where you can share your pictures or meet people who have the same desire
    for photography as you, just click here - fill the form and enjoy!</div>
</body>
</html>