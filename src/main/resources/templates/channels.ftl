<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>校园新闻</title>
</head>
<body>
<#list newsByChannelsId as channels>
    <li>${channels.channelName} ${channels.author}  ${channels.summary} ${channels.content}</li>
</#list>

</body>
</html>