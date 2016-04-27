package com.example.administrator.cleandemo.factory;

import android.util.SparseArray;

import com.example.administrator.cleandemo.BaseFragment;
import com.example.administrator.cleandemo.android.AndroidFragment;
import com.example.administrator.cleandemo.home.HomeFragment;
import com.example.administrator.cleandemo.ios.IosFragment;
import com.example.administrator.cleandemo.welfare.WelfareFragment;

/**
 * Created by Administrator on 2016/4/27.
 */
public class FragmentFactory {
    private static SparseArray<BaseFragment> fragments = new SparseArray<>();

    public static BaseFragment createFragment(int position) {
        BaseFragment fragment = fragments.get(position);
        if (fragment == null) {
            switch (position) {
                case 0:
                    fragment = new HomeFragment();
                    break;
                case 1:
                    fragment = new AndroidFragment();
                    break;
                case 2:
                    fragment = new IosFragment();
                    break;
                case 3:
                    fragment = new WelfareFragment();
                    break;
            }
        }
        fragments.put(position, fragment);
        return fragment;
    }
}
