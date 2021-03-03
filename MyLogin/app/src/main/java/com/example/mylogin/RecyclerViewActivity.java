package com.example.mylogin;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mylogin.adaper.MyAdapter;
import com.example.mylogin.adaper.MyAdapter2;
import com.example.mylogin.bean.UserBean;

public class RecyclerViewActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    // private MyAdapter myAdapter;
    private MyAdapter2 myAdapter2;
    private Button addDataBtn;

    @Override
    protected void onCreate(@NonNull Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);
        mRecyclerView = findViewById(R.id.rv_content);
        addDataBtn = findViewById(R.id.btn_add_data);

        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        myAdapter2 = new MyAdapter2();
        mRecyclerView.setAdapter(myAdapter2);


        addDataBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                UserBean bean = new UserBean();

                bean.setUserName("我是新加的数据："+System.currentTimeMillis());
                if(myAdapter2.getData().size()%2==1){
                    bean.setHeadID(R.drawable.icon_head_1);
                }else{
                    bean.setHeadID(R.drawable.icon_head_2);
                }
                myAdapter2.addData(bean);
            }
        });
    }
}
