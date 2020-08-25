package com.za.baowatools.service;

import com.github.restdriver.serverdriver.RestServerDriver;
import com.github.restdriver.serverdriver.http.Header;
import com.github.restdriver.serverdriver.http.response.Response;
import com.za.baowatools.common.Constant;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.github.restdriver.serverdriver.RestServerDriver.body;
import static com.github.restdriver.serverdriver.RestServerDriver.header;
import static com.za.baowatools.service.UserCookiesHandle.getAdminCookie;

public class UserTreeHandle {
    private static String cookie = getAdminCookie();
    private static JSONArray userTreeArray = getUserTree();

    //获取用户树
    public static JSONArray getUserTree(){
        Header cookies = header("Cookie",cookie);
        Response response = RestServerDriver.get(Constant.baseUrl + Constant.queryAllZoneApi, cookies);
        String result = response.getContent();
        //System.out.print("result=" + result + '\n');
        //返回数据为一个3层树
        /**
         * 分别进入每棵父子树，遍历之后将label、value取出，保存至childrenList
         */
        JSONArray qyjlArray = JSONObject.fromObject(result).getJSONArray("value");
        Map<String,String> qyjlTree = new HashMap<>();
        List<Map> qyjlList = new JSONArray();

        for(int i = 0; i < qyjlArray.size(); i++){
            String label = qyjlArray.getJSONObject(i).getString("label");
            //System.out.print("label="+label);
            String value = qyjlArray.getJSONObject(i).getString("value");
            JSONArray tdzArray = qyjlArray.getJSONObject(i).getJSONArray("children");

            //每次循环新建子树的Map和List
            Map<String,String> tdzTree = new HashMap<>();
            List<Map> tdzList = new JSONArray();

            //进入下层children，即团队长的循环
            for(int j = 0; j < tdzArray.size(); j++ ){
                String labelTdz = tdzArray.getJSONObject(j).getString("label");
                //System.out.print("label="+label);
                String valueTdz = tdzArray.getJSONObject(j).getString("value");
                JSONArray zxArray = tdzArray.getJSONObject(j).getJSONArray("children");

                //每次循环新建子树的Map和List
                Map<String,String> zxTree = new HashMap<>();
                List<Map> zxList = new JSONArray();
                for(int k = 0; k < zxArray.size(); k++){
                    String labelZx = zxArray.getJSONObject(k).getString("label");
                    String valueZx = zxArray.getJSONObject(k).getString("value");

                    zxTree.put("label", labelZx);
                    zxTree.put("value", valueZx);
                    zxList.add(zxTree);

                }

                //将每条市的数据数据存入Map
                tdzTree.put("label", labelTdz);
                tdzTree.put("value", valueTdz);
                tdzTree.put("children", ((JSONArray) zxList).toString());
                //将一条市数据存入childrend的List
                tdzList.add(tdzTree);
            }

            //将每个省的数据及下面的所有市数据存入Map
            qyjlTree.put("label", label);
            qyjlTree.put("value", value);
            qyjlTree.put("children", ((JSONArray) tdzList).toString());
            //将省的数据按条存入List
            qyjlList.add(qyjlTree);
            //System.out.print("insurePlaceList" + i + "="+insurePlaceList.toString() + "\n");
        }

        JSONArray userTreeArray = JSONArray.fromObject(qyjlList);
        System.out.print("userTreeArray = " + userTreeArray.toString() +"\n");

        return userTreeArray;
    }

    public static JSONArray getQyjlTree(){
//        Header cookies = header("Cookie",cookie);
//        Response response = RestServerDriver.get(Constant.baseUrl + Constant.queryAllZoneApi, cookies);
//        String result = response.getContent();
        //System.out.print("result=" + result + '\n');
        //返回数据为一个3层树
        /**
         * 分别进入每棵父子树，遍历之后将label、value取出，保存至List
         */
        //JSONArray qyjlArray = JSONObject.fromObject(result).getJSONArray("value");
        Map<String,String> qyjlTree = new HashMap<>();
        List<Map> qyjlList = new JSONArray();

        for(int i = 0; i < userTreeArray.size(); i++){
            String label = userTreeArray.getJSONObject(i).getString("label");
            //System.out.print("label="+label);
            String value = userTreeArray.getJSONObject(i).getString("value");

            //将每个qyjl数据及下面的所有市数据存入Map
            qyjlTree.put("label", label);
            qyjlTree.put("value", value);
            //将qyjl的数据按条存入List
            qyjlList.add(qyjlTree);
            //System.out.print("insurePlaceList" + i + "="+insurePlaceList.toString() + "\n");
        }

        JSONArray qyjlTreeArray = JSONArray.fromObject(qyjlList);
        System.out.print("qyjlTreeArray = " + qyjlTreeArray.toString() +"\n");
        return qyjlTreeArray;
    }


    public static JSONArray getTdzByQyjlId(String qyjlId){
//        Header cookies = header("Cookie",cookie);
//        Response response = RestServerDriver.get(Constant.baseUrl + Constant.queryAllZoneApi, cookies);
//        String result = response.getContent();
        JSONArray tdzTreeArray = new JSONArray();
        //System.out.print("result=" + result + '\n');
        //返回数据为一个3层树
        /**
         * 分别进入每棵父子树，遍历之后将label、value取出
         */
        //JSONArray qyjlArray = JSONObject.fromObject(result).getJSONArray("value");

        for(int i = 0; i < userTreeArray.size(); i++){
            String value = userTreeArray.getJSONObject(i).getString("value");
            if(value.equals(qyjlId)){
                JSONArray tdzArray = userTreeArray.getJSONObject(i).getJSONArray("children");
                Map<String,String> tdzTree = new HashMap<>();
                List<Map> tdzList = new JSONArray();
                for(int j = 0; j < tdzArray.size(); j++){
                    String labelTdz = tdzArray.getJSONObject(j).getString("label");
                    String valueTdz = tdzArray.getJSONObject(j).getString("value");

                    //将此qyjl下的团队长的数据数据存入Map
                    tdzTree.put("label", labelTdz);
                    tdzTree.put("value", valueTdz);
                    //将tdz数据存入List
                    tdzList.add(tdzTree);

                }
                tdzTreeArray = JSONArray.fromObject(tdzList);
                break;
            }
        }
        System.out.print("tdzTreeArray=" + tdzTreeArray.toString() + '\n');
        return tdzTreeArray;
    }


    public static JSONArray getZxByTdzId(String qyjlId, String tdzId){
//        Header cookies = header("Cookie",cookie);
//        Response response = RestServerDriver.get(Constant.baseUrl + Constant.queryAllZoneApi, cookies);
//        String result = response.getContent();
        JSONArray zxTreeArray = new JSONArray();
        //System.out.print("result=" + result + '\n');
        //返回数据为一个3层树
        /**
         * 分别进入每棵父子树，遍历之后将label、value取出
         */
        //JSONArray qyjlArray = JSONObject.fromObject(result).getJSONArray("value");

        for(int i = 0; i < userTreeArray.size(); i++){
            String qyjlValue = userTreeArray.getJSONObject(i).getString("value");
            if(qyjlValue.equals(qyjlId)){
                JSONArray tdzArray = userTreeArray.getJSONObject(i).getJSONArray("children");

                for(int j = 0; j < tdzArray.size(); j++){
                    String tdzValue = tdzArray.getJSONObject(j).getString("value");
                    if(tdzValue.equals(tdzId)){
                        JSONArray zxArray = tdzArray.getJSONObject(j).getJSONArray("children");
                        Map<String,String> zxTree = new HashMap<>();
                        List<Map> zxList = new JSONArray();
                        for(int k = 0; k < zxArray.size(); k++) {
                            String labelZx = zxArray.getJSONObject(k).getString("label");
                            String valueZx = zxArray.getJSONObject(k).getString("value");
                            //将此tdz下的zx的数据数据存入Map
                            zxTree.put("label", labelZx);
                            zxTree.put("value", valueZx);
                            //将tdz数据存入List
                            zxList.add(zxTree);
                        }
                        zxTreeArray = JSONArray.fromObject(zxList);
                        break;
                    }
                }
                break;
            }
        }
        System.out.print("zxTreeArray=" + zxTreeArray.toString() + '\n');
        return zxTreeArray;
    }

    public static void main(String[] args){
        getZxByTdzId("2650002", "2650003");
    }
}
