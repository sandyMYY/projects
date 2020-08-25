//获取名单分类
function getNameType() {
    var nameTypeHtml = '';
    $.ajax({
        type:'get',
        url:'http://127.0.0.1:8888/setRule/showNameType',
        success:function (data) {
            if (data == null) {
                $("#select_nametype").append(new Option("暂无数据", ""));
            } else {
                $("#select_nametype").empty();
                $.each(data, function(index, item){
                    //console.log("item=" + item.value);
                    $('#select_nametype').append(new Option(item.value));
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