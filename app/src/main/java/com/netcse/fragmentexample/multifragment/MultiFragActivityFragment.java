package com.netcse.fragmentexample.multifragment;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.netcse.fragmentexample.R;

/**
 * A placeholder fragment containing a simple view.
 */
public class MultiFragActivityFragment extends Fragment {

    public MultiFragActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_multi_koala, container, false);
    }
}
