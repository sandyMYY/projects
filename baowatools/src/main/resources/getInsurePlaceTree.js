//获取投保地省市树
function getInsurePlaceTree(){
    layui.use(['form', 'tree', 'util'], function(){
        var tree = layui.tree
            ,form = layui.form
            ,layer = layui.layer
            ,util = layui.util;


            $.ajax({
            type:'get',
            url:'http://127.0.0.1:8888/setRule/showInsurePlaceTree',
            success:function (data) {
                //重新渲染
                //基本演示
                tree.render({
                    elem: '#insureplace_tree'
                    ,data: data
                    ,showCheckbox: true  //是否显示复选框
                    ,id: 'demoId1'
                    ,isJump: true //是否允许点击节点时弹出新窗口跳转
                    ,click: function(obj){
                        var data = obj.data;  //获取当前点击的节点数据
                        layer.msg('状态：'+ obj.state + '<br>节点数据：' + JSON.stringify(data));
                    }
                });

                //监听提交
                form.on('submit(form_commit)', function(data) {
                    //获得选中的节点

                    var checkData = tree.getChecked('value');

                    var list = new Array();

                    list = getChecked_list(checkData);

                    console.log(checkData);

                    console.log(list);

                });


                // 获取选中节点的id
                function getChecked_list(data) {
                    var value = "";
                    $.each(data, function (index, item) {
                        if (value != "") {
                            value = value + "," + item.value;
                        }
                        else {
                            value = item.value;
                        }
                        var i = getChecked_list(item.children);
                        if (i != "") {
                            value = value + "," + i;
                        }
                    });
                    return value;
                }
            }
        });


    });
}