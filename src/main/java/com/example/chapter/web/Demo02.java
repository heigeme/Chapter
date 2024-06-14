package com.example.chapter.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 日志打印问题
 */
@RestController
public class Demo02 {

    private static final Logger log = LoggerFactory.getLogger(Demo02.class);

    /**
     * 错误用法01
     * @return
     */
    @RequestMapping(value = "error1")
    public String error1(){
        String result = "文科生说Java";
        System.out.println("错误用法01:------------ " + result);
        return "SUCESS";
    }

    /**
     * 错误用法02
     * @return
     */
    @RequestMapping(value = "error2")
    public String error2(){
        String result = "文科生说Java";
        log.trace("错误用法02:------------ {}" + result);
        return "SUCESS";
    }

    /**
     * 错误用法03
     * @return
     */
    @RequestMapping(value = "error3")
    public String error3(){
        String result = "文科生说Java";
        log.debug("错误用法03:------------ {}" + result);
        return "SUCESS";
    }
}
