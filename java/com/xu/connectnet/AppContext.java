package com.xu.connectnet;


import com.loopj.android.http.AsyncHttpClient;
import com.xu.connectnet.api.ApiHttpClient;

import android.app.Application;

/*
* 这是模仿的应用程序
* */
public class AppContext extends Application {

	@Override
	public void onCreate() {
		super.onCreate();
		
		init();
	}

	private void init() {
		//在应用程序初始化的时候
		AsyncHttpClient asyncHttpClient = new AsyncHttpClient();
		//还是set方法，传进来参数，用静态的变量来接收一下
		ApiHttpClient.setHttpClient(asyncHttpClient);
	}
	
}
