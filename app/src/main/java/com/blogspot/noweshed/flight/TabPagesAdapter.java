package com.blogspot.noweshed.flight;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

class TabPagesAdapter extends FragmentStatePagerAdapter {

    public TabPagesAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int positions) {
        switch (positions) {
            case 0:
                OnWayFragment onWayFragment = new OnWayFragment();
                return onWayFragment;
            case 1:
                RoundTripFragment roundTripFragment = new RoundTripFragment();
                return roundTripFragment;
            case 2:
                MultiCityFragment multiCityFragment = new MultiCityFragment();
                return multiCityFragment;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "On Way";
            case 1:
                return "Round Trip";
            case 2:
                return "MultiCity";
            default:
                return null;
        }
    }
}
