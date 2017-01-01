package com.yippytech.omi252525.view;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.yippytech.omi252525.R;
import com.yippytech.omi252525.model.InformasiModels;
import com.yippytech.omi252525.rest.ApiClient;
import com.yippytech.omi252525.rest.ApiInterface;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * A simple {@link Fragment} subclass.
 */
public class InformasiFragment extends Fragment {

    private static final String TAG = InformasiFragment.class.getSimpleName();

    public InformasiFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        ApiInterface apiService =
                ApiClient.getClient().create(ApiInterface.class);
        Call<List<InformasiModels>> call = apiService.getInformasi();
        call.enqueue(new Callback<List<InformasiModels>>() {
            @Override
            public void onResponse(Call<List<InformasiModels>> call, Response<List<InformasiModels>> response) {
                List<InformasiModels> data = response.body();
                for(int i=0; i< data.size(); i++) {
                    Log.d(TAG, data.get(i).getSubjekInformasi());
                }
            }

            @Override
            public void onFailure(Call<List<InformasiModels>> call, Throwable t) {
                Log.e(TAG,t.toString());
            }
        });
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_informasi, container, false);
    }

}
