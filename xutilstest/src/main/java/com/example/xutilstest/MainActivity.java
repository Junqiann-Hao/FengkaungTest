package com.example.xutilstest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

import com.lidroid.xutils.HttpUtils;
import com.lidroid.xutils.exception.HttpException;
import com.lidroid.xutils.http.RequestParams;
import com.lidroid.xutils.http.ResponseInfo;
import com.lidroid.xutils.http.callback.RequestCallBack;
import com.lidroid.xutils.http.client.HttpRequest;

public class MainActivity extends AppCompatActivity {
    private static final String URL = "http://123.206.95.245/huabei/App/test.php";
    private static final String TAG = "MainActivity";
    private TextView textview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        soujihaoyanzheng("123456");
        textview = (TextView) findViewById(R.id.textView);
    }
    /**
     * 发起网络请求验证手机号
     * @param phone 需要验证的手机号
     */
    private void soujihaoyanzheng(String phone) {
        RequestParams params = new RequestParams();
        params.addBodyParameter("phone",phone);
        HttpUtils httpUtils = new HttpUtils();
        httpUtils.send(HttpRequest.HttpMethod.POST, URL, params, new RequestCallBack<String>() {
            //开始发送网络请求
            @Override
            public void onStart() {
                Log.i(TAG, "onStart: ");
            }
            /*更新任务进度
            total - 读取数据总大小（byte）
            current - 当前读取数据大小（byte）
            isUploading - 是否上传操作*/
            @Override
            public void onLoading(long total, long current, boolean isUploading) {
                Log.i(TAG, "onLoading: total->"+total+"current->"+current+"isUploading->"+isUploading);
            }
            //网络请求执行成功
            @Override
            public void onSuccess(ResponseInfo<String> responseInfo) {
                Log.i(TAG, "onSuccess: "+responseInfo.result);
                textview.setText("CONTENT-ENCODING头信息->" + responseInfo.contentEncoding+"\n响应内容的长度->" + responseInfo.contentLength
                +"\nCONTENT-TYPE头信息->" + responseInfo.contentType+"\n语言信息->"+responseInfo.locale+
                "\n协议版本->" + responseInfo.protocolVersion+"\n状态行的原因短语->"+responseInfo.reasonPhrase
                +"\n响应的数据内容->"+responseInfo.result+"\n响应的数据来源->"+responseInfo.resultFormCache
                +"\nHTTP响应状态码->"+responseInfo.statusCode);
            }
            /*网络请求执行失败
            参数:
            error - 网络请求异常HttpException
            msg - 异常信息描述*/
            @Override
            public void onFailure(HttpException error, String msg) {
                Log.i(TAG, "onFailure: ");
            }
        });
    }
}
