package com.example.gurpreet.gurpreetsethi_comp_304_lab2_exer1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import static com.example.gurpreet.gurpreetsethi_comp_304_lab2_exer1.CausinesActivity.message;
import static com.example.gurpreet.gurpreetsethi_comp_304_lab2_exer1.CheckOutActivity.msgAdd;
import static com.example.gurpreet.gurpreetsethi_comp_304_lab2_exer1.CheckOutActivity.msgName;
import static com.example.gurpreet.gurpreetsethi_comp_304_lab2_exer1.HotelsActivity.msg1;
import static com.example.gurpreet.gurpreetsethi_comp_304_lab2_exer1.MenuActivity.msg2;

public class ShowActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);

        Intent it = getIntent();
        String mess = it.getStringExtra(message);
        String mess1 = it.getStringExtra(msg1);
        String mess2 = it.getStringExtra(msg2);
        String messName = it.getStringExtra(msgName);
        String messAdd = it.getStringExtra(msgAdd);

        TextView tvShow = (TextView) findViewById(R.id.tvShow);
        tvShow.setText(messName+"\n"+messAdd+"\nCausine\n"+mess+"\nRestaurant\n"+mess1+"\nItems\n"+mess2);
    }
}
