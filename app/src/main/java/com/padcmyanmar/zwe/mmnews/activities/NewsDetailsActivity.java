package com.padcmyanmar.zwe.mmnews.activities;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.padcmyanmar.zwe.mmnews.R;
import com.padcmyanmar.zwe.mmnews.adapters.ImagesInNewsDetailsAdapter;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by ZWE on 09/12/2017.
 */

public class NewsDetailsActivity extends AppCompatActivity {

    @BindView(R.id.toolbar)
    Toolbar toolbar;

    @BindView(R.id.vp_news_details_images)
    ViewPager vpNewsDetailsImages;

    private ImagesInNewsDetailsAdapter mImagesInNewsDetailsAdapter;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news_details);
        ButterKnife.bind(this,this);
/*
        setSupportActionBar(toolbar);
        ActionBar actionbar = getSupportActionBar();
        actionbar.setDisplayShowTitleEnabled(false);
*/

    mImagesInNewsDetailsAdapter =new ImagesInNewsDetailsAdapter();
    vpNewsDetailsImages.setAdapter(mImagesInNewsDetailsAdapter);
    }
}

