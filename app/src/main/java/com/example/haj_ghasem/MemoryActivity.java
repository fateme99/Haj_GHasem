package com.example.haj_ghasem;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MemoryActivity extends AppCompatActivity {
    private TextView mTextView1 , mTextView2,mTextView3,mTextView4,
        mTitle1,mTitle2,mTitle3,mTitle4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_memory);
        findViews();
        setListeners();
    }

    private void findViews(){
        mTextView1=findViewById(R.id.txt_m1);
        mTextView2=findViewById(R.id.txt_m2);
        mTextView3=findViewById(R.id.txt_m3);
        mTextView4=findViewById(R.id.txt_m4);

        mTitle1=findViewById(R.id.title_m1);
        mTitle2=findViewById(R.id.title_m2);
        mTitle3=findViewById(R.id.title_m3);
        mTitle4=findViewById(R.id.title_m4);
    }

    private void setListeners(){
        mTitle1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mTextView1.getVisibility()==View.VISIBLE)
                    mTextView1.setVisibility(View.GONE);
                else
                    mTextView1.setVisibility(View.VISIBLE);
            }
        });
        mTitle2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mTextView2.getVisibility()==View.VISIBLE)
                    mTextView2.setVisibility(View.GONE);
                else
                    mTextView2.setVisibility(View.VISIBLE);
            }
        });
        mTitle3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mTextView3.getVisibility()==View.VISIBLE)
                    mTextView3.setVisibility(View.GONE);
                else
                    mTextView3.setVisibility(View.VISIBLE);
            }
        });
        mTitle4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mTextView4.getVisibility()==View.VISIBLE)
                    mTextView4.setVisibility(View.GONE);
                else
                    mTextView4.setVisibility(View.VISIBLE);
            }
        });

    }
}