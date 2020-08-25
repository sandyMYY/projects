//获取名单分类
    function getCampaign() {
    var nameTypeHtml = '';
    $.ajax({
        type:'get',
        url:'http://127.0.0.1:8888/setRule/showCampaign',
        success:function (data) {
            if (data == null) {
                $("#select_campaign").append(new Option("暂无数据", ""));
            } else {
                $("#select_campaign").empty();
                //console.log("data=" + data);
                $.each(data, function(index, item){
                    //console.log("item" + index + "=" + item.label + item.value);
                    $('#select_campaign').append(new Option(item.label));
                });
            }
            //重新渲染
            layui.use('form', function(){
                var form = layui.form; //只有执行了这一步，部分表单元素才会自动修饰成功
                form.render(); //刷新select选择框渲染
                layui.formSelects.render();
            });

        }
    })
}