package com.myy.baowatools.controller;

import com.myy.baowatools.pojo.RuleInfo;
import com.myy.baowatools.service.OtherRuleInfo;
import com.myy.baowatools.service.UserCookiesHandle;
import com.myy.baowatools.service.UserTreeHandle;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
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
        //System.out.print("jsonArray = " + jsonArray.toString());
        return jsonArray;
    }


    @CrossOrigin
    @RequestMapping("/setRuleFast")
    @ResponseBody
    public static void setRuleFast(@RequestBody JSONObject jsonParam){
        System.out.print("jsonParam:"+ jsonParam);
        Object campaign = jsonParam.get("campaignList");
        Object secondRule = jsonParam.get("secondRules");
        Object insurePlaceCodeList = jsonParam.get("insurePlaceCodeList");
        //String id = jsonParam.getString("id");

        JSONObject userIds = jsonParam.getJSONObject("userIds");
        String qyjlId = userIds.getString("qyjlId");
        String tdzId = userIds.getString("tdzId");
        //List<String> zxIds = userIds.getJSONObject("zxIds");

        //设置RuleInfo内容
        RuleInfo ruleInfo = new RuleInfo();
        //ruleInfo.setId(id);
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
