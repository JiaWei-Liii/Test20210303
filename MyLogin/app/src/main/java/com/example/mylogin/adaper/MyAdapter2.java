package com.example.mylogin.adaper;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseDataBindingHolder;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.example.mylogin.R;
import com.example.mylogin.bean.UserBean;

import java.util.ArrayList;
import java.util.List;

public class MyAdapter2 extends BaseQuickAdapter<UserBean, BaseViewHolder> {

    public MyAdapter2(){
        super(R.layout.item_user_info);
    }

    @Override
    protected  void convert(@NonNull BaseViewHolder baseViewHolder, UserBean bean){
        baseViewHolder.setText(R.id.tv_user_name,bean.getUserName());
        baseViewHolder.setImageResource(R.id.tv_user_head,bean.getHeadID());
    }

}
