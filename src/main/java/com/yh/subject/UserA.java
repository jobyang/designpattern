package com.yh.subject;

/**
 * \* Created with IntelliJ IDEA.
 * \* @author: yanghua
 * \* @Date: 2019/7/31
 * \* @Description:()
 * \
 */
public class UserA implements UserObserver {
    @Override
    public void update(String msg) {
        System.out.println("UserA" + msg);
    }
}