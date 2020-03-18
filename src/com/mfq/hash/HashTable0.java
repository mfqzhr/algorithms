package com.mfq.hash;

import java.util.Hashtable;
import java.util.Map;
import java.util.TreeMap;

/**
 * 散列表
 * 哈希冲突: k1 不等于 k2 hash(k1) = hash(k2)
 * 解决哈希冲突:
 * 1. 开放地址法: 按照一定规则向其他地址探测,直到遇到空桶
 * 2. 再哈希法: 设置多个哈希函数
 * 3. 链地址法: 通过链表将同一个index的元素串起来
 * java 使用单向链表将元素串起来,当哈希表的容量大于64并且节点个数大于8,转为红黑树
 * 为什么使用单向链表呢?
 * 哈希函数的实现步骤如下
 * 1. 先生成key的哈希值(必须是整数)
 * 2. 在让key的哈希值跟数组的大小进行相关的运算.生成一个索引值
 * 良好的哈希函数: 分布比较均匀,减少哈希冲突的次数,提升哈希表的性能
 *
 */
public class HashTable0 {
    public static void main(String[] args) {

    }
}
