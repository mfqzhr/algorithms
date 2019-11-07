package com.mfq.array;

import java.util.Queue;

public class Array<T> {
    private T[] data;//数据
    private int size;//实际大小

    /**
     * @param capacity
     */
    //构造函数,传入数组的capacity构造Array
    public Array(int capacity) {
        data = (T[]) new Object[capacity];
        size = 0;
    }

    /**
     * 无参数的构造函数,默认传入数组的capacity为10
     */
    public Array() {
        this(10);
    }

    /**
     * 获取数组中元素的个数
     *
     * @return
     */
    public int getSize() {
        return size;
    }

    /**
     * 获取数组的总容量
     *
     * @return
     */
    public int getCapacity() {
        return data.length;
    }

    /**
     * 返回数组是否为空
     *
     * @return
     */
    public boolean isEmpty() {

        return size == 0;
    }

    /**
     * 向数组添加元素,在数组的末尾添加元素
     */
    public void addLast(T e) {
        add(size, e);
    }

    /**
     * 向指定位置插入元素
     *
     * @param index
     * @param e
     */
    public void add(int index, T e) {
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("Add failed. Require index >= 0 and index <= size");
        }
        if (size == data.length) {
            resize(2 * data.length);
        }

        for (int i = size - 1; i >= index; i--) {
            data[i + 1] = data[i];
        }
        data[index] = e;
        size++;

    }



    /**
     * 取出index索引对应的元素
     *
     * @param index
     * @return
     */
    public T get(int index) {

        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("Get failed");
        }
        return data[index];
    }

    /**
     * 修改元素
     *
     * @param index
     * @param e
     */
    public void set(int index, T e) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("Set failed");
        }
        data[index] = e;
    }

    /**
     * 查看数组中是否有元素e
     *
     * @param e
     * @return
     */
    public boolean contains(T e) {
        for (int i = 0; i < size; i++) {
            if (data[i].equals(e)) {
                return true;
            }

        }
        return false;

    }

    /**
     * 查找数组中是否存在e
     *
     * @param e
     * @return
     */
    public int find(T e) {
        for (int i = 0; i < size; i++) {
            if (data[i].equals(e)) {
                return i;
            }

        }
        return -1;

    }

    /**
     * 从数组中删除元素
     *
     * @return
     */
    public T delete(int index) {
        if (index < 0 || index >= size)
            throw new IllegalArgumentException("Not allowed");
        T datum = data[index];
        for (int i = index + 1; i < size; i++) {
            data[i - 1] = data[i];
        }
        size--;
        if (size == data.length / 2) {
             resize(data.length / 2);
        }
        return datum;
    }

    /**
     * 从数组中删除第一个元素
     */
    public T deleteFirst() {
        return delete(0);
    }

    /**
     * 从数组中删除最后一个元素
     */
    public void deleteLast() {
        delete(size - 1);
    }

    /**
     * 从数组中删除元素e
     *
     * @param e
     */
    public void deleteElement(T e) {
        int index = find(e);
        if (index != -1) {
            delete(index);
        }

    }

    /**
     * 动态开辟内存空间
     * @param newCapacity
     */
    private void resize(int newCapacity) {
        T[] newData = (T[]) new Object[newCapacity];
        for (int i = 0; i < size; i++) {
            newData[i] = data[i];
        }
        data = newData;
    }


    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append(String.format("Array size = %d, capacity = %d\n", size, data.length));
        res.append('[');
        for (int i = 0; i < size; i++) {
            res.append(data[i]);
            if (i != size - 1) {
                res.append(", ");
            }

        }
        res.append(']');
        return res.toString();
    }

    public T getLast() {
        if (size < 1)
            throw new IllegalArgumentException("Not allowed");
        return data[size - 1];
    }
}
