package com.myy.baowatools.service;

import java.util.Calendar;

/*
 * 随机生成身份证号码
 * */
public class IdNumGenerator {
    public static String areaCodeRand(){
        //随机获取地区码
        String[] areaCodeList = {"362402","362421","362422","362423","362424","362425","362426","362427","362428","362429","362430","362432","110100","110101","110102","110103","110104","110105","110106","110107","110108","110109","110111"};
        int i = (int)(Math.random() * 1000);
        //System.out.print(i+"\n");
        i = i % 23;
        String areaCode = areaCodeList[i];
        //System.out.print(areaCode);
        return areaCode;
    }

    public static String birthDayRand() {
        //随机生成生日
        Calendar birthday = Calendar.getInstance();
        birthday.set(Calendar.YEAR, (int) (Math.random() * 60) + 1948);
        //新身份证规则开始时间
        birthday.set(Calendar.MONTH, (int) (Math.random() * 12));
        birthday.set(Calendar.DATE, (int) (Math.random() * 31));

        StringBuilder builder = new StringBuilder();
        builder.append(birthday.get(Calendar.YEAR));
        long month = birthday.get(Calendar.MONTH) ;
        if (month < 10) {
            builder.append("0");
        }
        builder.append(month);
        long date = birthday.get(Calendar.DATE);
        if (date < 10) {
            builder.append("0");
        }
        builder.append(date);
        return builder.toString();
    }
    public static String randomCode(){
        //随机生成第15~17位
        int code = (int) (Math.random() * 1000);
        //System.out.print(code);
        if (code < 10){
            return "00" + code;
        }else if(code < 100){
            return  "0" + code;
        }else {
            return "" + code;
        }
    }

    public static String verificationCodeAppend(){
        //最后一位校验码生成
        String strTmp = areaCodeRand() + birthDayRand() + randomCode();
        char[] chars = strTmp.toCharArray();
        int sum = 0;
        if(chars.length < 17){
            return "error!";
        }
        int[] weight = {7, 9, 10, 5, 8, 4, 2, 1, 6, 3, 7, 9, 10, 5, 8, 4, 2};
        char[] verification = {'1', '0', 'X', '9', '8', '7', '6', '5', '4', '3', '2' };
        for(int i = 0;i <= 16; i++){
            sum += Integer.parseInt(chars[i]+"") * weight[i];
        }
        char veriCode = verification[ sum % 11 ];
        return strTmp + veriCode;
    }

    public static void main(String[] args){
        String birthday;
        birthday = verificationCodeAppend();
        System.out.print(birthday);
    }
}
