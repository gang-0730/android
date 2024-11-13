package com.example.menu1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    LinearLayout linear;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        linear = findViewById(R.id.linear);
        button = findViewById(R.id.button);
    }//onCreate method
    //추가메소드 옵션 메뉴 나타나기

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);//아버지생성자를 불러서 아버지에 있는 생성자메소드 이를 처리함
        //MenuInflater menuInflater =getMenuInflater();
        //minflater.inflate(R.menu.menu1.menu);


        return true;
    }


    //추가메소드 옵션기능 실행할 소스

}//class