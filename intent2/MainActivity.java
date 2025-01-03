package com.example.intent2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button call;
    Button sns;
    Button picture;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        call = findViewById(R.id.call);
        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("tel:010-555-6666");
                Intent intent = new Intent(Intent.ACTION_DIAL, uri);
                startActivity(intent);
            }
        });
        sns = findViewById(R.id.sns);
        sns.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_SENDTO);
                intent.putExtra("sms_body","hello");
                intent.setData(Uri.parse("smsto"+Uri.encode("010-1234-1234")));
                startActivity(intent);
            }
        });
        picture = findViewById(R.id.picture);
        picture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
            startActivity(intent);
            }
        });
    }
}