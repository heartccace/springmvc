package com.springmvc.controller;

import java.util.concurrent.*;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author liushuang
 * @create 2019-08-22 13:52
 */

public class HelloWorldController {
    private static ConcurrentHashMap<String,String> map = new ConcurrentHashMap<>();
    private static ReentrantLock lock = new ReentrantLock();


    public static void main(String[] args) {
        map.put("key", "value");
        new Thread(() -> {
            if(map.get("key") != null) {
                try {
                    TimeUnit.SECONDS.sleep(2);
                    System.out.println(map.get("key"));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
        new Thread(() -> {
            try {
                TimeUnit.SECONDS.sleep(1);
                map.clear();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }).start();
        // lock.lockInterruptibly();
    }
}
