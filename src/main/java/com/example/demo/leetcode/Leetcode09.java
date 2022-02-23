package com.example.demo.leetcode;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Leetcode09 {
    class CQueue {

        //栈
        LinkedList stack = new LinkedList<>();

        //队列
        Queue queue = new LinkedList<>();

        //堆
        Queue heap = new PriorityQueue<>();

        public CQueue() {

        }

        public void appendTail(int value) {
            this.stack.addLast(new Node(value));

        }

        public int deleteHead() {
            if(stack.size()==0){
                return -1;
            }
            Object o = stack.removeFirst();
            if(o instanceof Node){
                return ((Node) o).value;
            }
            return 0;
        }
    }

    class Node{
        int value;
        public Node() {
        }

        public Node(int value) {
            this.value = value;
        }

    }

    //链表
    class ListNode {
        int val;       // 节点值
        ListNode next; // 后继节点引用
        ListNode(int x) { val = x; }
    }

    //树
    class TreeNode {
        int val;        // 节点值
        TreeNode left;  // 左子节点
        TreeNode right; // 右子节点
        TreeNode(int x) { val = x; }
    }


}
