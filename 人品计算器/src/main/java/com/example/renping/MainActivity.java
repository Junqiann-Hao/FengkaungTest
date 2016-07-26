package com.example.renping;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText ed_name;
    RadioGroup rg_group;
    Button bt_jisuan;
    private static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed_name = (EditText) findViewById(R.id.ed_name);
        rg_group = (RadioGroup) findViewById(R.id.rg_group);
        bt_jisuan = (Button) findViewById(R.id.bt_jisuan);

        bt_jisuan.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        String name = ed_name.getText().toString().trim();
        if (TextUtils.isEmpty(name)) {
            Toast.makeText(MainActivity.this, "请输入名字", Toast.LENGTH_SHORT).show();
            return;
        }

        int checkedRadioButtonId = rg_group.getCheckedRadioButtonId();
        int code = 0;

        switch(checkedRadioButtonId){
            case R.id.rb_nan:
                code = 1;
                Log.i(TAG, "onClick: 选择的男");
                break;
            case R.id.rb_nv:
                Log.i(TAG, "onClick: 选择的女");
                code = 2;
                break;
        }

        if (code == 0) {
            Toast.makeText(MainActivity.this, "请选择性别", Toast.LENGTH_SHORT).show();
            return;
        }
        Intent intent = new Intent(this,ShowActivity.class);

        intent.putExtra("name", name);
        intent.putExtra("sex", code);

        startActivity(intent);
    }
}
