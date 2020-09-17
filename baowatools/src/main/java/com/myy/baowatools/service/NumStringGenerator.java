package com.myy.baowatools.service;

import java.util.Random;

/*
 * 输入长度，随机生成数字字符串*
 * */
public class NumStringGenerator {
    public static String setLetterRandom(int length){
        String[] element = {"0","1","2","3","4","5","6","7","8","9"};
        String LetterStringRandom = "";
        for(int i = 0; i < length; i++){
            Random random = new Random();
            int index = random.nextInt(element.length - 1);
            LetterStringRandom += element[index];
        }
        return LetterStringRandom;
    }


    public static void main(String[] args){
        for(int i = 0; i < 10; i++) {
            String vehicleIdNum = setLetterRandom(8);
            System.out.print(vehicleIdNum + "\n");
        }
    }
}
