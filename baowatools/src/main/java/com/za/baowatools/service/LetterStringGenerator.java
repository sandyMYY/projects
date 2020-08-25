package com.za.baowatools.service;

import java.util.Random;

/*
 * 输入长度，随机生成字母字符串*
 * */
public class LetterStringGenerator {
    public static String setLetterRandom(int length){
        String[] element = {"A","B","C","D","E","F","G","H","I","J","K","L","M",
                "N","O","P","Q", "R","S","T","U","V","W","X","Y","Z"};
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
