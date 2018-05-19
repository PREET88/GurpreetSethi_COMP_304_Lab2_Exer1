package com.example.gurpreet.gurpreetsethi_comp_304_lab2_exer1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import static android.R.attr.name;
import static com.example.gurpreet.gurpreetsethi_comp_304_lab2_exer1.CausinesActivity.message;
import static com.example.gurpreet.gurpreetsethi_comp_304_lab2_exer1.HotelsActivity.msg1;
import static com.example.gurpreet.gurpreetsethi_comp_304_lab2_exer1.MenuActivity.msg2;

public class CheckOutActivity extends AppCompatActivity {

    public static final String msgName="com.example.gurpreet.gurpreetsethi_comp_304_lab2_exer1.msgname";
    public static final String msgAdd="com.example.gurpreet.gurpreetsethi_comp_304_lab2_exer1.msgadd";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_out);
    }

    public void show(View view)
    {
        EditText name = (EditText) findViewById(R.id.etName);
        EditText add = (EditText) findViewById(R.id.etAdd);
        EditText card = (EditText) findViewById(R.id.etCard);
        EditText secret = (EditText) findViewById(R.id.etSec);

        if(name.getText().toString().length()==0 || card.getText().toString().length()<16 || secret.getText().toString().length()<3)
        {
            if(name.getText().toString().length()==0)
            {
                Toast.makeText(this,"Enter Name",Toast.LENGTH_SHORT).show();
            }
            if(card.getText().toString().length()<16)
            {
                Toast.makeText(this,"Invalid Card Number",Toast.LENGTH_SHORT).show();
            }
            if(secret.getText().toString().length()<3)
            {
                Toast.makeText(this,"Invalid Secret Code",Toast.LENGTH_SHORT).show();
            }
        }
        else
        {
            Intent it = getIntent();
            String mess = it.getStringExtra(message);
            String mess1 = it.getStringExtra(msg1);
            String mess2 = it.getStringExtra(msg2);
            Intent itShow = new Intent(this, ShowActivity.class);
            Bundle extras = new Bundle();
            extras.putString(message,mess);
            extras.putString(msg1,mess1);
            extras.putString(msg2,mess2);
            extras.putString(msgName,name.getText().toString());
            extras.putString(msgAdd,add.getText().toString());
            itShow.putExtras(extras);
            startActivity(itShow);
        }
    }


}
