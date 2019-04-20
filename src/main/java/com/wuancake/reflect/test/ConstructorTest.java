package com.wuancake.reflect.test;

import org.junit.Test;

import java.lang.reflect.Constructor;

/**
 * Time：2019/4/20 0020 17:45
 * Description：<描述>
 */
public class ConstructorTest {

    /*无参的构造方法*/
    @Test
    public void demo1()throws Exception{
        Class class1=Class.forName("com.wuancake.reflect.test.Person");
        Constructor c = class1.getConstructor();
        Person person=(Person) c.newInstance();
        person.eat();
    }
    /*有参的构造方法*/
    @Test
    public void demo2()throws Exception{
        Class class1=Class.forName("com.wuancake.reflect.test.Person");
        Constructor c = class1.getConstructor(String.class,String.class,int.class);
        Person person = (Person) c.newInstance("李狗子","男",18);
        System.out.println(person);
    }
}
