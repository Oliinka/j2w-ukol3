[#ftl]
<!DOCTYPE html>
<html lang="cs">
<head>
    <meta charset="UTF-8">
    <title>Vizitkovník</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="preconnect" href="https://fonts.gstatic.com">
    <link rel="stylesheet"
          href="https://maxst.icons8.com/vue-static/landings/line-awesome/line-awesome/1.3.0/css/line-awesome.min.css">
    <link rel="stylesheet" href="/css/style.css">
    <link rel="icon" type="image/png" href="/images/favicon.png">
</head>
<body>
<div class="detail">
    <div class="vizitka">
        <div class="jmeno">${vizitka.jmeno}</div>

        [#if vizitka.firma??]
            <div class="firma">${vizitka.firma}</div>
        [/#if]

        <div class="udaje">
            <div class="adresa">

                [#if vizitka.ulice??]
                    <div>${vizitka.ulice}</div>
                [/#if]
                [#if vizitka.getObecPsc??]
                    <div>${vizitka.obecPsc}</div>
                [/#if]
            </div>
            <div class="kontakty">
                [#if vizitka.email??]
                    <div><i class="las la-at"></i> <span>${vizitka.email}</span></div>
                [/#if]
                [#if vizitka.telefon??]
                    <div><i class="las la-phone-alt"></i> <span>${vizitka.telefon}</span></div>
                [/#if]

                [#if vizitka.web??]
                    <div><i class="las la-globe"></i> <span><a href="http://${vizitka.web}" target="_blank">${vizitka.web}</a></span></div>
                [/#if]
            </div>
        </div>
    </div>
    [#if vizitka.celaAdresa??]
        <div class="mapa">
            <iframe style="border:none" src="https://frame.mapy.cz/?q=${vizitka.celaAdresa?url}" width="100%"
                    height="100%" frameborder="0"></iframe>
        </div>
    [/#if]
    <a href="/" class="button">Home</a>

</div>
</body>
</html>
