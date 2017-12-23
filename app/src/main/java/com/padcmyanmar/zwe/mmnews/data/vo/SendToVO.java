package com.padcmyanmar.zwe.mmnews.data.vo;

/**
 * Created by ZWE on 17/12/2017.
 */

public class SendToVO {
    private String sendToId;
    private String sentDate;

    private ActedUserVO actedUser;
    private ActedUserVO receivedUser;

    public String getSendToId() {
        return sendToId;
    }

    public String getSentDate() {
        return sentDate;
    }

    public ActedUserVO getActedUser() {
        return actedUser;
    }

    public ActedUserVO getReceivedUser(){
        return receivedUser;
    }
}
