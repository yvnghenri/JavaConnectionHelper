package me.henri.util;

import javax.net.ssl.HttpsURLConnection;
import java.io.IOException;
import java.net.URL;

/**
 * @author yvnghenri#4191
 * @created 9/10/2022 | 9:51 PM
 * Copyright (c) 2022 | yvnghenri#4191
 */

public class ConnectionHelper {

    //variable to store url in
    private String url;
    //variable to store http response status code in
    private int statusCode;

    //constructor that receives arguments
    public ConnectionHelper(String url){
        this.url = url;
    }

    //connect to url and get http response status code
    public void getStatus(){
        try{
            HttpsURLConnection connection = (HttpsURLConnection) new URL(url).openConnection();
            connection.setRequestMethod("HEAD");
            statusCode = connection.getResponseCode();
            connection.disconnect();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String printStatus(){
        //if http response status code does not equal 200 -> connecting failed
        if(statusCode != 200){
            return "A: Bad request...";
        }
        //if http response status code does equal 200 -> successful request
        else{
            return "A: Successful request.";
        }
    }
}
