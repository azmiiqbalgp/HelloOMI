package com.yippytech.omi252525.view;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.yippytech.omi252525.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class PertandinganFragment extends Fragment {


    public PertandinganFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_pertandingan, container, false);
    }

}
