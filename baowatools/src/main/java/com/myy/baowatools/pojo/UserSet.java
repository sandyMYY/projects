package com.myy.baowatools.pojo;


import java.util.Arrays;

//设置各个角色的用户，作为一个集合供之后调用
public class UserSet {
    public String userQYJLId;
    //区域经理每次设置只能选择一个，为long类型

    public String[] userTDZIds;
    //团队长

    public String[] userZXIds;
    //坐席

    public String getUserQYJLId() {
        return userQYJLId;
    }

    public String[] getUserTDZIds() {
        return userTDZIds;
    }

    public String[] getUserZXIds() {
        return userZXIds;
    }

    public void setUserQYJLId(String userQYJLId) {
        this.userQYJLId = userQYJLId;
    }

    public void setUserTDZIds(String[] userTDZIds) {
        this.userTDZIds = userTDZIds;
    }

    public void setUserZXIds(String[] userZXIds) {
        this.userZXIds = userZXIds;
    }

    @Override
    public String toString() {
        return "UserSet{" +
                "userQYJLId='" + userQYJLId + '\'' +
                ", userTDZIds=" + Arrays.toString(userTDZIds) +
                ", userZXIds=" + Arrays.toString(userZXIds) +
                '}';
    }
}
