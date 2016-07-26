package com.example.luyinji;

import android.media.MediaRecorder;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.io.IOException;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button zhunbei;
    Button kaishi;
    Button tingzhi;
    MediaRecorder recorder;
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        zhunbei = (Button) findViewById(R.id.zhunbei);
        kaishi = (Button) findViewById(R.id.kaishi);
        tingzhi = (Button) findViewById(R.id.tingzhi);

        zhunbei.setOnClickListener(this);
        kaishi.setOnClickListener(this);
        tingzhi.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.zhunbei:
                Log.i(TAG, "onClick: 开始准备录音机");
                //[1]获取MediaRecorder类的实例
                recorder = new MediaRecorder();
                //[2]设置音频的来源
                recorder.setAudioSource(MediaRecorder.AudioSource.MIC); //zet
                //[3]设置音频的输出格式
                recorder.setOutputFormat(MediaRecorder.OutputFormat.THREE_GPP);
                //[4]设置音频的编码方式
                recorder.setAudioEncoder(MediaRecorder.AudioEncoder.AMR_NB);
                //[5]保存的文件路径
                String path = Environment.getExternalStorageDirectory().getPath();
                Calendar cal = Calendar.getInstance();
                String day = ""+cal.get(Calendar.YEAR) + cal.get(Calendar.MONTH) + cal.get(Calendar.DATE) + cal.get(Calendar.HOUR_OF_DAY) + cal.get(Calendar.MINUTE) + cal.get(Calendar.SECOND);
                String data = path + "/" + day + ".3gp";
                Log.i(TAG, "onCallStateChanged: 文件路径" +data);
                recorder.setOutputFile(data);
                //[5]准备录音
                try {
                    recorder.prepare();
                    Log.i(TAG, "onClick: 录音机准备完成");
                } catch (IllegalStateException | IOException e) {
                    e.printStackTrace();
                }

                break;
            case R.id.kaishi:
                Log.i(TAG, "onClick: 录音机开始录音");
                recorder.start();
                break;

            case R.id.tingzhi:
                recorder.stop();
                recorder.release();
                Log.i(TAG, "onClick: 录音机停止录音");
                break;
        }


    }
}
