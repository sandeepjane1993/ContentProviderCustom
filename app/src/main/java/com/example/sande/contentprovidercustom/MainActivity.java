package com.example.sande.contentprovidercustom;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tv;
    Uri uri;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = findViewById(R.id.textView);

        uri = Uri.parse("content://com.sandeep.authorities.code/Employee");

        ContentResolver resolver = getContentResolver();
        ContentValues values = new ContentValues();
        values.put(DataContract.FeedEntry.EMP_NAME,"Yixxin");
        values.put(DataContract.FeedEntry.EMP_AGE,"23");
        values.put(DataContract.FeedEntry.EMP_EMAIL,"gmail");
        resolver.insert(uri,values);
        Cursor cursor = resolver.query(uri,null,null,
                null,null,null);
        cursor.moveToLast();
        String name = cursor.getString(1);
        String age = cursor.getString(2);
        String email = cursor.getString(3);
        tv.setText(name + "\n" + age + "\n" + email);



    }
}
