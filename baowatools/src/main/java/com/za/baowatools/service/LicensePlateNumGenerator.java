package com.za.baowatools.service;

import java.util.Random;

/*
 * 随机生成车牌号*
 * */

public class LicensePlateNumGenerator {
    public static String setAreaPrivinceCode(String Province){
        String AreaCode = "";
        switch (Province) {
            case "浙江": AreaCode = "浙";break;
            case "北京": AreaCode = "京";break;
            case "天津": AreaCode = "津";break;
            case "重庆": AreaCode = "渝";break;
            case "上海": AreaCode = "沪";break;
            case "河北": AreaCode = "冀";break;
            case "山西": AreaCode = "晋";break;
            case "辽宁": AreaCode = "辽";break;
            case "吉林": AreaCode = "吉";break;
            case "黑龙江": AreaCode = "黑";break;
            case "江苏": AreaCode = "苏";break;
            case "安徽": AreaCode = "皖";break;
            case "福建": AreaCode = "闽";break;
            case "江西": AreaCode = "赣";break;
            case "山东": AreaCode = "鲁";break;
            case "广西": AreaCode = "桂";break;
            case "宁夏": AreaCode = "宁";break;
            case "新疆": AreaCode = "新";break;
            case "西藏": AreaCode = "藏";break;
            case "香港": AreaCode = "港";break;
            case "澳门": AreaCode = "澳";break;
            case "内蒙古": AreaCode = "蒙";break;
            case "台湾": AreaCode = "台";break;
            case "甘肃": AreaCode = "甘";break;
            case "青海": AreaCode = "青";break;
            case "陕西": AreaCode = "陕";break;
            case "云南": AreaCode = "云";break;
            case "贵州": AreaCode = "贵";break;
            case "四川": AreaCode = "川";break;
            case "海南": AreaCode = "琼";break;
            case "广东": AreaCode = "粤";break;
            case "湖南": AreaCode = "湘";break;
            case "湖北": AreaCode = "鄂";break;
            case "河南": AreaCode = "豫";break;
            default:
                System.out.print("ERROR!");
        }
        return AreaCode;
    }

    public static String setPlateNum(){
        String[] element = {"0","1","2","3","4","5","6","7","8","9","A","B","C","D","E","F","G","H",
                "I","J","K","L","M","N","O","P","Q", "R","S","T","U","V","W","X","Y","Z"};
        String LicensePlateNum = "";
        for(int i = 0; i < 6; i++){
            Random random = new Random();
            int index = random.nextInt(element.length - 1);
            LicensePlateNum += element[index];
        }
        return LicensePlateNum;
    }

    public static void main(String[] args){
        for(int i = 0; i < 10; i++) {
            String plateNumber = setAreaPrivinceCode("浙江") + setPlateNum();
            System.out.print(plateNumber + "\n");
        }
    }
}
