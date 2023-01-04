<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>HotelFort - Справочник отелей</title>
</head>
<body>
<h1>Список отелей</h1>
<form>
    <input type="text" name="country" placeholder="название страны">
    <input type="text" name="capital" placeholder="столица">
    <input type="button" value="Добавить">
</form>
<form method="post" action="/hotels/search">
    <input type="text" name="search" placeholder="Four Seasons Hotel">
    <input type="submit" value="Найти">
</form>
<form method="post" action="/hotels/country">
    <nav class="navbar navbar-expand-lg navbar-light bg-light">
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNavDropdown" aria-controls="navbarNavDropdown" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>

        <div class="collapse navbar-collapse" id="navbarNavDropdown">
            <ul class="navbar-nav">
                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" href="#" id="navbarDropdownMenuLink" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">Страна</a>
                    <div class="dropdown-menu" aria-labelledby="navbarDropdownMenuLink">
                        <a class="dropdown-item" href="#">Любая</a>
                        <g:each in="${countries}" var="country">
                        <a class="dropdown-item" href="#">${country.name}</a>
                        </g:each>
                    </div>
                </li>

            </ul>
        </div>

    </nav>
</form>
<div id="content" role="main">
    <div class="container">
            <g:each in="${hotels}" var="hotel" status="i">
                <h2>${i+1}. ${hotel.name}</h2>
                <p>Звездность: ${hotel.rating}</p>
                <p>Страна: ${hotel.country.name}</p>
                <script>
                    let count${i+1} = 1;
                </script>
                <button onclick="
                    switch (count${i+1}){
                        case 1:
                            document.getElementById('edit${i+1}').style.visibility = 'visible';
                            document.getElementById('edit${i+1}').style.marginBottom = 0;
                            document.getElementById('edit${i+1}').style.opacity = 100 + '%';
                            break;
                        case 2:
                            document.getElementById('edit${i+1}').style.visibility = 'collapse';
                            document.getElementById('edit${i+1}').style.marginBottom = -document.getElementById('edit${i+1}').offsetHeight + 'px';
                            document.getElementById('edit${i+1}').style.opacity = 0 + '%';
                            count${i+1}=0;
                            break;
                    }
                    count${i+1}=count${i+1}+1;
                ">Редактировать</button>
                <form id="edit${i+1}" method="post" action="/hotels/${i+1}/update" style="transition: ease all 0.2s">
                    <input type="text" name="hotel_name" value="${hotel.name}">
                    <input type="text" name="hotel_rating" value="${hotel.rating}">
                    <input type="text" name="hotel_link" value="${hotel.link}">
                    <input type="text" name="hotel_country" value="${hotel.country}">
                    <input type="submit" value="Сохранить изменения">
                </form>
                <script>
                    document.getElementById('edit${i+1}').style.visibility = 'collapse';
                    document.getElementById('edit${i+1}').style.marginBottom = -document.getElementById('edit${i+1}').offsetHeight + 'px';
                    document.getElementById('edit${i+1}').style.opacity = 0 + '%';
                </script>
                <form method="post" action="hotels/${i+1}">
                    <input type="submit" value="Удалить">
                </form>
            </g:each>
    </div>
</div>

</body>
</html>