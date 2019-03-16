package com.percy.util;

/**
 * @author percy
 * @create 2019-03-13  下午9:38
 * @descreption:
 **/
public class GernericPerson<T extends Person> {
    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}
