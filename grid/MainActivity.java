package com.example.grid;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridLayout;
import android.widget.GridView;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    GridView grid;
    View dialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        grid=findViewById(R.id.grid);

        MyGridAdapter myGridAdapter =new MyGridAdapter(MainActivity.this);
        grid.setAdapter(myGridAdapter);
    }


    class MyGridAdapter   extends BaseAdapter {
        Context context;
        Integer[] postid={R.drawable.mov01,R.drawable.mov02,R.drawable.mov03,
                R.drawable.mov04,R.drawable.mov05,R.drawable.mov06,R.drawable.mov07,
                R.drawable.mov08,R.drawable.mov09,R.drawable.mov10,R.drawable.mov11,
                R.drawable.mov12,R.drawable.mov13,R.drawable.mov14,R.drawable.mov15,
                R.drawable.mov16,R.drawable.mov17,R.drawable.mov18,R.drawable.mov19,
                R.drawable.mov20, R.drawable.mov21,R.drawable.mov22,R.drawable.mov23,
                R.drawable.mov24};
        public MyGridAdapter(Context context){
            this.context = context;              }
        @Override
        public int getCount() {
            return postid.length;        }
        @Override
        public Object getItem(int i) {
            return null;
        }
        @Override
        public long getItemId(int i) {
            return 0;
        }
        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            ImageView imageView =new ImageView(context);
            imageView.setLayoutParams(new ViewGroup.LayoutParams(150,200));
            imageView.setPadding(5,5,5,5);
            imageView.setImageResource(postid[i]);
            final int pos =i;

            imageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    dialog =View.inflate(MainActivity.this,R.layout.dialog,null);
                    AlertDialog.Builder dlg=new AlertDialog.Builder(MainActivity.this);
                    String[ ] posterTitle = { "토이스토리4", "호빗3", "제이슨 본", "반지의 제왕 3",
                            "정직한 후보", "나쁜 녀석들", "겨울왕국 ", "알라딘","극한직업", "스파이더맨",
                            "레옹", "주먹왕랄프2","타짜","걸캅스","도굴","어벤져스",
                            "엑시트","캡틴마블","봉오동전투","분노의 전투",
                            "대부","국가대표","토이3","마당에 나온 암닭"};

                    ImageView  ivpost =dialog.findViewById(R.id.ivPost);
                    ivpost.setImageResource(postid[pos]);
                    dlg.setTitle(posterTitle[pos]);
                    dlg.setView(dialog);
                    dlg.setNegativeButton("close",null);
                    dlg.setPositiveButton("ok", null);
                    dlg.show();
                }
            });
            return imageView;
        }
    }
}