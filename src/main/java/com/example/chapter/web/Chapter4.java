package com.example.chapter.web;

import com.example.chapter.entity.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * 第4节- try catch finally 执行值问题
 */
@RestController
@RequestMapping(value = "chapter4")
public class Chapter4 {

    private static final Logger log = LoggerFactory.getLogger(Chapter4.class);

    /**
     *  方法1 finally中没有return时,基本数据类型值的变化
     * @return
     */
    @RequestMapping(value = "test1")
    public int test1(){
        int result = 1;
        try{
            result ++;
            log.info("文科生说Java try中 result的值: {}", result);
            return result;
        }finally {
            result = 3;
            log.info("文科生说Java finally中 result的值: {}", result);
        }
    }

    /**
     *  方法2 finally中没有return时,String数据类型值的变化
     * @return
     */
    @RequestMapping(value = "test2")
    public String test2(){
        String result = "";
        try{
            result = "aa";
            log.info("文科生说Java try中 result的值: {}", result);
            return result;
        }finally {
            result = "bb";
            log.info("文科生说Java finally中 result的值: {}", result);
        }
    }

    /**
     *  方法3 finally中没有return时,对象数据类型值的变化
     * @return
     */
    @RequestMapping(value = "test3")
    public Person test3(){
        Person person = new Person();
        try{
            person.setName("文科生说Java try");
            person.setAge(30);
            log.info("文科生说Java try中 person的值: {}", person);
            return person;
        }finally {
            person.setName("文科生说Java finally");
            person.setAge(40);
            log.info("文科生说Java finally中 person的值: {}", person);
        }
    }

    /**
     *  方法4 finally中没有return时,list数据类型值的变化
     * @return
     */
    @RequestMapping(value = "test4")
    public List<Person> test4(){
        List<Person> list = new ArrayList<>();
        try{
            Person person = new Person();
            person.setName("文科生说Java try");
            person.setAge(30);
            list.add(person);

            log.info("文科生说Java try中 list: {}", list);
            return list;
        }finally {
            Person person = new Person();
            person.setName("文科生说Java finally");
            person.setAge(40);
            list.add(person);

            log.info("文科生说Java finally中 list: {}", list);
        }
    }

    /**
     *  方法5 finally中没有return时,list数据类型 返回list大小
     * @return
     */
    @RequestMapping(value = "test5")
    public int test5(){
        List<Person> list = new ArrayList<>();
        try{
            Person person = new Person();
            person.setName("文科生说Java try");
            person.setAge(30);
            list.add(person);

            log.info("文科生说Java try中 list size: {}", list.size());
            return list.size();
        }finally {
            Person person = new Person();
            person.setName("文科生说Java finally");
            person.setAge(40);
            list.add(person);
            log.info("文科生说Java finally中 list size: {}", list.size());
        }
    }

    /**
     *  方法6 finally中有return时,基本数据类型值的变化
     * @return
     */
    @RequestMapping(value = "test6")
    public int test6(){
        int result = 1;
        try{
            result ++;
            log.info("文科生说Java try中 result的值: {}", result);
            return result;
        }finally {
            result = 3;
            log.info("文科生说Java finally中 result的值: {}", result);
            return result;
        }
    }

    /**
     *  方法7 finally中有return时,String数据类型值的变化
     * @return
     */
    @RequestMapping(value = "test7")
    public String test7(){
        String result = "";
        try{
            result = "aa";
            log.info("文科生说Java try中 result的值: {}", result);
            return result;
        }finally {
            result = "bb";
            log.info("文科生说Java finally中 result的值: {}", result);
            return result;
        }
    }

    /**
     *  方法8 finally中有return时,对象数据类型值的变化
     * @return
     */
    @RequestMapping(value = "test8")
    public Person test8(){
        Person person = new Person();
        try{
            person.setName("文科生说Java try");
            person.setAge(30);
            log.info("文科生说Java try中 person的值: {}", person);
            return person;
        }finally {
            person.setName("文科生说Java finally");
            person.setAge(40);
            log.info("文科生说Java finally中 person的值: {}", person);
            return person;
        }
    }

    /**
     *  方法9 finally中有return时,list数据类型值的变化
     * @return
     */
    @RequestMapping(value = "test9")
    public List<Person> test9(){
        List<Person> list = new ArrayList<>();
        try{
            Person person = new Person();
            person.setName("文科生说Java try");
            person.setAge(30);
            list.add(person);

            log.info("文科生说Java try中 list: {}", list);
            return list;
        }finally {
            Person person = new Person();
            person.setName("文科生说Java finally");
            person.setAge(40);
            list.add(person);

            log.info("文科生说Java finally中 list: {}", list);
            return list;
        }
    }


}
