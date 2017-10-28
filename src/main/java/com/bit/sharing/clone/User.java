package com.bit.sharing.clone;

import java.util.Date;

/**
 * Created by chenlu on 2017/10/28.
 */
public class User implements Cloneable{
    String name;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    Date date;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
