package com.example.mylogin.adaper;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mylogin.R;

import java.util.ArrayList;
import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder>{

    private List<String> data;

    public MyAdapter(){
        data = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            data.add("用户" + i);
        }
    }
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //View view = View.inflate(parent.getContext(), R.layout.item_user_info,parent);
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_user_info,parent,false);
        MyViewHolder vh = new MyViewHolder(view);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        String name = data.get(position);
        holder.setUserName(name);
    }

    @Override
    public int getItemCount() {
        return data.size();
    }
    public  static class  MyViewHolder extends RecyclerView.ViewHolder{
        private ImageView userHead;
        private TextView userName;
        public MyViewHolder(@NonNull View itemView){

            super(itemView);
            userHead = itemView.findViewById(R.id.tv_user_head);
            userName = itemView.findViewById(R.id.tv_user_name);
        }

        public void setUserName(String name){
            userName.setText(name);
        }
    }
}
