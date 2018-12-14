package com.ytl.tabexperience;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by Richard Yi-Te Lu on 14,December,2018
 */
public class PagerAdapter extends FragmentStatePagerAdapter {
    int mNumOfTabs;

    public PagerAdapter(FragmentManager fm, int NumOfTabs) {
        super(fm);
        this.mNumOfTabs = NumOfTabs;
    }

    //Return the Fragment associated with a specified position.
    @Override
    public Fragment getItem(int i) {
        switch (i){
            case 0: return new TabFragment1();
            case 1: return new TabFragment2();
            case 2: return new TabFragment3();
            default: return null;
        }
    }

    //Return the number of views available.
    @Override
    public int getCount() {
        return mNumOfTabs;
    }
}
