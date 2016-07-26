package com.example.wenjian;

import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.format.Formatter;
import android.util.Log;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //获得内存卡路径
        //自行测试用例
        Log.i(TAG, "onCreate: Environment.getDataDirectory().getPath();" + Environment.getDataDirectory().getPath());
        Log.i(TAG, "onCreate: Environment.getDownloadCacheDirectory().getPath()" + Environment.getDownloadCacheDirectory().getPath());
        Log.i(TAG, "onCreate: Environment.getRootDirectory()" + Environment.getRootDirectory());
        //获得外部存储的路径
        Log.i(TAG, "onCreate: Environment.getExternalStorageDirectory().getPath()" + Environment.getExternalStorageDirectory().getPath());
        //判断外部储存卡是否可用
        Log.i(TAG, "onCreate: " + Environment.getExternalStorageState() );
        Log.i(TAG, "onCreate: "+ Environment.MEDIA_MOUNTED);
        File file = new File(Environment.getExternalStorageDirectory().getPath(), "hello.txt");
        try {
            FileOutputStream fil = new FileOutputStream(file);
            fil.write("hello".getBytes());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //获得sd卡的剩余空间
        long sdu = Environment.getExternalStorageDirectory().getUsableSpace();
        //安卓转换文件大小表达的方法,将一个long类型的文件大小转化成常见的表示方式
        String wenjianchangdu = Formatter.formatFileSize(this, sdu);
        Log.i(TAG, "onCreate: sd卡的剩余空间" + sdu + "转换后的大小" + wenjianchangdu);

        //获得sd卡的总空间大小
        long adt = Environment.getExternalStorageDirectory().getTotalSpace();
        String zongkongjian = Formatter.formatFileSize(this, adt);
        Log.i(TAG, "onCreate: sd卡总空间" + adt + "常见表示方式" + zongkongjian);

        //获得私有内存路径
        Log.i(TAG, "onCreate:  this.getCacheDir().getPath()" +  this.getCacheDir().getPath());
        Log.i(TAG, "onCreate: this.getFilesDir().getPath()" + this.getFilesDir().getPath());
        Log.i(TAG, "onCreate: this.getFilesDir()data目录大小" + Formatter.formatFileSize(this,this.getFilesDir().getTotalSpace()));
        Log.i(TAG, "onCreate: this.getFilesDir()data目录剩余大小" + Formatter.formatFileSize(this,this.getFilesDir().getUsableSpace()));

    }
}
