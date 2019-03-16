package com.percy.Test;

import com.percy.util.MyHashMap;

import java.util.HashMap;

/**
 * @author percy
 * @create 2019-03-16  下午7:53
 * @descreption:
 **/
public class TestHashMap {
    public static void main(String[] args) {
        MyHashMap myHashMap = new MyHashMap();
        myHashMap.put((Object)(1),(Object)("name"));
        myHashMap.put((Object)(2),(Object)("name"));
        myHashMap.put((Object)(3),(Object)("name"));
        myHashMap.put((Object)(9),(Object)("3"));
        myHashMap.put((Object)(9),(Object)("4"));
        myHashMap.put((Object)(10),(Object)("3"));
        System.out.println(myHashMap.get(10).getValue());
        System.out.println(myHashMap.toString());

    }
}
