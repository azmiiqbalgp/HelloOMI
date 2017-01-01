package com.yippytech.omi252525.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.yippytech.omi252525.R;
import com.yippytech.omi252525.model.InformasiModels;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by ryanbaskara on 01/01/17.
 */

public class InformasiAdapter extends RecyclerView.Adapter<InformasiAdapter.ViewHolder> {
    private Context context;
    private List<InformasiModels> informasiModels;

    public InformasiAdapter(Context context, List<InformasiModels> informasiModels) {
        this.context = context;
        this.informasiModels = informasiModels;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext())
                .inflate(R.layout.adapter_informasi, parent, false));
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        final InformasiModels item = informasiModels.get(position);
        holder.tvJudul.setText(item.getJudulInformasi());
        holder.tvSubjek.setText(item.getSubjekInformasi());
        holder.tvTanggal.setText(item.getDateInformasi());
        holder.tvIsi.setText(item.getIsipendekInformasi());
    }

    @Override
    public int getItemCount() {
        return informasiModels.size();
    }


    static class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvJudul;
        TextView tvSubjek;
        ImageView ivGambar;
        TextView tvTanggal;
        TextView tvIsi;

        ViewHolder(View view) {
            super(view);
            tvJudul = (TextView) view.findViewById(R.id.tv_judul);
            tvSubjek = (TextView) view.findViewById(R.id.tv_subjek);
            ivGambar = (ImageView) view.findViewById(R.id.iv_gambar);
            tvTanggal = (TextView) view.findViewById(R.id.tv_tanggal);
            tvIsi = (TextView) view.findViewById(R.id.tv_isi);
        }
    }
}
