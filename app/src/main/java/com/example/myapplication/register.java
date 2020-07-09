package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class register extends AppCompatActivity {
private Button reg,lgn;
    
    RadioGroup rgp1;
    TextView rpg, fnm, lnm, cb, rb;
    EditText edt1, edt2;
    RadioButton rb1, rb2, selectrb;
    CheckBox cb1, cb2, cb3;
    Button btn,lgt,drk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        btn = findViewById(R.id.btn);
        edt1 = findViewById(R.id.edt1);
        edt2 = findViewById(R.id.edt2);
        fnm = findViewById(R.id.fnm);
        rpg = findViewById(R.id.rpg);
        lnm = findViewById(R.id.lnm);
        lgt=findViewById(R.id.lgt);
        drk=findViewById(R.id.drk);
        cb = findViewById(R.id.cb);
        rb = findViewById(R.id.rb);
        RadioGroup rgp1 = findViewById(R.id.crs);
        rgp1.clearCheck();
        rb1 = findViewById(R.id.rb1);
        rb2 = findViewById(R.id.rb2);

        Boolean rbc2 = rb2.isChecked();
        final CheckBox cb1 = findViewById(R.id.cb1);
        Boolean CheckBoxState = cb1.isChecked();
        final CheckBox cb2 = findViewById(R.id.cb2);
        Boolean CheckBoxState2 = cb2.isChecked();

        final CheckBox cb3 = findViewById(R.id.cb3);
        Boolean CheckBoxState3 = cb3.isChecked();

     reg=(Button) findViewById(R.id.reg_btn);
     reg.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             openDetails();
         }
     });

     lgn=(Button) findViewById(R.id.lgn_btn);
     lgn.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             openLogin();
         }
     });
    }

    private void openLogin() {
        Intent intent=new Intent(this,login.class);
        startActivity(intent);
    }

    private void openDetails() {
        Intent intent=new Intent(this,reg_details.class);
        startActivity(intent);
    }

    public void btnlightmode(View view) {
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        startActivity(new Intent(getApplicationContext(),register.class));
        finish();
    }

    public void btnDarkMode(View view) {
    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);

        startActivity(new Intent(getApplicationContext(),register.class));
        finish();
    }
   
}
























































































































































































































































































































































































































