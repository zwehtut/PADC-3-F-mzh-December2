package com.padcmyanmar.zwe.mmnews.viewholders;

import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.padcmyanmar.zwe.mmnews.delegates.NewsActionDelegate;


/**
 * Created by ZWE on 03/12/2017.
 */

public class ItemNewsViewHolder extends RecyclerView.ViewHolder {


    private NewsActionDelegate mNewsActionDelegate;

    public ItemNewsViewHolder(View newsItemview, NewsActionDelegate newsActionDelegate) {
        super(newsItemview);
        mNewsActionDelegate = newsActionDelegate;


    }


}
