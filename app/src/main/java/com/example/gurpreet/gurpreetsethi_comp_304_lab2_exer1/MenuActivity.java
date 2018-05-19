package com.example.gurpreet.gurpreetsethi_comp_304_lab2_exer1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

import static com.example.gurpreet.gurpreetsethi_comp_304_lab2_exer1.CausinesActivity.message;
import static com.example.gurpreet.gurpreetsethi_comp_304_lab2_exer1.HotelsActivity.msg1;

public class MenuActivity extends AppCompatActivity {

    public static final String msg2="com.example.gurpreet.gurpreetsethi_comp_304_lab2_exer1.msgmenu";
    String msg = "";
    CheckBox ch1,ch2,ch3,ch4,ch5;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        Intent goint=getIntent() ;
        String test=goint.getStringExtra(message);
        String msgshow=goint.getStringExtra(msg1);

        ch1 = (CheckBox) findViewById(R.id.chk1);
        ch2 = (CheckBox) findViewById(R.id.chk2);
        ch3 = (CheckBox) findViewById(R.id.chk3);
        ch4 = (CheckBox) findViewById(R.id.chk4);
        ch5 = (CheckBox) findViewById(R.id.chk5);

        if(test.equals("American") && msgshow.equals("lovefoody"))
        {
            ch1.setText("Yum Yum");
            ch2.setText("Gummi");
            ch3.setText("Mango Mint");
            ch4.setText("Rajma");
            ch5.setText("Channe");
        }
        else if(test.equals("American") && msgshow.equals("tastfood"))
        {
            ch1.setText("Food Food");
            ch2.setText("Food Court");
            ch3.setText("Food Area");
            ch4.setText("Beans");
            ch5.setText("Channel");
        }
        else if(test.equals("American") && msgshow.equals("ustaste"))
        {
            ch1.setText("Sandy Sandwich");
            ch2.setText("Express Vegetarian");
            ch3.setText("Falakk");
            ch4.setText("Cremica");
            ch5.setText("Ice creams");
        }
        else if(test.equals("American") && msgshow.equals("wowtaste"))
        {
            ch1.setText("Yummy bar");
            ch2.setText("Samose");
            ch3.setText("Bhature");
            ch4.setText("Naaan");
            ch5.setText("poha");
        }
        else if(test.equals("American") && msgshow.equals("healthytaste"))
        {
            ch1.setText("Macroni");
            ch2.setText("Pazzta");
            ch3.setText("Puriyan");
            ch4.setText("halwa");
            ch5.setText("Black Channe");
        }
        else if(test.equals("Italian") && msgshow.equals("pastadelight"))
        {
            ch1.setText("Fish");
            ch2.setText("Chicken");
            ch3.setText("Mutton");
            ch4.setText("Pork");
            ch5.setText("Beaf");
        }
        else if(test.equals("Italian") && msgshow.equals("yumitalian"))
        {
            ch1.setText("butter chicken");
            ch2.setText("Tandori Chicken");
            ch3.setText("Malai kofta");
            ch4.setText("Rajma chawal");
            ch5.setText("Biryani");
        }
        else if(test.equals("Italian") && msgshow.equals("drinkdine"))
        {
            ch1.setText("Chilly Chicken");
            ch2.setText("Pataka");
            ch3.setText("Jasleen");
            ch4.setText("Supreet");
            ch5.setText("Jaskaran");
        }
        else if(test.equals("Italian") && msgshow.equals("tummytym"))
        {
            ch1.setText("Gurpreet");
            ch2.setText("Jaskiran");
            ch3.setText("Supu");
            ch4.setText("Soap");
            ch5.setText("Salad");
        }
        else if(test.equals("Italian") && msgshow.equals("hungerlit"))
        {
            ch1.setText("Pastry");
            ch2.setText("Cake");
            ch3.setText("Cookies");
            ch4.setText("Doritos");
            ch5.setText("Kitkat");
        }
        else if(test.equals("International") && msgshow.equals("tasteworld"))
        {
            ch1.setText("Bounty");
            ch2.setText("Twix");
            ch3.setText("Hershy");
            ch4.setText("Munch");
            ch5.setText("Five Star");
        }
        else if(test.equals("International") && msgshow.equals("lovefood"))
        {
            ch1.setText("Gobind's");
            ch2.setText("Gopal's");
            ch3.setText("CCD");
            ch4.setText("Chocolate Cafe");
            ch5.setText("Chocolate room");
        }
        else if(test.equals("International") && msgshow.equals("foodless"))
        {
            ch1.setText("Bansal Bakers");
            ch2.setText("Parkash bakers");
            ch3.setText("Cholle");
            ch4.setText("Cheetos");
            ch5.setText("Cherries");
        }
        else if(test.equals("International") && msgshow.equals("tastytuck"))
        {
            ch1.setText("Apple");
            ch2.setText("Mango");
            ch3.setText("Strawberry");
            ch4.setText("Pear");
            ch5.setText("Avacado");
        }
        else if(test.equals("International") && msgshow.equals("tastelove"))
        {
            ch1.setText("Pomegranate");
            ch2.setText("BlueBerry");
            ch3.setText("Pickle");
            ch4.setText("Hari Pari");
            ch5.setText("Lambu Master");
        }
        else if(test.equals("Chinese") && msgshow.equals("hakka"))
        {
            ch1.setText("Sohni kudi");
            ch2.setText("Pataka Gudi");
            ch3.setText("Daal");
            ch4.setText("Yellow Daal");
            ch5.setText("Green Daal");
        }
        else if(test.equals("Chinese") && msgshow.equals("dhaka"))
        {
            ch1.setText("Daliya");
            ch2.setText("Dahi Bhalle");
            ch3.setText("Five Star");
            ch4.setText("Bar one");
            ch5.setText("Uncle Chips");
        }
        else if(test.equals("Chinese") && msgshow.equals("kemcho"))
        {
            ch1.setText("Lays");
            ch2.setText("Tostitos");
            ch3.setText("Salsa Sauce");
            ch4.setText("Dangar");
            ch5.setText("Sweet");
        }
        else if(test.equals("Chinese") && msgshow.equals("kimchi"))
        {
            ch1.setText("Gilab jamun");
            ch2.setText("Ras Malai");
            ch3.setText("Noodless");
            ch4.setText("Lasagne");
            ch5.setText("Milkybar");
        }
        else if(test.equals("Chinese") && msgshow.equals("chikfood"))
        {
            ch1.setText("Spongy rasgule");
            ch2.setText("Milkcake");
            ch3.setText("LAddu");
            ch4.setText("Kaju Katari");
            ch5.setText("Barfi");
        }
        else if(test.equals("Indian") && msgshow.equals("yumyfood"))
        {
            ch1.setText("Yummy corner");
            ch2.setText("Rice");
            ch3.setText("Soya Champ");
            ch4.setText("Tandoori Champ");
            ch5.setText("Channe Bhature");
        }
        else if(test.equals("Indian") && msgshow.equals("desifood"))
        {
            ch1.setText("Dhokla");
            ch2.setText("Fafda");
            ch3.setText("Jalebi");
            ch4.setText("Boondi");
            ch5.setText("Dosa");
        }
        else if(test.equals("Indian") && msgshow.equals("ricefoody"))
        {
            ch1.setText("Vadda");
            ch2.setText("Sambar");
            ch3.setText("PAv bhaji");
            ch4.setText("Noodles");
            ch5.setText("Spring Roll");
        }
        else if(test.equals("Indian") && msgshow.equals("danipani"))
        {
            ch1.setText("Momos");
            ch2.setText("Chat");
            ch3.setText("Golgappe");
            ch4.setText("Bhelpuri");
            ch5.setText("Burger");
        }
        else if(test.equals("Indian") && msgshow.equals("rotikhao"))
        {
            ch1.setText("Steam Momos");
            ch2.setText("Fried Rice");
            ch3.setText("Cold Drink");
            ch4.setText("Corn Flakes");
            ch5.setText("Dry daal");
        }
    }

    public void checkout(View view)
    {
        if(ch1.isChecked())
        {
            msg+=" "+ch1.getText();
        }
        if(ch2.isChecked())
        {
            msg+=" "+ch2.getText();
        }
        if(ch3.isChecked())
        {
            msg+=" "+ch3.getText();
        }
        if(ch4.isChecked())
        {
            msg+=" "+ch4.getText();
        }
        Intent it = getIntent();
        String mess = it.getStringExtra(message);
        String mess1 = it.getStringExtra(msg1);
        Intent itCheck = new Intent(this, CheckOutActivity.class);
        Bundle extras = new Bundle();
        extras.putString(message,mess);
        extras.putString(msg1,mess1);
        extras.putString(msg2,msg);
        itCheck.putExtras(extras);
        startActivity(itCheck);
    }
}
