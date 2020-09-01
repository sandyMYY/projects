function addRule(data) {
    layui.use(['form', 'layer', 'jquery', 'table', 'laydate', 'element', 'upload', 'util'], function () {
        var form = layui.form,
            layer = layui.layer,
            table = layui.table,
            laydate = layui.laydate,
            element = layui.element,
            upload = layui.upload,
            flow = layui.flow;
        var qyjlId = data.field.qyjlId;
        var tdzId = data.field.tdzId;
        var zxId = data.field.zxId;
        var userId = {
            "qyjlId": qyjlId,
            "tdzId": tdzId,
            "zxId": zxId
        };
        var campaignList = data.field.select_campaign;
        var secondRules = data.field.select_nametype;
        var insurePlaceCodeList = data.field.insureplace_tree;

        var dataContent = {
            "userId": userId,
            "campaignList": campaignList,
            "secondRules": secondRules,
            "insurePlaceCodeList": insurePlaceCodeList
        };
        $.ajax({ //使用JQuery内置的Ajax方法
            type: "post", //post请求方式
            async: true,
            contentType: 'application/json',//异步请求（同步请求将会锁住浏览器，用户其他操作必须等待请求完成才可以执行）
            url: "http://127.0.0.1:8888/setRule/setRuleFast",
            data: JSON.stringify(dataContent), //请求内包含一个key为name，value为A0001的参数；服务器接收到客户端请求时通过request.getParameter方法获取该参数值
            dataType: "json", //返回数据形式为json
            success: function (result) {
            }
        })
    })
}