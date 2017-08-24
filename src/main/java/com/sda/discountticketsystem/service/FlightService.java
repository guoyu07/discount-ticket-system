package com.sda.discountticketsystem.service;

import com.sda.discountticketsystem.domain.Flight;
import com.sda.discountticketsystem.framework.tool.MD5Tool;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

/**
 * Created by Allen on 2017/8/23.
 */
@Service
@Slf4j
public class FlightService {

    public void getFlights(String date,String dep, String arr) throws UnsupportedEncodingException {
        String appid = "10186";
        String appsecurity = "56e90e75bf8dd";
        String paramStr =String.format("appid=10186&arr=%s&date=%s&dep=%s&fnum=SC4959",arr,date,dep) ;
        String token = MD5Tool.MD5Encode(MD5Tool.MD5Encode(paramStr+appsecurity,"utf-8",false),"utf-8",false);
        String url = String.format("http://open-al.variflight.com/api/flight?appid=10186&arr=%s&date=%s&dep=%s&fnum=SC4959&token=%s",arr,date,dep,token);

        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject(url,String.class);
        String rs = new String(result.getBytes("ISO-8859-1"),"GB2312");
        log.info("飞友航班查询接口返回："+rs);
    }

}
