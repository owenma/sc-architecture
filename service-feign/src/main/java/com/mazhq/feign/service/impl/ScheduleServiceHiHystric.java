package com.mazhq.feign.service.impl;
import com.mazhq.feign.service.IScheduleServiceHi;
import org.springframework.stereotype.Component;


/**
 * @author mazhq
 * @Title: ScheduleServiceHystric
 * @ProjectName: zeus
 * @Description: TODO
 * @date 2019/2/28 16:36
 */
@Component
public class ScheduleServiceHiHystric implements IScheduleServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}
