package com.padcmyanmar.zwe.mmnews.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.padcmyanmar.zwe.mmnews.R;
import com.padcmyanmar.zwe.mmnews.adapters.NewsAdapter;
import com.padcmyanmar.zwe.mmnews.delegates.NewsActionDelegate;

import butterknife.BindView;

public class MainActivity extends AppCompatActivity implements NewsActionDelegate{

    @BindView(R.id.rv_news)
    RecyclerView rvNews;

    @BindView(R.id.toolbar)
    Toolbar toolbar;

    @BindView(R.id.fab)
    FloatingActionButton fab;

    private NewsAdapter mNewsAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        mNewsAdapter = new NewsAdapter(this);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext(),
                LinearLayoutManager.VERTICAL,false);

        rvNews.setLayoutManager(linearLayoutManager);

        rvNews.setAdapter(mNewsAdapter);
/*
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getApplicationContext(),2);
        rvNews.setLayoutManager(gridLayoutManager);
*/
        rvNews.setAdapter(mNewsAdapter);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onTapNewsItem() {
        Intent intent = new Intent(getApplicationContext(),NewsDetailsActivity.class);
        startActivity(intent);
    }

    @Override
    public void onTapComment() {

    }

    @Override
    public void onTapSendTo() {

    }

    @Override
    public void onTapFavourite() {

    }
}
