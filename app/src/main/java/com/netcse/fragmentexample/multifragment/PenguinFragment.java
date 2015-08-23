package com.netcse.fragmentexample.multifragment;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.netcse.fragmentexample.R;

/**
 * Created by netcse on 8/23/2015.
 */
public class PenguinFragment extends android.support.v4.app.Fragment{
        public PenguinFragment(){

        }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState){
        View rootView = inflater.inflate(R.layout.fragment_multi_koala, null);
        return super.onCreateView(inflater, container, savedInstanceState);
    }
}
