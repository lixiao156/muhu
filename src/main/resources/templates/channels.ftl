<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<#list newsByChannelsId as channels>
    <li>${channels.channelName} ${channels.author}  ${channels.summary} ${channels.content}</li>
</#list>

<br>
<br>
<br>
<br>
<div class="m-container m-padded-tb-big doubling">
    <div class="ui container doubling">
        <div class="ui row">
            <div class="seven wide column doubling">
                <div class="ui top attached segment">
                    <div class="ui header">获取数据</div>
                </div>
                <div class="ui attached segment ">
                    <form id="webDataForm" name="webDataForm" method="post" action="/getRecord">
                        <div class="ui labeled left icon input" style="width: 100%">
                            <i class="computer icon"></i>
                            <input id="userName" readonly="true" type="text" name="userName" placeholder="1568452****" value=${userName}>
                            <a class="ui tag label">
                                用户名
                            </a>
                        </div>
                        <br>
                        <br>
                        <div class="ui labeled left icon input" style="width: 100%">
                            <i class="briefcase icon"></i>
                            <input id="password" readonly="true" type="text" name="password" placeholder="1A2B3C4D5E6F7G!*(41@" value=${password}>
                            <a class="ui tag label">
                                密码
                            </a>
                        </div>
                        <br>
                        <br>
                        <div class="ui labeled left icon input" style="width: 100%">
                            <i class="eyedropper icon"></i>
                            <input id="createTime" readonly="true" type="text" name="createTime" placeholder="1A2B3C4D5E6F7G!*(41@" value=${createTime}>
                            <a class="ui tag label">
                                创建时间
                            </a>
                        </div>
                        <br>
                        <br>
                        <div class="ui labeled left icon input" style="width: 100%">
                            <i class="calendar icon"></i>
                            <input id="remarks" type="text" name="remarks" placeholder="如：可以使用，或者用户名错误，或者密码错误" value=${remarks}>
                            <a class="ui tag label">
                                备注
                            </a>
                        </div>
                        <br>
                        <br>

                        <div class="ui padded grid">
                            <div class="white row">
                                <div class="column">
                                    <h2 class="ui header">注意</h2>
                                    <p>成功获取帐号后，需要填写备注信息，随后点击提交备注按钮，避免下次获取同样的帐号</p>
                                </div>
                            </div>
                            <div class="two column row">
                                <div class="white column">
                                    <button class="fluid ui teal button" type="submit">点击获取数据</button>
                                </div>
                                <div class="two column column">
                                    <button class="fluid ui teal button" onclick="updateWebData()">点击提交备注</button>
                                </div>
                            </div>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </div>
</div>

<script>
    function updateWebData() {

        for(var i=0; i<document.webDataForm.elements.length - 2; i++)
        {
            if(document.webDataForm.elements[i].value=="")
            {
                console.log(i);
                alert("当前表单不能有空项");
                document.webDataForm.elements[i].focus();
                return;
            }
        }

        document.webDataForm.action = "/updateWebData";
        document.webDataForm.submit();
    }
</script>

</body>
</html>