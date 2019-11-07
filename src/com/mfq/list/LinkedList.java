package com.mfq.list;

/**
 * 链表的增删改查操作
 *
 * @param <T>
 */
public class LinkedList<T> {
    private class Node {
        public T data;
        public Node next;

        public Node(T data, Node next) {
            this.data = data;
            this.next = next;
        }

        public Node(T data) {
            this.data = data;
        }

        public Node() {

        }

        @Override
        public String toString() {
            return "Node{" +
                    "data=" + data
                    + '}';
        }
    }

    private Node head;
    private int size;

    public LinkedList() {
        head = new Node(null, null);
        size = 0;
    }

    /**
     * 获取链表中元素的个数
     */
    public int getSize() {
        return size;
    }

    /**
     * 判断链表是否为空
     *
     * @return
     */
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * 在链表的头部添加元素
     *
     * @param data
     */
    public void addFirst(T data) {
        add(0, data);
    }

    /**
     * 在链表的中间添加一个新的元素e
     */
    public void add(int index, T data) {
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("add failed");
        }

        Node prev = head;
        for (int i = 0; i < index; i++) {
            prev = prev.next;
        }
        Node node = new Node(data);
        node.next = prev.next;
        prev.next = node;
        size++;

    }

    /**
     * 在链表的末尾添加元素
     */
    public void addLast(T data) {
        add(size, data);
    }

    //获得链表的第index个位置的元素
    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("get error");
        }
        Node currnet = head.next;
        for (int i = 0; i < index; i++) {
            currnet = currnet.next;
        }

        return currnet.data;

    }

    //获得链表的第一个元素
    public T getFirst() {
        return get(0);
    }

    //获得链表的最后一个元素
    public T getLast() {
        return get(size - 1);
    }

    //修改链表的第index位置的元素e
    public void set(int index, T data) {
        if (index == 0 || index >= size) {
            throw new IllegalArgumentException("set is not allowed");
        }

        Node currnet = head.next;

        for (int i = 0; i < index; i++) {
            currnet = currnet.next;
        }

        currnet.data = data;
    }

    //查找链表中是否存在元素data
    public boolean contains(T data) {
        Node currnt = head.next;
        while (currnt != null) {
            if (currnt.data == data) {
                return true;
            }
            currnt = currnt.next;
        }

        return false;
    }

    //删除索引为index的元素,返回删除的元素
    public T remove(int index) {
        Node prev = head;
        for (int i = 0; i < index; i++) {
            prev = prev.next;
        }
        Node retNode = prev.next;
        prev.next = retNode.next;
        size--;
        retNode.next = null;

        return retNode.data;
    }

    //删除第一个元素
    public T removeFirst() {
        return remove(0);
    }
    //删除最后一个元素

    public T removeLast() {
        return remove(size - 1);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        Node current = head.next;
        while (current != null) {
            stringBuilder.append(current.data + "->");
            current = current.next;
        }
        stringBuilder.append("NULL");
        return stringBuilder.toString();
    }
}

class Main {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            linkedList.addFirst(i);
            System.out.println(linkedList);
        }

        linkedList.add(2,222);
        System.out.println(linkedList);
        linkedList.remove(2);
        System.out.println(linkedList);
    }

}