package com.myy.baowatools.service;

import java.util.Random;

/*
 * 随机生成手机号码*
 * */
public class PhoneNumGenerator {
    public static String setNumPrefix(){
        String PhoneNumPrefix = "";
        String[] NumPrefixSet = {
                "134","135","136","137","138","139","147","150","151","152","157","158",
                "159","178","182","183","184","187","188","198","130","131","132",
                "145","155","156","175","176","185","186","166","133","153","173",
                "177","180","181","189","199","170"
        };
        Random random = new Random();
        //Random random = new Random(System.currentTimeMillis());
        int index = random.nextInt(NumPrefixSet.length - 1);
        PhoneNumPrefix = NumPrefixSet[index];
        return PhoneNumPrefix;
    }

    public static String setNumSuffix(){
        int length = 8;
        String num = "";
        Random random = new Random();
        for(int i = 0; i < length; i++){
            num += String.valueOf(random.nextInt(10));
        }
        return num;
    }


    public static void main(String[] args){
        String phoneNumber = "";
        for(int i = 0; i < 10; i++) {
            phoneNumber = setNumPrefix() + setNumSuffix();
            System.out.print(phoneNumber + "\n");
        }
    }
}
