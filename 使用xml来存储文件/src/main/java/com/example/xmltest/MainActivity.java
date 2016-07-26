package com.example.xmltest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Xml;

import org.xmlpull.v1.XmlSerializer;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        hello();
        try {
            //使用xml来序列化文件
            //1.通过Xml获取一个XmlSerializer对象
            XmlSerializer xmlSerializer = Xml.newSerializer();
            //2.设置XmlSerializer的一些参数，比如：设置xml写入到哪个文件中
            //os:xml文件写入流   encoding：流的编码
            xmlSerializer.setOutput(this.openFileOutput("xmlTest", this.MODE_PRIVATE), "utf-8");
            //3.序列化一个xml的声明头
            //encoding:xml文件的编码  standalone:是否独立
            xmlSerializer.startDocument("utf-8",true);
            //4.序列化一个根节点的开始节点
            //namespace:命名空间  name： 标签的名称
            xmlSerializer.startTag(null, "Smss");
            //5.循环遍历list集合序列化一条条短信

            for (int i = 0 ; i < 3 ; i++ ) {
                xmlSerializer.startTag(null, "Sms");
                //name:属性的名称  value：属性值
                xmlSerializer.attribute(null, "id", String.valueOf(i));

                xmlSerializer.startTag(null, "num");
                //写一个标签的内容
                xmlSerializer.text("我是第一个标签的内容");
                xmlSerializer.endTag(null, "num");


                xmlSerializer.startTag(null, "msg");
                xmlSerializer.text("我是第二个标签的内容");
                xmlSerializer.endTag(null, "msg");
                         xmlSerializer.startTag(null, "date");
                xmlSerializer.text("我是第三个标签的内容");
                xmlSerializer.endTag(null, "date");

                xmlSerializer.endTag(null, "Sms");
            }

            //6.序列化一个根节点的结束节点
            xmlSerializer.endTag(null, "Smss");
            //7.将xml写入到文件中，完成xml的序列化
            xmlSerializer.endDocument();

          //xml的pull解析
            //1.通过Xml获取一个XmlPullParser对象

            //2.设置XmlPullParser对象的参数，需要解析的是哪个xml文件,设置一个文件读取流

            //通过context获取一个资产管理者对象

            //通过资产管理者对象能获取一个文件读取流


            //3.获取当前xml行的事件类型

            //4.判断事件类型是否是文档结束的事件类型

                //5.如果不是，循环遍历解析每一行的数据。解析一行后，获取下一行的事件类型


                //判断当前行的事件类型是开始标签还是结束标签


                //获取下一行的事件类型


        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    void hello(){

    }
}
