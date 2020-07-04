<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<#list ChannelsList as ch>
    <li> ${ch.channelId},${ch.channelName}</li>
    <li><a href="/news/${ch.channelId}" class="nva_parent_link">${ch.channelName}</a></li>
</#list>
<input type="file">
</body>
</html>