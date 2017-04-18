package com.xu.connectnet.api;

import com.loopj.android.http.AsyncHttpResponseHandler;
import com.loopj.android.http.RequestParams;

public class NetWorkApi {

	/**请求网络数据, 
	 * @param catalog 分类
	 * @param page 请求的页面索引
	 * @param mHandler 用于接受请求结果
	 *
	 * 这里是http应用层的封装
	 */
	public static void getNewsList(int catalog, int page,AsyncHttpResponseHandler mHandler) {
		RequestParams params = new RequestParams();
        String path = "";
        switch (catalog) {
		case 1:
			path = "oschina/list/news/page"+page+".xml";
			break;
		case 4:
			path = "oschina/list/hotspot/page"+page+".xml";
			break;
		}

        ApiHttpClient.getLocal(path, params, mHandler);
	}

}
