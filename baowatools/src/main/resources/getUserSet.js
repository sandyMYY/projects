function getUserSet() {
    layui.use(['form','layer','jquery'],function(){
        var form = layui.form,
            layer = parent.layer === undefined ? layui.layer : parent.layer,
            $ = layui.jquery;

        var qyjlText = "";
        var tdzText = "";
        var zxText = "";
        //异步加载下拉框数据
        $.ajax({
            type: 'get',
            url: 'http://127.0.0.1:8888/setRule/showQyjlTree',
            success: function (data) {
                if (data == null) {
                    layer.msg("返回数据为空！")
                } else {
                    var $html = "";
                        $.each(data, function (index, item) {
                            //console.log('item=' + item.value  +  item.label);
                            $html += "<option value='" + item.value + "'>" + item.label + "</option>";
                        });
                        $("#qyjlId").append($html);
                        //append后必须从新渲染
                        form.render();
                        layui.formSelects.render();

                        //监听qyjl下拉框
                        form.on('select(qyjlSelect)', function (dataObject) {
                            //移除tdz下拉框所有选项
                            $("#tdzId").empty();
                            var tdzHtml = '<option value="">选择团队长</option>\n';
                            //console.log("1");
                            $("#tdzId").html(tdzHtml);
                            // var zxHtml = '<option value="">请选择坐席</option>';
                            // $("#zxId").html(zxHtml);
                            //console.log("2");
                            qyjlText = $("#qyjlId").find("option:selected").text();
                            var value = $("#qyjlId").val();
                            //异步加载下拉框数据
                            $.ajax({
                                type: 'get',
                                crossDomain: true,
                                url: 'http://127.0.0.1:8888/setRule/getTdzByQyjlId?qyjlId=' + value,
                                success: function (data) {
                                    //console.log("3");
                                    if (data == null) {
                                        layer.msg("返回数据为空！");
                                    } else {
                                        var $html = "";
                                        //console.log("4");
                                        $.each(data, function (index, item) {
                                            $html += "<option value='" + item.value + "'>" + item.label + "</option>";
                                        });
                                        $("#tdzId").append($html);
                                        //append后必须从新渲染
                                        form.render();
                                        layui.formSelects.render();

                                        //监听tdz下拉框
                                        form.on('select(tdzSelect)', function(dataObj){
                                            //移除县区下拉框所有选项
                                            $("#zxId").empty();
                                            var zxHtml = '<option value="">选择坐席</option>\n';
                                            $("#zxId").html(zxHtml);

                                            qyjlText = $("#qyjlId").find("option:selected").text();
                                            var value1 = $("#qyjlId").val();
                                            tdzText = $("#tdzId").find("option:selected").text();
                                            var value2 = $("#tdzId").val();
                                            //异步加载下拉框数据
                                            $.ajax({
                                                type:'get',
                                                url:'http://127.0.0.1:8888/setRule/getZxByTdzId?qyjlId=' + value1 + '&tdzId=' + value2,
                                                success:function (data) {
                                                    if(data == null){
                                                        layer.msg("返回数据为空！")
                                                    }else{
                                                        var $html = "";
                                                        //console.log("4");
                                                        $.each(data, function (index, item) {
                                                            $html += "<option value='" + item.value + "'>" + item.label + "</option>";
                                                        });
                                                        $("#zxId").append($html);
                                                        //append后必须从新渲染
                                                        form.render();
                                                        layui.formSelects.render();

                                                        //监听zx下拉框
                                                        form.on('select(zxSelect)', function(dataObj){
                                                            zxText = $("#zxId").find("option:selected").text();
                                                        });
                                                    }
                                                }

                                            });

                                        });

                                    }

                                }

                            })
                        })

                }
            }
        });
})
}