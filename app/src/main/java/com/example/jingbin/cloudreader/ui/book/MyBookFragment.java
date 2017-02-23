package com.example.jingbin.cloudreader.ui.book;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.jingbin.cloudreader.R;

/**
 * Created by Administrator on 2017/1/16.
 */
public class MyBookFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.mybookfragment,container,false);
        return super.onCreateView(inflater, container, savedInstanceState);
    }
}
