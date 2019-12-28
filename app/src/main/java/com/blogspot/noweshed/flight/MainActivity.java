package com.blogspot.noweshed.flight;

import android.graphics.Color;
import android.support.design.widget.NavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    private Toolbar mToolbar;
    private ViewPager mViewPager;

    private TabPagesAdapter mTabPagesAdapter;
    private TabLayout mTabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mViewPager = (ViewPager)findViewById(R.id.viewpagerId);
        mTabPagesAdapter = new TabPagesAdapter(getSupportFragmentManager());
        mToolbar = (Toolbar) findViewById(R.id.toolbarId);

        mViewPager.setAdapter(mTabPagesAdapter);
        mTabLayout = (TabLayout) findViewById(R.id.tabId);
        mTabLayout.setTabTextColors(Color.parseColor("#000000"),Color.parseColor("#FFFFFF"));
        mTabLayout.setupWithViewPager(mViewPager);
    }
}
