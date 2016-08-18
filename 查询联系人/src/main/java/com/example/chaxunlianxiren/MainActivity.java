package com.example.chaxunlianxiren;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Contact> queryContacts = QueryContactsUtils.queryContacts(getApplicationContext());
        for (Contact contact : queryContacts) {
            Log.i(TAG, "onCreate: " + contact);

        }
    }
}
