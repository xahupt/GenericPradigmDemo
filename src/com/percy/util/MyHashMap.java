package com.percy.util;

import java.util.Arrays;

/**
 * @author percy
 * @create 2019-03-16  下午4:34
 * @descreption:
 **/
public class MyHashMap<K,V> {
    private Node<K,V>[] nodes;
    private static final Integer CAPACITY=8;
    private int size;

    public void put(K k,V v){
        boolean Var1=false;
        Node node = new Node(k,v);
        if (size==0){
            inflate();
        }
        int index = getHash(node);
        for (Node<K,V> kvNode = nodes[index];kvNode!=null;kvNode=kvNode.next){
            if (kvNode.key.equals(k)){
                kvNode.value = v;
                Var1 = !Var1;
            }
        }
        if (!Var1){
            AddNode(k, v, index);
        }
    }

    private void AddNode(K k, V v, int index) {
        Node<K,V> newNode = new Node<K, V>(k,v, nodes[index]);
        nodes[index] = newNode;
        size++;
    }

    private int getHash(Node node) {
        return ((node.hashCode())^0xf) % CAPACITY;
    }
    public Node<K,V> get(K k){
        Node<K,V> Var1 = new Node<K, V>(k,null);
        int index = getHash(Var1);
        for (Node<K,V> kvNode = nodes[index];kvNode!=null;kvNode=kvNode.next){
            if (kvNode.key.equals(k)){
                return kvNode;

            }
        }
        return null;
    }
    @Override
    public String toString() {

        return "MyHashMap{" +
                "nodes=" + Arrays.toString(nodes) +
                ", size=" + size +
                '}';
    }

    public void inflate(){
        nodes = new Node[CAPACITY];
    }
    public static class Node<K,V> {
        final int hash;
        final K key;
        V value;
        Node<K,V> next;

        public Node(K key, V value) {
            this.hash = hashCode();
            this.key = key;
            this.value = value;
        }

        public Node(K key, V value, Node<K, V> node) {
            this.hash = hashCode();
            this.key = key;
            this.value = value;
            this.next = node;
        }

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }

        public void setValue(V value) {
            this.value = value;
        }

        public Node<K, V> getNext() {
            return next;
        }

        public void setNext(Node<K, V> next) {
            this.next = next;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Node<?, ?> node = (Node<?, ?>) o;

            if (hash != node.hash) return false;
            if (key != null ? !key.equals(node.key) : node.key != null) return false;
            if (value != null ? !value.equals(node.value) : node.value != null) return false;
            return next != null ? next.equals(node.next) : node.next == null;
        }

        @Override
        public int hashCode() {
            int result = hash;
            result = 31 * result + (key != null ? key.hashCode() : 0);
            return result;
        }

        private void displayNode(){
            System.out.println((key + ":" + value));
        }


    }
}
