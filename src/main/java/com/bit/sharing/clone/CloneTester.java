package com.bit.sharing.clone;

import java.util.Date;

/**
 * Created by chenlu on 2017/10/28.
 */
public class CloneTester {
    public static void main(String[] args) {
        /**
        * clone有两类，第一类是浅clone，一般这种都是我们想要的方式
         * 第二类是深clone
        * */
        User user = new User();
        try {
            // User类要满足两个要求：实现Cloneable接口；复写clone()方法
            user.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }


        /**
         * 第二种实现深clone的方式是序列化，反序列化User类，要求User类实现
         * Serializable接口
         */
    }
}
