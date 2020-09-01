package com.meng.singleton;

public class SingletonPatternDemo {
    public static void main(String[] args) {
        SingletonObject single = SingletonObject.getInstance();
        single.showMessage();
    }
}
