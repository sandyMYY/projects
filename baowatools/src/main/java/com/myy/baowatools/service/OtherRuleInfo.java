package com.myy.baowatools.service;

import com.github.restdriver.serverdriver.RestServerDriver;
import com.github.restdriver.serverdriver.http.Header;
import com.github.restdriver.serverdriver.http.response.Response;

import com.myy.baowatools.common.Constant;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import static com.github.restdriver.serverdriver.RestServerDriver.body;
import static com.github.restdriver.serverdriver.RestServerDriver.header;

public class OtherRuleInfo {
    //获取全局名单分类列表
    public static JSONArray getNameType(String cookie){
        Header cookies = header("Cookie",cookie);
        Response response = RestServerDriver.get(Constant.baseUrl + Constant.queryNameTypeApi, cookies);
        String result = response.getContent();
        JSONArray jsonArray = JSONObject.fromObject(result).getJSONArray("value");
        Map<String,String> nameType = new HashMap<>();
        List<Map> nameTypeList = new JSONArray();
        for(int i = 0; i < jsonArray.size(); i++){
            String value = jsonArray.getJSONObject(i).getString("value");
            nameType.put("value", value);
            nameTypeList.add(nameType);
            //System.out.print("nameType" + i + nameType);
        }
        //System.out.print("nameType" + nameType);
        JSONArray nameTypeArray = JSONArray.fromObject(nameTypeList);

//         //List<String> nameType =
//        System.out.print("nameType = " + nameType);
        return nameTypeArray;
    }

    //获取全局业务来源
    public static JSONArray getCampaign(String cookie){
        Header cookies = header("Cookie",cookie);
        Response response = RestServerDriver.get(Constant.baseUrl + Constant.queryCampaignApi, cookies);
        String result = response.getContent();
        JSONArray jsonArray = JSONObject.fromObject(result).getJSONArray("value");
        Map<String,String> campaign = new HashMap<>();
        List<Map> campaignList = new JSONArray();
        for(int i = 0; i < jsonArray.size(); i++){
            String label = jsonArray.getJSONObject(i).getString("label");
            //System.out.print("label="+label);
            String value = jsonArray.getJSONObject(i).getString("value");
            //System.out.print("value="+value);
            campaign.put("label", label);
            campaign.put("value", value);
            campaignList.add(campaign);
            //System.out.print("campaignList="+campaignList.toString());
        }
        System.out.print("campaignList = " + campaignList.toString() +"\n");
        JSONArray campaignArray = JSONArray.fromObject(campaignList);
        System.out.print("campaign = " + campaignArray.toString() +"\n");

        return campaignArray;
    }

    //获取全局投保地
    public static JSONArray getInsurePlace(String cookie){
        Header cookies = header("Cookie",cookie);
        Response response = RestServerDriver.post(Constant.baseUrl + Constant.queryInsurePlace, body(Constant.insurePlaceParams, Constant.contentType), cookies);
        String result = response.getContent();
        //System.out.print("result=" + result + '\n');
        //返回数据为一个树，31个父节点
        /**
         * 分别进入每棵父子树，遍历之后将label、value和parentCode取出，保存至childrenList
         */
        JSONArray jsonArray = JSONObject.fromObject(result).getJSONArray("value");
        Map<String,String> insurePlace = new HashMap<>();
        List<Map> insurePlaceList = new JSONArray();

        for(int i = 0; i < jsonArray.size(); i++){
            String label = jsonArray.getJSONObject(i).getString("label");
            //System.out.print("label="+label);
            String value = jsonArray.getJSONObject(i).getString("value");
            JSONArray childArray = jsonArray.getJSONObject(i).getJSONArray("children");

            //每次循环新建子树的Map和List
            Map<String,String> insurePlaceChild = new HashMap<>();
            List<Map> insurePlaceChildList = new JSONArray();

            //进入children，即市的循环
            for(int j = 0; j < childArray.size(); j++ ){
                String labelChild = childArray.getJSONObject(j).getString("label");
                //System.out.print("label="+label);
                String valueChild = childArray.getJSONObject(j).getString("value");
                String parentCode = childArray.getJSONObject(j).getString("parentCode");

                //将每条市的数据数据存入Map
                insurePlaceChild.put("label", labelChild);
                insurePlaceChild.put("parentCode", parentCode);
                insurePlaceChild.put("value", valueChild);
                //将一条市数据存入childrend的List
                insurePlaceChildList.add(insurePlaceChild);
            }

            //将每个省的数据及下面的所有市数据存入Map
            insurePlace.put("label", label);
            insurePlace.put("value", value);
            insurePlace.put("children", ((JSONArray) insurePlaceChildList).toString());
            //将省的数据按条存入List
            insurePlaceList.add(insurePlace);
            //System.out.print("insurePlaceList" + i + "="+insurePlaceList.toString() + "\n");
        }

        //增加最上级，作为全选选项
        Map<String,String> insurePlaceTop = new HashMap<>();
        List<Map> insurePlaceChildTop = new JSONArray();
        insurePlaceTop.put("label", "全部地区");
//        insurePlaceTop.put("value", "All");
        insurePlaceTop.put("children", ((JSONArray) insurePlaceList).toString());
        insurePlaceChildTop.add(insurePlaceTop);
        JSONArray insurePlaceArray = JSONArray.fromObject(insurePlaceChildTop);
        //System.out.print("insurePlaceArray = " + insurePlaceArray.toString() +"\n");

        return insurePlaceArray;
    }

    public static void main(String[] args){
        String cookie = UserCookiesHandle.getAdminCookie();
        getInsurePlace(cookie);
    }



}