package com.example.mylogin;



import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private View jumpBtm;
    private TextView jump2RecyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        jumpBtm = findViewById(R.id.tv_jump);
        jumpBtm.setOnClickListener(v->{
                Intent intent = new Intent(MainActivity.this, SettingActivity.class);
                startActivity(intent);

        });
        jump2RecyclerView = findViewById(R.id.tv_jump_recycler);
        jump2RecyclerView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                startActivity(new Intent(MainActivity.this, RecyclerViewActivity.class));
            }
        });
    }
}