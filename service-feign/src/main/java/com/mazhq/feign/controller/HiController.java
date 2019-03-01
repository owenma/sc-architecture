package com.mazhq.feign.controller;

import com.mazhq.feign.service.IScheduleServiceHi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author mazhq
 * @Title: HiController
 * @ProjectName: zeus
 * @Description: TODO
 * @date 2019/2/28 16:27
 */
@RestController
public class HiController {


    //编译器报错，无视。 因为这个Bean是在程序启动的时候注入的，编译器感知不到，所以报错。
    @Autowired
    IScheduleServiceHi iScheduleServiceHi;

    @GetMapping(value = "/hi")
    public String sayHi(@RequestParam String name) {
        return iScheduleServiceHi.sayHiFromClientOne( name );
    }
}