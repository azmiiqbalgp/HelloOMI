package com.yippytech.omi252525.view;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.yippytech.omi252525.R;

import static android.text.style.TtsSpan.ARG_TEXT;


public class InformasiActivity extends Fragment {
    private View informasiView;

    public InformasiActivity(){

    }
    public static InformasiActivity newInstance(String text) {
        Bundle args = new Bundle();
        args.putString(ARG_TEXT, text);

        InformasiActivity sampleFragment = new InformasiActivity();
        sampleFragment.setArguments(args);

        return sampleFragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        informasiView = inflater.inflate(R.layout.activity_informasi, container, false);
        return informasiView;
    }
}
