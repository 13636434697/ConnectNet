package com.xu.connectnet;

import android.app.Activity;
import android.preference.PreferenceActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.xu.connectnet.api.NetWorkApi;
import org.apache.http.Header;
import com.loopj.android.http.AsyncHttpResponseHandler;
public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = (TextView) findViewById(R.id.tv);
    }

    public void getData(View view){
        // 请求网络
        int catalog = 1;
        int page = 0;
        // 调用框架的方法
        //具体界面请求的时候，拿这个具体逻辑层，调用具体逻辑方法
        NetWorkApi.getNewsList(catalog, page, mHandler);


    }
    private AsyncHttpResponseHandler mHandler = new AsyncHttpResponseHandler() {

        @Override
        public void onSuccess(int statusCode, cz.msebera.android.httpclient.Header[] headers, byte[] responseBody) {
            tv.setText(new String());
        }

        @Override
        public void onFailure(int statusCode, cz.msebera.android.httpclient.Header[] headers, byte[] responseBody, Throwable error) {

        }
    };
    private TextView tv;
}