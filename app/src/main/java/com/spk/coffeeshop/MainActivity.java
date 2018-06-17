package com.spk.coffeeshop;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn;
    TextView obj;
    EditText objj,objjj,objjjj;
    RadioButton bttn,bttnn;
    RadioGroup rgrp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        obj=(TextView) findViewById(R.id.text1);//casting
        objj=(EditText) findViewById(R.id.editText2);//casting
        objjj=(EditText) findViewById(R.id.editText3);//casting
        objjjj=(EditText) findViewById(R.id.editText4);//casting
        rgrp=(RadioGroup) findViewById(R.id.rg1);//casting
        bttn=(RadioButton) findViewById(R.id.radioButton);//casting
        bttnn=(RadioButton) findViewById(R.id.radioButton2);//casting
        btn=(Button) findViewById(R.id.button);//casting
        btn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                String name = String.valueOf(objj.getText());
                int quantity = Integer.parseInt(objjj.getText().toString());
                int Totalprice = 0;
                if (bttn.isChecked()) {
                    Totalprice = quantity * 10;
                }
                    else
                    {
                        Totalprice= quantity*15;
                    }
                Toast.makeText(getApplicationContext(),"hello"+name +"your order price is:" +Totalprice,Toast.LENGTH_LONG).show();


            }
        });


    }
}
