package com.padcmyanmar.zwe.mmnews.data.vo;

/**
 * Created by ZWE on 17/12/2017.
 */

public class FavouriteVO {

    private String favouriteId;
    private String favouriteDate;

    private ActedUserVO actedUser;

    public String getFavouriteId() {
        return favouriteId;
    }

    public String getFavouriteDate() {
        return favouriteDate;
    }

    public ActedUserVO getActedUser() {
        return actedUser;
    }
}
