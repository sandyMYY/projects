package com.za.baowatools.controller;

import com.github.restdriver.serverdriver.http.response.Response;
import com.za.baowatools.pojo.RuleInfo;
import com.za.baowatools.service.OtherRuleInfo;
import com.za.baowatools.service.UserCookiesHandle;
import com.za.baowatools.service.UserTreeHandle;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.apache.http.client.HttpClient;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
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
        System.out.print("jsonArray = " + jsonArray.toString());
        return jsonArray;
    }


    @CrossOrigin
    @RequestMapping("/setRuleFast")
    @ResponseBody
    public static void setRuleFast(@RequestBody JSONObject jsonParam){
        JSONArray campaign = jsonParam.getJSONArray("campaignList");
        JSONArray secondRule = jsonParam.getJSONArray("secondRules");
        JSONArray insurePlaceCodeList = jsonParam.getJSONArray("insurePlaceCodeList");
        String userId = jsonParam.getString("userId");
        String id = jsonParam.getString("id");

        RuleInfo ruleInfo = new RuleInfo();

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
