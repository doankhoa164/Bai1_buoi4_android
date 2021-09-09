package com.example.bai1_buoi4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView rv;
    RecyclerDataAdapter recyclerDataAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rv=findViewById(R.id.rv);

        recyclerDataAdapter= new RecyclerDataAdapter(this);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this,RecyclerView.VERTICAL,false);
        rv.setLayoutManager(linearLayoutManager);
        recyclerDataAdapter.setData(getListUser());
        rv.setAdapter(recyclerDataAdapter);
    }
    private List<thongtin> getListUser(){
        List<thongtin> arrayList = new ArrayList<>();

        arrayList.add(new thongtin("Mua bán có tâm","8K Fan ","+10 bài viết mới nhất","NHÓM ĐÓNG",R.drawable.ic_layout1));
        arrayList.add(new thongtin("Ăn để lăn","8K Fan ","+10 bài viết mới nhất","NHÓM KÍN",R.drawable.ic_layout2));
        arrayList.add(new thongtin("Chia sẻ kiến thức tài liệu Montessori","1,7K Fan ","+10 bài viết mới nhất","NHÓM MỞ",R.drawable.ic_layout3));
        arrayList.add(new thongtin("Thực đơn Eat - Clean giảm cân khỏe đẹp","11K Fan ","+20 bài viết mới nhất","NHÓM MỞ",R.drawable.ic_layout4));
        arrayList.add(new thongtin("Easy Kento for busy People","8K Fan ","+10 bài viết mới nhất","NHÓM KÍN",R.drawable.ic_layout5));
        arrayList.add(new thongtin("OFFB","8K Fan ","+10 bài viết mới nhất","NHÓM MỞ",R.drawable.ic_layout6));
        arrayList.add(new thongtin("Thực đơn Eat - Clean giảm cân khỏe đẹp","11K Fan ","+20 bài viết mới nhất","NHÓM MỞ",R.drawable.ic_layout4));
        arrayList.add(new thongtin("Easy Kento for busy People","8K Fan ","+10 bài viết mới nhất","NHÓM KÍN",R.drawable.ic_layout5));

        arrayList.add(new thongtin("Mua bán có tâm","8K Fan ","+10 bài viết mới nhất","NHÓM ĐÓNG",R.drawable.ic_layout1));
        arrayList.add(new thongtin("Ăn để lăn","8K Fan ","+10 bài viết mới nhất","NHÓM KÍN",R.drawable.ic_layout2));
        arrayList.add(new thongtin("Chia sẻ kiến thức tài liệu Montessori","1,7K Fan ","+10 bài viết mới nhất","NHÓM MỞ",R.drawable.ic_layout3));
        arrayList.add(new thongtin("Thực đơn Eat - Clean giảm cân khỏe đẹp","11K Fan ","+20 bài viết mới nhất","NHÓM MỞ",R.drawable.ic_layout4));
        arrayList.add(new thongtin("Easy Kento for busy People","8K Fan ","+10 bài viết mới nhất","NHÓM KÍN",R.drawable.ic_layout5));
        arrayList.add(new thongtin("OFFB","8K Fan ","+10 bài viết mới nhất","NHÓM MỞ",R.drawable.ic_layout6));
        arrayList.add(new thongtin("Thực đơn Eat - Clean giảm cân khỏe đẹp","11K Fan ","+20 bài viết mới nhất","NHÓM MỞ",R.drawable.ic_layout4));
        arrayList.add(new thongtin("Easy Kento for busy People","8K Fan ","+10 bài viết mới nhất","NHÓM KÍN",R.drawable.ic_layout5));
        return arrayList;
    }
}