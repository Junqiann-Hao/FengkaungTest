package com.example.listview;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    Context mcontext = this;
    private static final String TAG = "MainActivity";
    private ArrayList<String> data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
        data = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            data.add("我是数据" + i);
        }
        listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(new Myadapter());
    }

    class Myadapter extends BaseAdapter {

        @Override
        public int getCount() {
            return data.size();
        }

        @Override
        public Object getItem(int position) {
            return data.get(position);
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            TextView textView = new TextView(mcontext);
            textView.setTextSize(30);
            textView.setText(data.get(position));
            return textView;
        }
    }
}
