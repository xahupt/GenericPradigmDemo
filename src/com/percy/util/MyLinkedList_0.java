package com.percy.util;

import java.awt.*;

/**
 * @author percy
 * @create 2019-03-16  上午8:59
 * @descreption:
 **/
public class MyLinkedList_0<T> {
    /**
     * 定义泛型内部类
     *
     * @param <U>
     */
    public static class Node<U> {
        private Node pre, next;//指针
        private U data;//数据区

        public Node(U data) {
            this.data = data;
        }

        public Node() {
            this.pre = null;
            this.next = null;
            this.data = null;
        }

        public void displayNode() {
            System.out.print(data + " ");
        }
    }

    private Node<T> head, last;
    private int size;

    public MyLinkedList_0() {
        head = null;
        last = null;
        size = 0;
    }

    public int addNode(Node<T> node) {
        if (size == 0) {
            head = node;
            last = node;
        }
        last.next = node;
        node.pre = last;
        last = node;
        if (head == last) {
            node.pre = null;
        }

        size++;
        return 1;
    }

    public int deleteNodes(Node<T> node) {
        Node<T>[] nodes = null;
        Node<T> Var1 = head;
        int Var2 = 0;
        while (Var1 != null) {
            //这里不能用==
            if (node.data .equals( Var1.data)) {
                if (Var1.pre == null) {
                    head = Var1.next;
                    Var1.next.pre = null;
                } else if (Var1.next == null) {
                    last = Var1.pre;
                    Var1.pre.next = null;
                } else {
                    Var1.pre.next = Var1.next;
                    Var1.next.pre = Var1.pre;
                    Var1.data = null;
                }

                Var2++;
            }
//            if (Var1.data==null)
//            {
//                Var1 = Var1.next.next;
//            }else{

                Var1 = Var1.next;
//            }
        }
        return Var2;
    }

    public int displayAllNodes() {
        System.out.println("正序输出");
        Node pos = head;
        while (pos != null) {
            pos.displayNode();
            pos = pos.next;
        }
        System.out.println();
        System.out.println("倒序输出");
        pos = last;
        while (pos != null) {
            pos.displayNode();
            pos = pos.pre;
        }
        System.out.println();
        return size;
    }
}
