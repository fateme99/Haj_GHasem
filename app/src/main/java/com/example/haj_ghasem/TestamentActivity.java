package com.example.haj_ghasem;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class TestamentActivity extends AppCompatActivity {

    private TextView mTextView1,mTextView2,mTextView3,mTextView4,mTextView5,mTextView6,mTextView7
            ,mTextView8,mTextView9,mTextView10,mTextView11,mTextView12,mTextView13,
            mTitle1,mTitle2,mTitle3,mTitle4,mTitle5,mTitle6,mTitle7,mTitle8,mTitle9,mTitle10,
            mTitle11,mTitle12,mTitle13;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_testament);
        findViews();
        setListeners();
    }
    private void findViews(){
        mTextView1=findViewById(R.id.text1);
        mTextView2=findViewById(R.id.text2);
        mTextView3=findViewById(R.id.text3);
        mTextView4=findViewById(R.id.text4);
        mTextView5=findViewById(R.id.text5);
        mTextView6=findViewById(R.id.text6);
        mTextView7=findViewById(R.id.text7);
        mTextView8=findViewById(R.id.text8);
        mTextView9=findViewById(R.id.text9);
        mTextView10=findViewById(R.id.text10);
        mTextView11=findViewById(R.id.text11);
        mTextView12=findViewById(R.id.text12);
        mTextView13=findViewById(R.id.text13);

        mTitle1=findViewById(R.id.title1);
        mTitle2=findViewById(R.id.title2);
        mTitle3=findViewById(R.id.title3);
        mTitle4=findViewById(R.id.title4);
        mTitle5=findViewById(R.id.title5);
        mTitle6=findViewById(R.id.title6);
        mTitle7=findViewById(R.id.title7);
        mTitle8=findViewById(R.id.title8);
        mTitle9=findViewById(R.id.title9);
        mTitle10=findViewById(R.id.title10);
        mTitle11=findViewById(R.id.title11);
        mTitle12=findViewById(R.id.title12);
        mTitle13=findViewById(R.id.title13);
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
        mTitle6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mTextView6.getVisibility()==View.VISIBLE)
                    mTextView6.setVisibility(View.GONE);
                else
                    mTextView6.setVisibility(View.VISIBLE);
            }
        });
        mTitle7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mTextView7.getVisibility()==View.VISIBLE)
                    mTextView7.setVisibility(View.GONE);
                else
                    mTextView7.setVisibility(View.VISIBLE);
            }
        });
        mTitle8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mTextView8.getVisibility()==View.VISIBLE)
                    mTextView8.setVisibility(View.GONE);
                else
                    mTextView8.setVisibility(View.VISIBLE);
            }
        });
        mTitle9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mTextView9.getVisibility()==View.VISIBLE)
                    mTextView9.setVisibility(View.GONE);
                else
                    mTextView9.setVisibility(View.VISIBLE);
            }
        });
        mTitle10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mTextView10.getVisibility()==View.VISIBLE)
                    mTextView10.setVisibility(View.GONE);
                else
                    mTextView10.setVisibility(View.VISIBLE);
            }
        });
        mTitle11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mTextView11.getVisibility()==View.VISIBLE)
                    mTextView11.setVisibility(View.GONE);
                else
                    mTextView11.setVisibility(View.VISIBLE);
            }
        });
        mTitle12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mTextView12.getVisibility()==View.VISIBLE)
                    mTextView12.setVisibility(View.GONE);
                else
                    mTextView12.setVisibility(View.VISIBLE);
            }
        });
        mTitle13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mTextView13.getVisibility()==View.VISIBLE)
                    mTextView13.setVisibility(View.GONE);
                else
                    mTextView13.setVisibility(View.VISIBLE);
            }
        });

    }
}