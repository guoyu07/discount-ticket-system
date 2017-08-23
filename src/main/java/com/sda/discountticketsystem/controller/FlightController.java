package com.sda.discountticketsystem.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by Allen on 2017/8/23.
 */
@Controller
@Slf4j
public class FlightController {

    @GetMapping("/")
    public String flight(){
        return "flight";
    }


}
