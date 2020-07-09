package com.example.myapplication;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentResolver;
import android.database.Cursor;
import android.os.Build;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class fill_contacts extends AppCompatActivity {
private Button loadContacts;
private TextView contactList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fill_contacts);
        contactList=(TextView)findViewById(R.id.contact_list);
        loadContacts=(Button)findViewById(R.id.load_contact);
        loadContacts.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.O)
            @Override
            public void onClick(View v) {
                loadContacts();
            }
        });
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    private void loadContacts() {
        StringBuilder builder = new StringBuilder();
        ContentResolver contentResolver = getContentResolver();
        Cursor cursor = contentResolver.query(ContactsContract.Contacts.CONTENT_URI, null, null, null);

        if (cursor.getCount() > 0) {
            while (cursor.moveToNext()) {


            String id = cursor.getString(cursor.getColumnIndex(ContactsContract.Contacts._ID));
            String name = cursor.getString(cursor.getColumnIndex(ContactsContract.Contacts.DISPLAY_NAME));
            int phoneNumber = Integer.parseInt(cursor.getString(cursor.getColumnIndex(ContactsContract.Contacts.HAS_PHONE_NUMBER)));

            if (phoneNumber > 0) {
                Cursor cursor2 = contentResolver.query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, null, ContactsContract.CommonDataKinds.Phone.CONTACT_ID + "=?", new String[]{id}, null);
                while (cursor2.moveToNext()) {
                    String phoneNo = cursor2.getString(cursor2.getColumnIndex(ContactsContract.CommonDataKinds.Phone.NUMBER));
                    builder.append("Contact:").append(name).append(",Phone Number:").append(phoneNo).append("");
                }
                cursor2.close();
            }
        }
    }
            cursor.close();
            contactList.setText(builder.toString());

    }
}