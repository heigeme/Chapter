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
     * 错误用法01 打印方式不对
     * @return
     */
    @RequestMapping(value = "error1")
    public String error1(){
        String result = "文科生说Java";
        System.out.println("错误用法01 欢迎来到:------------ " + result);
        return "SUCESS";
    }

    /**
     * 错误用法02 日志级别调用不对
     * @return
     */
    @RequestMapping(value = "error2")
    public String error2(){
        String result = "文科生说Java";
        log.trace("错误用法02 trace 欢迎来到:------------ " + result);
        log.debug("错误用法03 debug 欢迎来到:------------ " + result);
        return "SUCESS";
    }

    /**
     * 错误用法03,catch 错误用法
     * @return
     */
    @RequestMapping(value = "error3")
    public String error3(){
        try{
            int a = 1;
            int b = 0;
            int i = a / b;
        }catch (Exception e){
            e.printStackTrace();
        }
        return "SUCESS";
    }

    /**
     * 错误用法04,没能打印完整的错误信息
     * @return
     */
    @RequestMapping(value = "error4")
    public String error4(){
        try{
            int a = 1;
            int b = 0;
            int i = a / b;
        }catch (Exception e){
            log.error(e.getMessage());
        }
        return "SUCESS";
    }

    /**
     * 错误用法05,打印写法导致性能问题
     * @return
     */
    @RequestMapping(value = "error5")
    public String error5(){
        int a = 1;
        int b = 2;
        log.info("错误用法05: 关键变量:" + a + " 关键变量:" + b);
        return "SUCESS";
    }

    /**
     * 正确用法01,解决打印方法调用不对,和调用级别的问题
     * @return
     */
    @RequestMapping(value = "correct1")
    public String correct1(){
        String result = "文科生说Java";
        log.info("正确用法01 info 欢迎来到:------------ {}",result);
        log.error("正确用法01 error 欢迎来到:------------ {}",result);
        return "SUCESS";
    }

    /**
     * 正确用法02,解决打印不全的问题
     * @return
     */
    @RequestMapping(value = "correct2")
    public String correct2(){
        try{
            int a = 1;
            int b = 0;
            int i = a / b;
        }catch (Exception e){
            log.error(e.getMessage(),e);
        }
        return "SUCESS";
    }

    /**
     * 正确用法03,解决打印性能的问题
     * @return
     */
    @RequestMapping(value = "correct3")
    public String correct3(){
        int a = 1;
        int b = 2;
        log.info("正确用法03: 关键变量:{} 关键变量:{}", a, b);
        return "SUCESS";
    }
}
