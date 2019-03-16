package com.percy.util;

/**
 * @author percy
 * @create 2019-03-13  下午10:27
 * @descreption:自定义泛型类单向链表
 **/
public class MyLinkedList<T> {

    private Node<T> first; // 定义一个头结点
    private Node<T> last;
    private int size;
    private int pos;// 节点的位置

    public MyLinkedList() {
        this.first = null;
        this.last = null;
        size = 0;
    }

    /**
     * @return 链表大小
     */
    public int getSize(){
        return size;
    }

    /**
     * 在头部添加节点数组
     * @param nodes 节点数组
     */
    public void addFirstArrayList(Node<T>... nodes){
        for (Node node : nodes) {
            addFirstNode(node);
        }
    }

    /**
     *
     * @param data 泛型节点
     * @return int 删除节点数目
     */
    public int deleteNode(Node<T> data){
        Node tmp = first;
        Node preNode =null ;
        int Result=0;
        while (tmp!=null){

            if (tmp.data==data.data){
                if (preNode==null){
                    first=tmp.next;
                }else{
                    preNode.next = tmp.next;
                }
                Result++;
            }
            preNode = tmp;
            tmp = tmp.next;
        }
        return Result;
    }

    /**
     * 在头部添加节点
     * @param data
     */
    public void addFirstNode(Node<T> data) {
        if (size==0){
            last = data;
            first = data;
        }
        data.next = first;
        first = data;
        size++;

    }

    /**
     * 在尾部添加节点
     * @param data
     */
    public void addLastNode(Node<T> data) {
        if (size==0){
            first=data;
            last = data;
        }
        data.next = null;
        last.next = data;
        last =data;
        size++;

    }
    // 删除一个头结点,并返回头结点

    /**
     * 删除一个头节点
     * @return 删除的节点
     */
    public Node deleteFirstNode() {
        Node tempNode = first;
        first = tempNode.next;
        return tempNode;
    }
    /**
     * 删除一个尾节点
     * @return 删除的节点
     */
    public Node deleteLastNode() {
        Node tempNode = first;
        first = tempNode.next;
        return tempNode;
    }

    /**
     * 显示所有节点
     */
    public void displayAllNodes() {
        Node current = first;
        while (current != null) {
            current.display();
            current = current.next;
        }
        System.out.println();
    }
    public static class Node<E> {
        protected Node next; //指针域
        public  E data;//数据域

        public Node() {
            next = null;
            data = null;
        }

        public Node(E data) {
            this. data = data;
        }

        //显示此节点
        public void display() {
            System. out.print( data + " ");
        }
    }
}
