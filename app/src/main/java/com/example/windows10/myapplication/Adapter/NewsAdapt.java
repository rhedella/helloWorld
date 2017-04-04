package com.example.windows10.myapplication.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.windows10.myapplication.Model.News;
import com.example.windows10.myapplication.R;

import java.util.List;

/**
 * Created by Windows 10 on 4/3/2017.
 */

public class NewsAdapt extends RecyclerView.Adapter<NewsAdapt.ViewHolder> {

    private List<News> daftarBerita;

    public NewsAdapt(List<News> daftarBerita) {
        this.daftarBerita = daftarBerita;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        int itemLayout = R.layout.adapter_news_item;
        View view = LayoutInflater.from(context).inflate(itemLayout,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.namaInstansi.setText(daftarBerita.get(position).getNamaInstansi());
        holder.namaKet.setText(daftarBerita.get(position).getKeterangan());
    }

    @Override
    public int getItemCount() {
        return daftarBerita.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView namaInstansi, namaKet;

        public ViewHolder(View itemView) {
            super(itemView);
            namaInstansi = (TextView)itemView.findViewById(R.id.nama_instansi);
            namaKet = (TextView)itemView.findViewById(R.id.nama_keterangan);
        }
    }
}
