package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;

import java.text.BreakIterator;

public class recycle_adapter extends RecyclerView.Adapter<ViewHolder> {
    private  MyListData[] listData;
    
    
    public recycle_adapter(MyListData[] myListData) {
        this.listData= listData;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        View listItem=inflater.inflate(R.layout.custom_row,parent,false);
        ViewHolder viewHolder = new ViewHolder(listItem);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
         final MyListData myListData=listData[position];
         holder.txtView.setText(myListData.getS());
         holder.btn
    
    }

    @Override
    public int getItemCount() {
        return listData.length;
    }
    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView txtView;
        public RelativeLayout relativeLayout;
        public Button btn1;
        
        
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            this.relativeLayout=(RelativeLayout)itemView.findViewById(R.id.relativelayout); 
            this.txtView=(TextView)itemView.findViewById(R.id.textView);
            this.btn1=(Button)itemView.findViewById(R.id.rec_btn);
        }
    }
}
