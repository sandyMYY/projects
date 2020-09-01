package com.za.baowatools.controller;

import com.github.restdriver.serverdriver.http.response.Response;
import com.za.baowatools.pojo.RuleInfo;
import com.za.baowatools.pojo.UserSet;
import com.za.baowatools.service.OtherRuleInfo;
import com.za.baowatools.service.UserCookiesHandle;
import com.za.baowatools.service.UserTreeHandle;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.sf.json.JsonConfig;
import org.apache.http.client.HttpClient;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin(methods = { RequestMethod.GET, RequestMethod.POST }, origins = "*")
@RequestMapping("/setRule")
public class SetRuleController {
    @CrossOrigin
    @RequestMapping("/showNameType")
    @ResponseBody
    public JSONArray showNameType(){
        String cookie = UserCookiesHandle.getAdminCookie();
        JSONArray jsonArray = OtherRuleInfo.getNameType(cookie);
        //System.out.print("jsonArray = " + jsonArray.toString());
        return jsonArray;
    }

    @CrossOrigin
    @RequestMapping("/showCampaign")
    @ResponseBody
    public static JSONArray showCampaign(){
        String cookie = UserCookiesHandle.getAdminCookie();
        JSONArray jsonArray = OtherRuleInfo.getCampaign(cookie);
        System.out.print("jsonArray = " + jsonArray.toString());
        return jsonArray;
    }

    @CrossOrigin
    @RequestMapping("/showInsurePlaceTree")
    @ResponseBody
    public static JSONArray showInsurePlaceTree(){
        String cookie = UserCookiesHandle.getAdminCookie();
        JSONArray jsonArray = OtherRuleInfo.getInsurePlace(cookie);
        System.out.print("jsonArray = " + jsonArray.toString());
        return jsonArray;
    }


    @CrossOrigin
    @RequestMapping("/showQyjlTree")
    @ResponseBody
    public static JSONArray showUserTree(){
        JSONArray jsonArray = UserTreeHandle.getQyjlTree();
        System.out.print("jsonArray = " + jsonArray.toString());
        return jsonArray;
    }

    @CrossOrigin
    @RequestMapping("/getTdzByQyjlId")
    @ResponseBody
    public static JSONArray getTdzByQyjlId(@RequestParam("qyjlId") String qyjlId){
        JSONArray jsonArray = UserTreeHandle.getTdzByQyjlId(qyjlId);
        System.out.print("jsonArray = " + jsonArray.toString());
        return jsonArray;
    }

    @CrossOrigin
    @RequestMapping("/getZxByTdzId")
    @ResponseBody
    public static JSONArray getZxByTdzId(@RequestParam("qyjlId") String qyjlId, @RequestParam("tdzId") String tdzId){
        JSONArray jsonArray = UserTreeHandle.getZxByTdzId(qyjlId, tdzId);
        System.out.print("jsonArray = " + jsonArray.toString());
        return jsonArray;
    }


    @CrossOrigin
    @RequestMapping("/setRuleFast")
    @ResponseBody
    public static void setRuleFast(@RequestBody JSONObject jsonParam){
        JSONObject campaign = jsonParam.getJSONObject("campaignList");
        JSONObject secondRule = jsonParam.getJSONObject("secondRules");
        JSONObject insurePlaceCodeList = jsonParam.getJSONObject("insurePlaceCodeList");
        String id = jsonParam.getString("id");

        JSONObject userIds = jsonParam.getJSONObject("userIds");
        String qyjlId = userIds.getString("qyjlId");
        String tdzId = userIds.getString("tdzId");
        //List<String> zxIds = userIds.getJSONObject("zxIds");

        //设置RuleInfo内容
        RuleInfo ruleInfo = new RuleInfo();
        ruleInfo.setId(id);
        ruleInfo.setUserId(qyjlId);
        ruleInfo.setSecondRules(campaign);
        ruleInfo.setCampaignIdList(secondRule);
        ruleInfo.setInsurePlaceCodeList(insurePlaceCodeList);


        //System.out.print("jsonArray = " + jsonArray.toString());
        //return jsonArray;
    }

    private Map<String,Object> mapWrapper(String jsonArray){
        Map<String,Object> map = new HashMap<String,Object>();

        map.put("code",0);
        map.put("msg","ok");
        map.put("data",jsonArray);
        return map;
    }

    public static void main(String[] args){
        showCampaign();
    }
}
