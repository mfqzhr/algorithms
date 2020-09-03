package com.mfq.leetcode.code146;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * @author ：穆繁强
 * @date ：Created in 2020/8/27 16:47
 * @description：
 * @modified By：
 * @version: $
 */
public class Solution {

}

class Node {
    int key;
    int val;

    public Node(int key, int val) {
        this.key = key;
        this.val = val;
    }
}


class LRUCache {

    private int capacity;
    private Map<Integer, Node> map;
    private LinkedList<Node> cache;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        map = new HashMap<>(capacity);
        cache = new LinkedList<Node>();
    }

    public int get(int key) {
        if (!map.containsKey(key)) {
            return -1;
        }
        int val = map.get(key).val;
        put(key,val);
        return val;
    }
    public void put(int key, int val) {
        Node node = new Node(key, val);
        if (map.containsKey(key)) {
            map.put(key, node);
            cache.remove(map.get(key));
            cache.addFirst(node);
        } else {
            if (cache.size() == capacity) {
                Node last = cache.removeLast();
                map.remove(last.key);
            }
            cache.addFirst(node);
            map.put(key, node);
        }
    }
}