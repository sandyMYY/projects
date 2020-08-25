package com.za.baowatools.service;

import com.github.restdriver.serverdriver.RestServerDriver;
import com.github.restdriver.serverdriver.http.response.Response;
import com.za.baowatools.common.Constant;
import com.za.baowatools.dal.domain.UserDO;
import com.za.baowatools.dal.domain.UserExample;
import com.za.baowatools.dal.mapper.UserMapper;

/**
 * 使用各个账号登录，获取cookie以便后续操作
 * **/
public class UserCookiesHandle {

    private UserMapper userMapper;
    //默认管理员账号，作为初始获取cookie的账号
    public static String getAdminCookie(){
        Response response = RestServerDriver.get(Constant.baseUrl + Constant.loginApi + Constant.adminLoginParams);

        String adminCookie = response.getHeaders("Set-Cookie").toString();
        System.out.println("headerCookie:"+adminCookie);
        String headerCookie1 = adminCookie.split(" ")[1];
        String headerCookie2 = adminCookie.split(" ")[9].split(";")[0];
        //String headerCookie2 = response.getContent();
        //headerCookie2 = headerCookie2.split("\"netmarket_access_token\":")[1].split("\"")[1];
        //System.out.println("headerCookie2>>>"+headerCookie2);
        adminCookie = headerCookie1 + headerCookie2;
        //String token = JSONObject.parseObject(response.getContent()).getJSONObject("value").getString("netmarket_access_token");
        //System.out.println("headerCookie>>>"+headerCookie);
        return adminCookie;
    }

    public String getCookie(long userId){
        String accountName = getAccountNameFromDB(userId);
        String password = getPasswordFromDB(userId);
        String loginParams = "?userName=" + accountName + "&passWord=" + password + "&smsCode=1";
        Response response = RestServerDriver.get(Constant.baseUrl + Constant.loginApi + loginParams);

        String cookie = response.getHeaders("Set-Cookie").toString();
        System.out.println("headerCookie:" + cookie);
        String headerCookie1 = cookie.split(" ")[1];
        String headerCookie2 = cookie.split(" ")[9].split(";")[0];
        //System.out.println("headerCookie2>>>"+headerCookie2);
        cookie = headerCookie1 + headerCookie2;
        //String token = JSONObject.parseObject(response.getContent()).getJSONObject("value").getString("netmarket_access_token");
        //System.out.println("headerCookie>>>"+headerCookie);
        return cookie;
    }

    //根据用户id获取账户密码
    public String getPasswordFromDB(long userId){
        UserDO userDO = userMapper.selectByPrimaryKey(userId);
        return userDO.getPassword();
    }

    //根据用户id获取账户名
    public String getAccountNameFromDB(long userId ){
        UserDO userDO = userMapper.selectByPrimaryKey(userId);
        return userDO.getUserName();
    }
}
