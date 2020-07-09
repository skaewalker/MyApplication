package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Button;

public class show extends AppCompatActivity {
  TextView rpg,fnm,lnm,cb,rb;
    EditText edt1,edt2;
    RadioButton rb1,rb2;
    CheckBox cb1,cb2,cb3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);
        EditText edt1=findViewById(R.id.edt1);
        EditText edt2=findViewById(R.id.edt2);
        TextView fnm=findViewById(R.id.fnm);
        TextView rpg=findViewById(R.id.rpg);
        TextView lnm=findViewById(R.id.lnm);
        TextView cb=findViewById(R.id.cb);
        TextView rb=findViewById(R.id.rb);
        RadioButton rb1=findViewById(R.id.rb1);
        RadioButton rb2=findViewById(R.id.rb2);
        CheckBox cb1=findViewById(R.id.cb1);
        CheckBox cb2=findViewById(R.id.cb2);
        CheckBox cb3=findViewById(R.id.cb3);
        Toast.makeText(this, "PLEASE REGISTER", Toast.LENGTH_SHORT).show();

    }
}
