package com.example.chapter.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 第3节- try catch finally 顺序问题
 */
@RestController
@RequestMapping(value = "chapter3")
public class Chapter3 {

    private static final Logger log = LoggerFactory.getLogger(Chapter3.class);

    /**
     *  没有 return 没有异常 情况下的代码执行顺序
     * @return
     */
    @RequestMapping(value = "test1")
    public String test1(){
        String result = "文科生说Java欢迎您!";
        try{
            log.info("{} 我是 try 我执行了",result);
        }catch (Exception e){
            log.info("{} 我是 catch 我执行了",result);
        }finally {
            log.info("{} 我是 finally 我执行了",result);
        }
        log.info("{} 我是 程序末尾 我执行了",result);
        return result;
    }

    /**
     *  没有 return 有异常 情况下的代码执行顺序
     * @return
     */
    @RequestMapping(value = "test2")
    public String test2(){
        String result = "文科生说Java欢迎您!";
        try{
            System.out.println(1/0);
            log.info("{} 我是 try 我执行了",result);
        }catch (Exception e){
            log.info("{} 我是 catch 我执行了",result);
        }finally {
            log.info("{} 我是 finally 我执行了",result);
        }
        log.info("{} 我是 程序末尾 我执行了",result);
        return result;
    }

    /**
     *  有 return 没有异常 情况下的代码执行顺序
     * @return
     */
    @RequestMapping(value = "test3")
    public String test3(){
        String result = "文科生说Java欢迎您!";
        try{
            log.info("{} 我是 try 我执行了",result);
            return result + " 我是 try 返回";
        }catch (Exception e){
            log.info("{} 我是 catch 我执行了",result);
        }finally {
            log.info("{} 我是 finally 我执行了",result);
        }
        log.info("{} 我是 程序末尾 我执行了",result);
        return result;
    }

    /**
     *  有 return 没有异常 情况下的代码执行顺序
     * @return
     */
    @RequestMapping(value = "test4")
    public String test4(){
        String result = "文科生说Java欢迎您!";
        try{
            log.info("{} 我是 try 我执行了",result);
            return result + " 我是 try 返回";
        }catch (Exception e){
            log.info("{} 我是 catch 我执行了",result);
        }finally {
            log.info("{} 我是 finally 我执行了",result);
            return result + " 我是 finally 返回";
        }
    }

    /**
     *  有 return 有异常 情况下的代码执行顺序
     * @return
     */
    @RequestMapping(value = "test5")
    public String test5(){
        String result = "文科生说Java欢迎您!";
        try{
            System.out.println(1/0);
            log.info("{} 我是 try 我执行了",result);
            return result + " 我是 try 返回";
        }catch (Exception e){
            log.info("{} 我是 catch 我执行了",result);
            return result + " 我是 catch 返回";
        }finally {
            log.info("{} 我是 finally 我执行了",result);
            return result + " 我是 finally 返回";
        }
    }


}
