package com.jadyer.demo.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

//绑定该接口到CalculatorServer服务，并通知Feign组件对该接口进行代理（不需要编写接口实现）
@FeignClient(value="Server")
interface CalculatorService {
    //int myadd(@PathVariable("a") int a, @RequestParam("b") int b);

    //通过SpringMVC的注解来配置所绑定的服务下的具体实现
    @RequestMapping(value="/add", method=RequestMethod.GET)
    int myadd(@RequestParam("a") int a, @RequestParam("b") int b);
}