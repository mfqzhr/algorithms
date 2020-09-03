package com.mfq.union;

import com.mfq.class10.Code01_UnionFind;
import sun.java2d.pipe.SpanShapeRenderer;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

/**
 * @author ：穆繁强
 * @date ：Created in 2020/9/1 13:10
 * @description：
 * @modified By：
 * @version: $
 */
class Node<T> {
    T value;

    public Node(T value) {
        this.value = value;
    }

}

public class UnionFind<V> {
    public Map<V, Node<V>> nodes = new HashMap<>();
    public Map<Node<V>, Node<V>> parents = new HashMap<>();
    public Map<Node<V>, Integer> sizeMap = new HashMap<>();

    public UnionFind(List<V> values) {
        for (V value : values) {
            Node<V> node = new Node<>(value);
            nodes.put(value, node);
            parents.put(node, node);
            sizeMap.put(node, 1);
        }
    }

    public Node<V> findParent(Node<V> cur) {
        Stack<Node<V>> path = new Stack<>();
        while (cur != parents.get(cur)) {
            path.push(cur);
            cur = parents.get(cur);
        }
        while (!path.isEmpty()) {
            parents.put(path.pop(), cur);
        }
        return cur;
    }

    public boolean isSameSet(V a, V b) {
        if (!nodes.containsKey(a) || !nodes.containsKey(b)) {
            return false;
        }
        return findParent(nodes.get(a)) == findParent(nodes.get(b));
    }

    public void union(V a, V b) {
        if (nodes.containsKey(a) || !nodes.containsKey(b)) {
            return;
        }
        Node<V> aHead = findParent(nodes.get(a));
        Node<V> bHead = findParent(nodes.get(b));
        if (aHead != bHead) {
            int aSetSize = sizeMap.get(aHead);
            int bSetSize = sizeMap.get(bHead);
            if (aSetSize >= bSetSize) {
                parents.put(bHead, aHead);
                sizeMap.put(aHead, aSetSize + bSetSize);
                sizeMap.remove(bHead);
            } else {
                parents.put(aHead, bHead);
                sizeMap.put(bHead, aSetSize + bSetSize);
                sizeMap.remove(aHead);
            }
        }
    }



}
