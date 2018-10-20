package com.csh.webDataGet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class PageTools {

    public static String getPageAsStringByUrl(String urlPath) {
        //TODO 传入url字符串，以字符串的方式返回整个页面的html代码
        String result = "";
        try {
            URL url = new URL("http://www.baidu.com");
            System.out.println("Create URL Success" + "\nURL:" + urlPath);
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            System.out.println("Open Connection Success");
            if (HttpURLConnection.HTTP_OK == httpURLConnection.getResponseCode()) {
                InputStreamReader isr = new InputStreamReader(httpURLConnection.getInputStream(), "UTF-8");
                BufferedReader br = new BufferedReader(isr);
                StringBuilder lines = new StringBuilder();
                String line = "";
                while ((line = br.readLine()) != null) {
                    lines.append(line + "\n");
                }
                result = lines.toString();
                br.close();
                isr.close();
            }
        } catch (MalformedURLException e) {
            System.out.println("Create URL Failed");
        } catch (IOException e) {
            System.out.println("Open Connection Failed");
        }
        return result;
    }

    public static List<String> getUrls(String page, String... regexs){
        //TODO 获取页面中的url，如果传入regexs则返回符合正则表达式的url
        List<String> results = new ArrayList<String>();
        if (regexs.length>0){

        }else {

        }
        return results;
    }



}
