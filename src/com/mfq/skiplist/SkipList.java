package com.mfq.skiplist;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;

/**
 * @author ：穆繁强
 * @date ：Created in 2020/8/28 16:39
 * @description：
 * @modified By：
 * @version: $
 */
public class SkipList<K, V> {

    private static final int MAX_LEVEL = 32;
    public int size;
    private Comparator<K> comparator;
    /**
     * 有效层数
     */
    private int level;
    /**
     * 不存放 K V
     */
    private Node<K, V> first;

    public SkipList(Comparator<K> comparator) {
        this.comparator = comparator;
        first = new Node<>();
        first.nexts = new Node[MAX_LEVEL];
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public V put(K key, V value) {
        return null;
    }

    public V get(K key) {
        keyCheck(key);
        Node<K, V> node = first;
        for (int i = level - 1; i >= 0; i--) {
            int cmp = -1;
            while (node.nexts[i] != null && (cmp = compare(key, node.nexts[i].key)) > 0) {
                node = node.nexts[i];
            }
            if (cmp == 0) {
                return node.nexts[i].value;
            }
        }
        return null;
    }

    public V remove(K key) {
        return null;
    }

    private void keyCheck(K key) {
        if (key == null) {
            throw new IllegalArgumentException("key must not be null");
        }
    }

    private int compare(K k1, K k2) {
        return comparator != null ?
                comparator.compare(k1, k2)
                : ((Comparable<K>) k1).compareTo(k2);
    }

    private static class Node<K, V> {
        K key;
        V value;
        Node<K, V>[] nexts;
    }
}
