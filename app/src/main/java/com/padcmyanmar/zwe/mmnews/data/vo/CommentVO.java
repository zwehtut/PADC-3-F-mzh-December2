package com.padcmyanmar.zwe.mmnews.data.vo;

/**
 * Created by ZWE on 17/12/2017.
 */

public class CommentVO {

    private String commentId;
    private String comment;
    private String commentDate;

    private ActedUserVO actedUser;

    public String getCommentId() {
        return commentId;
    }

    public String getComment() {
        return comment;
    }

    public String getCommentDate() {
        return commentDate;
    }

    public ActedUserVO getActedUser() {
        return actedUser;
    }
}
