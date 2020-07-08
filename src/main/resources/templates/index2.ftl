<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>门户首页</title>
</head>
<body>
<script language=javascript>
    <!--
    // open the related site windows
    function mbar(sobj) {
        var docurl =sobj.options[sobj.selectedIndex].value;
        if (docurl != "") {
            open(docurl,'_blank');
            sobj.selectedIndex=0;
            sobj.blur();
        }
    }
    //-->
</script>


<Select onchange=" mbar(this)" name="select">
    <#list ChannelsList as ch>
        <OPTION value="/news/${ch.channelId}">${ch.channelName}</OPTION>
    </#list>
</Select>
</body>
</html>
