package com.data.manager.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wqkenqing
 * @emai wqkenqingto@163.com
 * @time 2020/2/7
 * @desc
 */
@RestController
@RequestMapping("/manager")
public class ManagerController {
    @RequestMapping("/hello")
    public String sayHell() {
        return "hello";
    }

}
