package com.example.myapplication;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.service.chooser.ChooserTargetService;
import android.telephony.SmsManager;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class msg_sender extends AppCompatActivity {
    final int SEND_PERM = 1;
    private Button send;
    EditText ext1, ext2;
    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_msg_sender);

        //EditText ext1=findViewById(R.id.etx1);
        //EditText ext2=findViewById(R.id.etx2);
        //TextView head=findViewById(R.id.head);
        /*send=(Button) findViewById(R.id.snd_btn);
        send.setEnabled(false);/
        if (checkPermission(Manifest.permission.SEND_SMS)){
            send.setEnabled(true);}
        else{
            ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.SEND_SMS},SEND_PERM);
        }
    }
    public void onSend(View view) {
        Intent intent= new Intent(Intent.ACTION_VIEW, Uri.parse("smsto:"));
        String phoneNumber=ext1.getText().toString();
        String Message=ext2.getText().toString();
            if(phoneNumber==null||phoneNumber.length()==0){
            return;
        }
        if(checkPermission(Manifest.permission.SEND_SMS)){
            SmsManager smsManager=SmsManager.getDefault();
            smsManager.sendTextMessage(phoneNumber,null,Message,null,null);
            Toast.makeText(this, "MESSAGE SENT!", Toast.LENGTH_SHORT).show();
        }
    }

    private boolean checkPermission(String sendSms) {
        int check=ContextCompat.checkSelfPermission(this,sendSms);
        return(check==PackageManager.PERMISSION_GRANTED);
    }*/
    }
}