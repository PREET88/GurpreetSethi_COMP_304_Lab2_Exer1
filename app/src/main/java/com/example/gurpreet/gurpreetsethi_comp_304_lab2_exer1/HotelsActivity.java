package com.example.gurpreet.gurpreetsethi_comp_304_lab2_exer1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import static com.example.gurpreet.gurpreetsethi_comp_304_lab2_exer1.CausinesActivity.message;

public class HotelsActivity extends AppCompatActivity {
    public static final String msg1="com.example.gurpreet.gurpreetsethi_comp_304_lab2_exer1.msgdel";
public String msgshow;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotels);
    }
    public boolean onCreateOptionsMenu(Menu menu) {
        Intent it=getIntent();
        String massg=it.getStringExtra(message);
        if(massg.equals("American"))
        {
            getMenuInflater().inflate(R.menu.amerc,menu);
        }

        if(massg.equals("Italian"))
        {
            getMenuInflater().inflate(R.menu.italc,menu);
        }
        if(massg.equals("Indian"))
        {
            getMenuInflater().inflate(R.menu.indianc,menu);
        }
        if(massg.equals("International"))
        {
            getMenuInflater().inflate(R.menu.interc,menu);
        }
        if(massg.equals("Chinese"))
        {
            getMenuInflater().inflate(R.menu.chinac,menu);
        }
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.in1:
                msgshow="yumyfood";
                selectrest(msgshow);
                break;
            case R.id.in2:
                msgshow="desifood";
                selectrest(msgshow);
                break;
            case R.id.in3:
            msgshow="ricefoody";
            selectrest(msgshow);
                break;
            case R.id.in4:
                msgshow="danipani";
                selectrest(msgshow);
                break;
            case R.id.in5:
                msgshow="rotikhao";
                selectrest(msgshow);
                break;
            case R.id.ch1:
                msgshow="hakka";
                selectrest(msgshow);
                break;
            case R.id.ch2:
                msgshow="dhaka";
                selectrest(msgshow);
                break;
            case R.id.ch3:
                msgshow="kemcho";
                selectrest(msgshow);
                break;
            case R.id.ch4:
                msgshow="kimchi";
                selectrest(msgshow);
                break;
            case R.id.ch5:
                msgshow="chikfood";
                selectrest(msgshow);
                break;
            case R.id.int1:
                msgshow="tasteworld";
                selectrest(msgshow);
                break;
            case R.id.int2:
                msgshow="lovefood";
                selectrest(msgshow);
                break;
            case R.id.int3:
                msgshow="foodles";
                selectrest(msgshow);
                break;
            case R.id.int4:
                msgshow="tastytuck";
                selectrest(msgshow);
                break;
            case R.id.int5:
                msgshow="tastelove";
                selectrest(msgshow);
                break;
            case R.id.amr1:
                msgshow="lovefoody";
                selectrest(msgshow);
                break;

            case R.id.amr2:
                msgshow="tastyfood";
                selectrest(msgshow);
                break;
            case R.id.amr3:
                msgshow="ustaste";
                selectrest(msgshow);
                break;
            case R.id.amr4:
                msgshow="wowtaste";
                selectrest(msgshow);
                break;
            case R.id.amr5:
                msgshow="healthytaste";
                selectrest(msgshow);
                break;
            case R.id.it1:
                msgshow="pastadelight";
                selectrest(msgshow);
                break;
            case R.id.it2:
                msgshow="yumitalian";
                selectrest(msgshow);
                break;
            case R.id.it3:
                msgshow="drinkdine";
                selectrest(msgshow);
                break;
            case R.id.it4:
                msgshow="tummytym";
                selectrest(msgshow);
                break;
            case R.id.it5:
                msgshow="hungerlit";
                selectrest(msgshow);
                break;
        }
        return true;
    }
    public void selectrest(String delop){
        Intent i= getIntent();
        String opt=i.getStringExtra(message);
        Intent i2=new Intent(this, MenuActivity.class);
        Bundle extras= new Bundle();
        extras.putString(message,opt);
        extras.putString(msg1,delop);
        i2.putExtras(extras);
        startActivity(i2);

    }
}
