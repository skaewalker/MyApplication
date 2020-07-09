package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.TextView;

public class recycler_view extends AppCompatActivity {
RecyclerView recyclerView;
recycle_adapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);
        MyListData[] myListData=new MyListData[]{
                new MyListData("C++"),
                new MyListData("Java"),new MyListData("Bootstrap"),
                new MyListData("jQuery"),
                new MyListData("Python"),
                new MyListData("PHP"),
                new MyListData("HTML"),
                new MyListData("JavaScript")

        };
        recyclerView=(RecyclerView)findViewById(R.id.recycler_view);
    recycle_adapter adapter=new recycle_adapter(myListData);
    //myNewAdapter = new MyNewAdapter(myListData);
        RecyclerView.LayoutManager manager= new LinearLayoutManager(getApplicationContext(),LinearLayoutManager.VERTICAL,false);
    recyclerView.setLayoutManager(manager);
    recyclerView.setAdapter(adapter);
    }
}