package com.example.chapter.demo;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;

public class Demo01 {
    private static final Logger log = LoggerFactory.getLogger(Demo01.class);

    /**
     * double 错误用法 01
     */
    @Test
    void error01(){
        double number1 = 10.2;
        double number2 = 300.03;
        double result = number1 + number2;
//        System.out.println("错误用法01:------------ " + result);
        log.info("错误用法01:------------ {}",result);
    }

    /**
     * double 错误用法 02
     */
    @Test
    void error02(){
        double number1 = 10.2;
        double number2 = 300.03;

        BigDecimal bigDecimal1 = new BigDecimal(number1);
        BigDecimal bigDecimal2 = new BigDecimal(number2);
        BigDecimal result = bigDecimal1.add(bigDecimal2);

        log.info("错用用法02:------------ {}",result);
    }

    /**
     * double 正确用法 01
     */
    @Test
    void correct01(){
        double number1 = 10.2;
        double number2 = 300.03;

        BigDecimal bigDecimal1 = new BigDecimal(String.valueOf(number1));
        BigDecimal bigDecimal2 = new BigDecimal(String.valueOf(number2));
        BigDecimal result = bigDecimal1.add(bigDecimal2);

        log.info("正确用法01:------------ {}",result);
    }

    /**
     * double 正确用法 02 jdk推荐使用
     */
    @Test
    void correct02(){
        double number1 = 10.2;
        double number2 = 300.03;

        BigDecimal bigDecimal1 = BigDecimal.valueOf(number1);
        BigDecimal bigDecimal2 = BigDecimal.valueOf(number2);
        BigDecimal result = bigDecimal1.add(bigDecimal2);

        log.info("正确用法02,jdk推荐使用:------------ {}",result);
    }
}
