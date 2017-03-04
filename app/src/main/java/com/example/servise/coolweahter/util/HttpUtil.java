package com.example.servise.coolweahter.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by hasee on 2017/2/13.
 */

public class HttpUtil {
    public  static void sendOKhttpRequest(String address,okhttp3.Callback callback)
    {
        //和服务器之间交互
        OkHttpClient client = new OkHttpClient();
        Request request =  new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
