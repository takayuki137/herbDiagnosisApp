package com.example.intentpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        Intent intent = this.getIntent();
        String text1 = intent.getStringExtra("sendText1");
        String text2 = intent.getStringExtra("sendText2");
        String text3 = intent.getStringExtra("sendText3");
        TextView textView1 = findViewById(R.id.textView1);
        textView1.setText(text1);
        TextView textView2 = findViewById(R.id.textView2);
        textView2.setText(text2);
        TextView textView3 = findViewById(R.id.textView3);
        textView3.setText(text3);


    }
}