package com.uni.bremen.hastag_inspektor;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class TabAdapter extends FragmentPagerAdapter {
    TabAdapter(FragmentManager fm) {
        super(fm);
    }
    /**
     * Return fragment with respect to Position .
     */
    @Override
    public Fragment getItem(int position)
    {
        switch (position){
            case 0 : return new SimilarHashtagFragment();
            case 1 : return new TweetFragment();
        }
        return null;
    }
    @Override
    public int getCount() {
        int int_items = 2;
        return int_items;
    }
    /**
     * This method returns the title of the tab according to the position.
     */
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0 :
                return "Similar Hashtags";
            case 1 :
                return "Tweets";
        }
        return null;
    }
}