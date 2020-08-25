package com.za.baowatools.service;

import java.util.Random;

/*
 * 输入长度，随机生成字母、数字混合字符串
 * */
public class LetterAndNumGenerator {
    public static String setLetterAndNum(int length){
        String[] element = {"0","1","2","3","4","5","6","7","8","9",
                "A","B","C","D","E","F","G","H",
                "I","J","K","L","M","N","O","P",
                "Q", "R","S","T","U","V","W","X","Y","Z"};
        String VehicleIdNum = "";
        for(int i = 0; i < length; i++){
            Random random = new Random();
            int index = random.nextInt(element.length - 1);
            VehicleIdNum += element[index];
        }
        return VehicleIdNum;
    }
    public static void main(String[] args){
        for(int i = 0; i < 10; i++) {
            String vehicleIdNum = setLetterAndNum(10);
            System.out.print(vehicleIdNum + "\n");
        }
    }
}