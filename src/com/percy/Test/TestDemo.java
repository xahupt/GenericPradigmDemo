package com.percy.Test;

import com.percy.util.*;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author percy
 * @create 2019-03-13  下午9:23
 * @descreption:
 **/
public class TestDemo {
    public static void main(String[] args) {


        System.out.println("-----------------------------------------");
        GenericClass<Integer,String> genericClass = new GenericClass<>();
        genericClass.setK(10);
        genericClass.setV("test");
        System.out.println(genericClass.getK().toString());
        System.out.println("-----------------------------------------");
        ArrayList<GernericPerson> gernericPersonArrayList = new ArrayList<>();
        GernericPerson gernericPerson1=new GernericPerson();
        GernericPerson gernericPerson2=new GernericPerson();
        gernericPerson1.setT(new African());
        gernericPersonArrayList.add(gernericPerson1);
        gernericPerson2.setT(new Asian());
        gernericPersonArrayList.add(gernericPerson2);

//        gernericPerson.setT(new Person(Color.YELLOW));
        for (GernericPerson person : gernericPersonArrayList) {
            System.out.println(person.getT().toString());
        }
        System.out.println("-------------上下边界----------------------------");
        /**
         * super限定符
         */
        ArrayList<? super Person> arrayList = new ArrayList<Person>();
        arrayList.add(new Asian());
        arrayList.add(new African());
        arrayList.add(new Person(Color.BLUE));
        System.out.println(arrayList.get(0).toString());
        for (Object o : arrayList) {
            System.out.println(o.toString());
        }
//        ArrayList<? extends Asian> arrayList1 = new ArrayList<>();
//        arrayList1.add(new Person(Color.BLUE));
        List<?> list = new ArrayList<String>();
        list.add(null);
        list.get(0);

        MyLinkedList linkedList = new MyLinkedList();


        linkedList.addLastNode(new MyLinkedList.Node(2));
        linkedList.addLastNode(new MyLinkedList.Node(3));
        linkedList.addLastNode(new MyLinkedList.Node("4"));
        linkedList.addFirstNode(new MyLinkedList.Node(1));
        linkedList.addFirstNode(new MyLinkedList.Node(2));
        linkedList.addFirstNode(new MyLinkedList.Node("123"));
        linkedList.addFirstNode(new MyLinkedList.Node(new Object()));
        System.out.println(linkedList.getSize());
        linkedList.displayAllNodes();
        System.out.println(linkedList.deleteNode((new MyLinkedList.Node(1))));
        linkedList.displayAllNodes();
        linkedList.addFirstArrayList(new MyLinkedList.Node[]{new MyLinkedList.Node(1),new MyLinkedList.Node(2),
                new MyLinkedList.Node(3)});
        linkedList.displayAllNodes();
        linkedList.deleteFirstNode();
        linkedList.displayAllNodes();
        System.out.println("-------------双向链表----------------------------");
        MyLinkedList_0 linkedList_0 = new MyLinkedList_0();
        for (int i = 0; i < 1000; i++) {
            linkedList_0.addNode(new MyLinkedList_0.Node(i));
        }
        linkedList_0.displayAllNodes();
        System.out.println("删除节点");
        for (int i = 0; i <501 ; i++) {

            System.out.println(linkedList_0.deleteNodes(new MyLinkedList_0.Node(i*2)));
        }
        linkedList_0.displayAllNodes();
    }
}
