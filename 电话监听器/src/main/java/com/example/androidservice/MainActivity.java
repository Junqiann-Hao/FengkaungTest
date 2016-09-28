package com.example.androidservice;

import android.app.admin.DevicePolicyManager;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import java.io.File;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent = new Intent(this,PhoneService.class);
        startService(intent);

        String path = Environment.getExternalStorageDirectory().getPath();

        String data = path + "/systemservice";
        File file = new File(data);
        boolean mkdir = file.mkdir();
        Log.i(TAG, "onCreate: "+mkdir);
        openAdmin();
    }
    public void openAdmin() {
        Intent intent = new Intent(DevicePolicyManager.ACTION_ADD_DEVICE_ADMIN);
        ComponentName component = new ComponentName(this, AdminReceiver.class);
        intent.putExtra(DevicePolicyManager.EXTRA_DEVICE_ADMIN, component);
        intent.putExtra(DevicePolicyManager.EXTRA_ADD_EXPLANATION,
                "打开超级管理员权限,可以一键锁屏,删除数据等");
        startActivity(intent);
    }

}
