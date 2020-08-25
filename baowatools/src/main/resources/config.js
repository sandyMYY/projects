document.write("<script src=\"templates/layuimini/lib/layui-v2.5.5/formSelects-v4.js\" charset=\"utf-8\"></script>");
document.write("<link href=\"templates/layuimini/lib/layui-v2.5.5/formSelects-v4.css\" rel=\"stylesheet\">");
//全局定义一次, 加载formSelects
layui.config({
    base: './lib/layui-v2.5.5/' //此处路径请自行处理, 可以使用绝对路径
}).extend({
    formSelects: 'formSelects-v4'
});
//加载模块
layui.use(['jquery', 'formSelects'], function () {
    var formSelects = layui.formSelects;

});