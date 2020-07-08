var aSelect=document.querySelectorAll(".footer select");
for(var i=0;i<aSelect.length;i++)
{
    aSelect[i].onchange=function()
    {
        var url=this.options[this.selectedIndex].value;
        window.open(url);
    }
}