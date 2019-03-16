package com.percy.util;

/**
 * @author percy
 * @create 2019-03-13  下午9:31
 * @descreption:
 **/
public class GenericClass<K,V> {
    private K k;
    private V v;

    public K getK() {
        return k;
    }

    public void setK(K k) {
        this.k = k;
    }

    public V getV() {
        return v;
    }

    public void setV(V v) {
        this.v = v;
    }
}
