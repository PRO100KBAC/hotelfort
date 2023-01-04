<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>HotelFort - Справочник стран</title>
</head>
<body>
<div id="content" role="main">
    <div class="container">
        <h1>Список стран</h1>
        <form method="get" action="countries/create">
            <input type="text" name="country" placeholder="название страны">
            <input type="text" name="capital" placeholder="столица">
            <input type="submit" value="Добавить">
        </form>
        <g:each in="${countries}" var="country" status="i">
            <h2>${i+1}. ${country.name}</h2>
            <p>Столица: ${country.capital}</p>
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
            <form id="edit${i+1}" method="post" action="/countries/${i+1}/update" style="transition: ease all 0.2s">
                <input type="text" name="country_name" value="${country.name}">
                <input type="text" name="country_capital" value="${country.capital}">
                <input type="submit" value="Сохранить изменения">
            </form>
            <script>
                document.getElementById('edit${i+1}').style.visibility = 'collapse';
                document.getElementById('edit${i+1}').style.marginBottom = -document.getElementById('edit${i+1}').offsetHeight + 'px';
                document.getElementById('edit${i+1}').style.opacity = 0 + '%';
            </script>
            <form method="post" action="countries/${i+1}">
                <input type="submit" value="Удалить">
            </form>
        </g:each>
    </div>
</div>

</body>
</html>