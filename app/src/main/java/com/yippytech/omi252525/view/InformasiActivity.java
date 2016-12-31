package com.yippytech.omi252525.view;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.yippytech.omi252525.R;

public class InformasiActivity extends Fragment {
    private View informasiView;
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        informasiView = inflater.inflate(R.layout.activity_informasi, container, false);
        return informasiView;
    }
}
