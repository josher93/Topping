package com.globalpaysolutions.topping.ui.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.globalpaysolutions.topping.R;

public class TabHistoryWeek extends Fragment
{
    public TabHistoryWeek()
    {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_tab_history_week, container, false);
    }

}
