<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<#list ChannelsList as ch>
    <li> ${ch.channelId},${ch.channelName}</li>
    <li><a href="#" class="nva_parent_link">${ch.channelId}</a></li>
</#list>
</body>
</html>