package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Message;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class login<Mobile> extends AppCompatActivity {
    EditText pnm, pps;
    Button btn, dial;
    TextView tnm, tps, txt1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        EditText pnm = findViewById(R.id.pnm);
        EditText pps = findViewById(R.id.pps);
        Button btn = findViewById(R.id.btn);
        TextView tnm = findViewById(R.id.tnm);
        TextView tps = findViewById(R.id.tps);
        TextView txt1 = findViewById(R.id.txt1);
        dial = findViewById(R.id.dial);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(login.this, "Welcome to login page", Toast.LENGTH_SHORT).show();

            }
        });
}



    public void onDial(View view) {
        Intent intent = new Intent(Intent.ACTION_CALL);
        intent.setData(Uri.parse("tel:7656054300"));
        if (Build.VERSION.SDK_INT>22){


             if (ActivityCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
           ActivityCompat.requestPermissions(login.this,new String[]{Manifest.permission.CALL_PHONE},101);
            return;
        }
        startActivity(intent);
    }}


    public void onText(View view) {
        Intent intent=new Intent(this,msg_sender.class);
        startActivity(intent);
    }
}