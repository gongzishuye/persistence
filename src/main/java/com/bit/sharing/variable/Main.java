package com.bit.sharing.variable;

/**
 * Created by chenlu on 2017/10/28.
 */
public class Main {
    public static void main(String[] args) {
        Parent pro = new Parent();

        System.out.println(pro.singing);
        System.out.println(pro.dancing);

        pro.singing();
        pro.dancing();
    }

}
