package com.example.haj_ghasem;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class HistoryActivity extends AppCompatActivity {

    private TextView mTextView1,mTextView2,mTextView3,mTextView4,mTextView5,
        mTitle1,mTitle2,mTitle3,mTitle4,mTitle5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);

        findViews();
        setListeners();
    }

    private void findViews(){
        mTextView1=findViewById(R.id.txt_h1);
        mTextView2=findViewById(R.id.txt_h2);
        mTextView3=findViewById(R.id.txt_h3);
        mTextView4=findViewById(R.id.txt_h4);
        mTextView5=findViewById(R.id.txt_h5);

        mTitle1=findViewById(R.id.title_h1);
        mTitle2=findViewById(R.id.title_h2);
        mTitle3=findViewById(R.id.title_h3);
        mTitle4=findViewById(R.id.title_h4);
        mTitle5=findViewById(R.id.title_h5);
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
        mTitle5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mTextView5.getVisibility()==View.VISIBLE)
                    mTextView5.setVisibility(View.GONE);
                else
                    mTextView5.setVisibility(View.VISIBLE);
            }
        });

    }
}