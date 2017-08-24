package com.sda.discountticketsystem.controller;

import com.sda.discountticketsystem.service.FlightService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.io.UnsupportedEncodingException;

/**
 * Created by Allen on 2017/8/23.
 */
@Controller
@Slf4j
public class FlightController {

    @Autowired
    FlightService flightService;

    @GetMapping("/")
    public String flight(String date,String dep, String arr) throws UnsupportedEncodingException {
        flightService.getFlights(date,dep,arr);
        return "flight";
    }


}
