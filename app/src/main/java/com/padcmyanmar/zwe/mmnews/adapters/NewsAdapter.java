package com.padcmyanmar.zwe.mmnews.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.padcmyanmar.zwe.mmnews.R;
import com.padcmyanmar.zwe.mmnews.delegates.NewsActionDelegate;
import com.padcmyanmar.zwe.mmnews.viewholders.ItemNewsViewHolder;

/**
 * Created by ZWE on 03/12/2017.
 */

public class NewsAdapter extends RecyclerView.Adapter {

    private NewsActionDelegate mNewsActionDelegate;

    public NewsAdapter(NewsActionDelegate newsActionDelegate) {
        mNewsActionDelegate = newsActionDelegate;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
       Context  context =  parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View newsItemview = inflater.inflate(R.layout.item_news,parent,false);
        ItemNewsViewHolder itemNewsViewHolder = new ItemNewsViewHolder(newsItemview,mNewsActionDelegate);
        return itemNewsViewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 6;
    }
}
