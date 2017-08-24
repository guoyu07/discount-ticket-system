package com.sda.discountticketsystem.config;


import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by Allen on 2017/8/24.
 */
@ConfigurationProperties(prefix = "feiYou")
public class FeiYouConfiguration {
    private String appid;
    private String appsecurity;

    public String getAppid() {
        return appid;
    }

    public void setAppid(String appid) {
        this.appid = appid;
    }

    public String getAppsecurity() {
        return appsecurity;
    }

    public void setAppsecurity(String appsecurity) {
        this.appsecurity = appsecurity;
    }
}
