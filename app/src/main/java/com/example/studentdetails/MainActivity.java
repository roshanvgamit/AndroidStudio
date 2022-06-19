package com.example.studentdetails;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    LinearLayoutManager layoutManager;
    List<ModelClass>userList;
    Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initData();
        initRecyclerView();


    }

    private void initData() {

        userList=new ArrayList<>();
        userList.add(new ModelClass(R.drawable.zero,"aimee Zank","-------------------------------------"));
        userList.add(new ModelClass(R.drawable.one,"Aurelia Menendez","-------------------------------------"));
        userList.add(new ModelClass(R.drawable.two,"Corliss Zuk","-------------------------------------"));
        userList.add(new ModelClass(R.drawable.three,"Bao Ziglar","-------------------------------------"));
        userList.add(new ModelClass(R.drawable.four,"Zachary Langlais","-------------------------------------"));
        userList.add(new ModelClass(R.drawable.five,"Wilburn Spiess","-------------------------------------"));
        userList.add(new ModelClass(R.drawable.six,"Jenette Flanders","-------------------------------------"));
        userList.add(new ModelClass(R.drawable.seven,"Salena Olmos","-------------------------------------"));
        userList.add(new ModelClass(R.drawable.eight,"Daphne Zheng","-------------------------------------"));
        userList.add(new ModelClass(R.drawable.nine,"Sanda Ryba","-------------------------------------"));
        userList.add(new ModelClass(R.drawable.ten,"Denisha Cast","-------------------------------------"));
        userList.add(new ModelClass(R.drawable.eleven,"Student","-------------------------------------"));
        userList.add(new ModelClass(R.drawable.twelve,"Student","-------------------------------------"));
        userList.add(new ModelClass(R.drawable.thirteen,"Student","-------------------------------------"));
        userList.add(new ModelClass(R.drawable.fourteen,"Student","-------------------------------------"));
        userList.add(new ModelClass(R.drawable.fifteen,"Student","-------------------------------------"));
        userList.add(new ModelClass(R.drawable.sixteen,"Student","-------------------------------------"));
        userList.add(new ModelClass(R.drawable.seventeen,"Student","-------------------------------------"));
        userList.add(new ModelClass(R.drawable.eighteen,"Student","-------------------------------------"));
        userList.add(new ModelClass(R.drawable.nineteen,"Student","-------------------------------------"));
        userList.add(new ModelClass(R.drawable.twenty,"Student","-------------------------------------"));
        userList.add(new ModelClass(R.drawable.twentyone,"Student","-------------------------------------"));
        userList.add(new ModelClass(R.drawable.twentytwo,"Student","-------------------------------------"));
        userList.add(new ModelClass(R.drawable.twentythree,"Student","-------------------------------------"));
        userList.add(new ModelClass(R.drawable.twentyfour,"Student","-------------------------------------"));
        userList.add(new ModelClass(R.drawable.twentyfive,"Student","-------------------------------------"));
        userList.add(new ModelClass(R.drawable.twentysix,"Student","-------------------------------------"));
        userList.add(new ModelClass(R.drawable.twentyseven,"Student","-------------------------------------"));
        userList.add(new ModelClass(R.drawable.twentyeight,"Student","-------------------------------------"));
        userList.add(new ModelClass(R.drawable.twentynine,"Student","-------------------------------------"));


    }

    private void initRecyclerView() {

        recyclerView=findViewById(R.id.recyclerview);
        layoutManager=new LinearLayoutManager(this);
        layoutManager.setOrientation(RecyclerView.VERTICAL);
        adapter=new Adapter(userList);
        adapter.notifyDataSetChanged();

    }
}