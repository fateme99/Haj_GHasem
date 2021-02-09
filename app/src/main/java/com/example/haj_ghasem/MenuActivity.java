package com.example.haj_ghasem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MenuActivity extends AppCompatActivity {
    TextView mTextView_history,mTextView_memory,mTextView_testament,mTextView_lecture;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        findViews();
        setListeners();
    }

    private void findViews(){
        mTextView_history=findViewById(R.id.history_btn);
        mTextView_testament=findViewById(R.id.testament_btn);
        mTextView_lecture=findViewById(R.id.lecture_btn);
        mTextView_memory=findViewById(R.id.memory_btn);
    }

    private void setListeners(){
        mTextView_history.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MenuActivity.this , HistoryActivity.class);
                startActivity(intent);
            }
        });

        mTextView_testament.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MenuActivity.this , TestamentActivity.class);
                startActivity(intent);
            }
        });

        mTextView_memory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MenuActivity.this , MemoryActivity.class );
                startActivity(intent);
            }
        });

        mTextView_lecture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MenuActivity.this ,LectureActivity.class);
                startActivity(intent);
            }
        });
    }
}