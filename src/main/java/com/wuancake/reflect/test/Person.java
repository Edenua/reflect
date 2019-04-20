package com.wuancake.reflect.test;

/**
 * Time：2019/4/20 0020 17:40
 * Description：<描述>
 */
public class Person {
    public Person() {
        super();
        // TODO Auto-generated constructor stub
    }

    public Person(String name, String sex,int sum) {
        super();
        this.name = name;
        this.sex = sex;
        this.sum = sum;
    }

    public String name;
    private String sex;
    private  int sum;
/*	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}*/


    public void eat(){
        System.out.println("吃....这是一个公有方法");
    }

    private void run(){
        System.out.println("跑.....这是一个私有方法");
    }

    public String sayHello(String name){
        return "Hello "+name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", sum=" + sum +
                '}';
    }
}
