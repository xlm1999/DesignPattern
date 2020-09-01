package com.meng.singleton;

public class SingletonObject {

    public static  SingletonObject instance = new SingletonObject();
    // 构造函数设置为private ，这样该类就不会被实例化。
    private SingletonObject(){};

    public static SingletonObject getInstance() {
        return  instance;
    }

    public void showMessage() {
        System.out.println("hello...");
        System.out.println(123);

    }
    // 这是注释
    public void sayHello() {
        System.out.println("hello, this is my test.");
        System.out.println();
    }
}
