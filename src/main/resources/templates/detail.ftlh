[#ftl]
<!DOCTYPE html>
<html lang="cs">
<head>
    <meta charset="UTF-8">
    <title>Vizitkovník</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="preconnect" href="https://fonts.gstatic.com">
    <link rel="stylesheet" href="https://maxst.icons8.com/vue-static/landings/line-awesome/line-awesome/1.3.0/css/line-awesome.min.css">
    <link rel="stylesheet" href="/css/style.css">
    <link rel="icon" type="image/png" href="/images/favicon.png">
</head>
<body>

<div class="detail">
    <div class="vizitka">

        <div class="jmeno">${participant.fullName}</div>
        <div class="firma">${participant.company}</div>
        <div class="udaje">
            <div class="adresa">
                <div>${participant.streetAddress}</div>
                <div><span>${participant.zipCode}</span> ${participant.city}</div>
            </div>
            <div class="kontakty">
                [#if participant.email?exists]
                <div><i class="las la-at"></i> <span>${participant.email}</span></div>
                [/#if]
                [#if participant.phone?exists]
                <div><i class="las la-phone-alt"></i> <span>${participant.phone}</span></div>
                [/#if]
                <div><i class="las la-globe"></i> <span>${participant.web}</span></div>
            </div>
        </div>
    </div>

    <div class="mapa">
        <iframe style="border:none" src="https://frame.mapy.cz/?q=${participant.getFullAddress()?url}" width="100%" height="100%" frameborder="0"></iframe>
    </div>

</div>
</body>
</html>
