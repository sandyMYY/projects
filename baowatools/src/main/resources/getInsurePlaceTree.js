//获取投保地省市树
function getInsurePlaceTree(){
    layui.use(['tree', 'util'], function(){
        var tree = layui.tree
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

            }
        });
            //模拟数据
            // data = [{
            //     title: '一级1'
            //     ,id: 1
            //     ,field: 'name1'
            //     ,checked: true
            //     ,spread: true
            //     ,children: [{
            //         title: '二级1-1 可允许跳转'
            //         ,id: 3
            //         ,field: 'name11'
            //         ,href: 'https://www.layui.com/'
            //         ,children: [{
            //             title: '三级1-1-3'
            //             ,id: 23
            //             ,field: ''
            //             ,children: [{
            //                 title: '四级1-1-3-1'
            //                 ,id: 24
            //                 ,field: ''
            //                 ,children: [{
            //                     title: '五级1-1-3-1-1'
            //                     ,id: 30
            //                     ,field: ''
            //                 },{
            //                     title: '五级1-1-3-1-2'
            //                     ,id: 31
            //                     ,field: ''
            //                 }]
            //             }]
            //         },{
            //             title: '三级1-1-1'
            //             ,id: 7
            //             ,field: ''
            //             ,children: [{
            //                 title: '四级1-1-1-1 可允许跳转'
            //                 ,id: 15
            //                 ,field: ''
            //                 ,href: 'https://www.layui.com/doc/'
            //             }]
            //         },{
            //             title: '三级1-1-2'
            //             ,id: 8
            //             ,field: ''
            //             ,children: [{
            //                 title: '四级1-1-2-1'
            //                 ,id: 32
            //                 ,field: ''
            //             }]
            //         }]
            //     },{
            //         title: '二级1-2'
            //         ,id: 4
            //         ,spread: true
            //         ,children: [{
            //             title: '三级1-2-1'
            //             ,id: 9
            //             ,field: ''
            //             ,disabled: true
            //         },{
            //             title: '三级1-2-2'
            //             ,id: 10
            //             ,field: ''
            //         }]
            //     },{
            //         title: '二级1-3'
            //         ,id: 20
            //         ,field: ''
            //         ,children: [{
            //             title: '三级1-3-1'
            //             ,id: 21
            //             ,field: ''
            //         },{
            //             title: '三级1-3-2'
            //             ,id: 22
            //             ,field: ''
            //         }]
            //     }]
            // },{
            //     title: '一级2'
            //     ,id: 2
            //     ,field: ''
            //     ,spread: true
            //     ,children: [{
            //         title: '二级2-1'
            //         ,id: 5
            //         ,field: ''
            //         ,spread: true
            //         ,children: [{
            //             title: '三级2-1-1'
            //             ,id: 11
            //             ,field: ''
            //         },{
            //             title: '三级2-1-2'
            //             ,id: 12
            //             ,field: ''
            //         }]
            //     },{
            //         title: '二级2-2'
            //         ,id: 6
            //         ,field: ''
            //         ,children: [{
            //             title: '三级2-2-1'
            //             ,id: 13
            //             ,field: ''
            //         },{
            //             title: '三级2-2-2'
            //             ,id: 14
            //             ,field: ''
            //             ,disabled: true
            //         }]
            //     }]
            // },{
            //     title: '一级3'
            //     ,id: 16
            //     ,field: ''
            //     ,children: [{
            //         title: '二级3-1'
            //         ,id: 17
            //         ,field: ''
            //         ,fixed: true
            //         ,children: [{
            //             title: '三级3-1-1'
            //             ,id: 18
            //             ,field: ''
            //         },{
            //             title: '三级3-1-2'
            //             ,id: 19
            //             ,field: ''
            //         }]
            //     },{
            //         title: '二级3-2'
            //         ,id: 27
            //         ,field: ''
            //         ,children: [{
            //             title: '三级3-2-1'
            //             ,id: 28
            //             ,field: ''
            //         },{
            //             title: '三级3-2-2'
            //             ,id: 29
            //             ,field: ''
            //         }]
            //     }]
            // }];


    });
}