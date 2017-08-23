package com.sda.discountticketsystem.framework.druid;

import com.alibaba.druid.support.http.WebStatFilter;

import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;

/**
 * Created by Allen on 2017/8/23.
 */
@WebFilter(filterName = "druidWebStatFilter",urlPatterns = "/*",
    initParams = {
        @WebInitParam(name = "exclusions", value = "*.js,*.gif,*.jpg,*.bmp,*.png,*.css,*.ico,/druid/*")
    })
public class DruidStatFilter extends WebStatFilter {
}
