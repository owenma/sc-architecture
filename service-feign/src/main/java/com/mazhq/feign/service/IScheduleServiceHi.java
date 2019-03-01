package com.mazhq.feign.service;

import com.mazhq.feign.service.impl.ScheduleServiceHiHystric;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author mazhq
 * @Title: ISchedualServiceHi
 * @ProjectName: zeus
 * @Description: TODO
 * @date 2019/2/28 16:26
 */
@FeignClient(value = "service-hi", fallback = ScheduleServiceHiHystric.class)
public interface IScheduleServiceHi {
    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value = "name") String name);
}