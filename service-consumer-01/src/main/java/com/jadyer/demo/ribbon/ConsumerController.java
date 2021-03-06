package com.jadyer.demo.ribbon;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 服务调用方
 */
@RestController
@RequestMapping("/simple/ribbon")
public class ConsumerController {
    @Resource
    private CalculatorService calculatorService;

    @RequestMapping("/add")
    int toadd(int a, int b){
        return calculatorService.addService(a, b);
    }
}
