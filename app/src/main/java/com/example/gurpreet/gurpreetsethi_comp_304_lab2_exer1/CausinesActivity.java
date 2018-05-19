package com.example.gurpreet.gurpreetsethi_comp_304_lab2_exer1;

import android.content.Intent;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class CausinesActivity extends AppCompatActivity {

    public static final String message = "com.example.gurpreet.gurpreetsethi_comp304_lab2_exercise1.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_causines);

        Intent itMain = getIntent();
    }
    public void goToAmRest(View view) {
        String msg = "American";
        Intent it = new Intent(CausinesActivity.this, HotelsActivity.class);
        it.putExtra(message, msg);
        startActivity(it);
    }
    public void goToItRest(View view) {
        String msg = "Italian";
        Intent it = new Intent(CausinesActivity.this, HotelsActivity.class);
        it.putExtra(message, msg);
        startActivity(it);
    }
    public void goToChRest(View view) {
        String msg = "Chinese";
        Intent it = new Intent(CausinesActivity.this, HotelsActivity.class);
        it.putExtra(message, msg);
        startActivity(it);
    }
    public void goToInRest(View view) {
        String msg = "Indian";
        Intent it = new Intent(CausinesActivity.this, HotelsActivity.class);
        it.putExtra(message, msg);
        startActivity(it);
    }
    public void goToIntRest(View view) {
        String msg = "International";
        Intent it = new Intent(CausinesActivity.this, HotelsActivity.class);
        it.putExtra(message,msg);
        startActivity(it);
    }
}
