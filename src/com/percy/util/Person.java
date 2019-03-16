package com.percy.util;

import java.awt.*;

/**
 * @author percy
 * @create 2019-03-13  下午9:15
 * @descreption:
 **/
public class Person {
    private int id;
    private String name;
    private int age;
    private Color skinColour;

    public Color getSkinColour() {
        return skinColour;
    }

    public void setSkinColour(Color skinColour) {
        this.skinColour = skinColour;
    }

    public Person(Color skinColour) {
        this.skinColour = skinColour;
    }

    public Person(int id, String name, int age, Color skinColour) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.skinColour = skinColour;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", skinColour=" + skinColour +
                '}';
    }
}
