package com.sda.discountticketsystem.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by Allen on 2017/8/23.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Flight {
    private String FlightNo;//航班号
    private String FlightCompany;//航空公司名称
    private String FlightDepcode;//出发地三字码
    private String FlightArrcode;//目的地三字码
    private String FlightDeptimePlanDate;//计划出发时间
    private String FlightArrtimePlanDate;//计划到达时间
}
