package com.example.administrator.cleandemo.welfare;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.administrator.cleandemo.BaseFragment;

/**
 * Created by Administrator on 2016/4/27.
 */
public class WelfareFragment extends BaseFragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        TextView textView = new TextView(getActivity());
        textView.setText("福利");
        textView.setTextColor(Color.BLUE);
        return textView;
    }
}
