package com.padcmyanmar.zwe.mmnews.data.vo;

import java.util.List;

/**
 * Created by ZWE on 17/12/2017.
 */

public class NewsVO {

    private String newsId;
    private String brief;
    private String details;
    private List<String> images;
    private String postedDate;

    private PublicationVO publication;
    private List<FavouriteVO> favourites;
    private List<CommentVO> comments;
    private List<SendToVO> sendTos;

    public String getNewsId() {
        return newsId;
    }

    public String getBrief() {
        return brief;
    }

    public String getDetails() {
        return details;
    }


    public String getPostedDate() {
        return postedDate;
    }

    public PublicationVO getPublication() {
        return publication;
    }

    public List<String> getImages() {x
        return images;
    }

    public List<FavouriteVO> getFavourites() {
        return favourites;
    }

    public List<CommentVO> getComments() {
        return comments;
    }

    public List<SendToVO> getSendTos() {
        return sendTos;
    }
}
