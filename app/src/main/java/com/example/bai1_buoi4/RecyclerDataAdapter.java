package com.example.bai1_buoi4;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerDataAdapter extends RecyclerView.Adapter<RecyclerDataAdapter.MyViewHolder> {
    public List<thongtin> thongtinlist;
    public Context mContext;

    public RecyclerDataAdapter(Context mContext) {
        this.mContext = mContext;
    }

    public void setData(List<thongtin> list) {
        this.thongtinlist = list;
        notifyDataSetChanged();
    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout1, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        thongtin inf = thongtinlist.get(position);
        if (inf == null) {
            return;
        }
        holder.tv_name.setText(inf.getname());
        holder.tv_fan.setText(inf.getfan());
        holder.tv_kieuNhom.setText((inf.getkieuNhom()));
        holder.tv_soBaiViet.setText(inf.getsoBaiViet());
        holder.img.setImageResource(inf.gethinh());
    }

    @Override
    public int getItemCount() {
        if (thongtinlist != null) {
            return thongtinlist.size();
        }
        return 0;
    }

    class MyViewHolder extends RecyclerView.ViewHolder {

        ImageView img;
        TextView tv_name, tv_fan, tv_soBaiViet, tv_kieuNhom;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            img = itemView.findViewById(R.id.im_1);
            tv_name = itemView.findViewById(R.id.tv_1);
            tv_fan = itemView.findViewById(R.id.tv_2);
            tv_soBaiViet = itemView.findViewById(R.id.tv_3);
            tv_kieuNhom = itemView.findViewById(R.id.tv_4);
        }
    }
}
