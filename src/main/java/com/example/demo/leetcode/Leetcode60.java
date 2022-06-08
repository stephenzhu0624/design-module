package com.example.demo.leetcode;

import javax.lang.model.element.VariableElement;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Queue;

public class Leetcode60 {

    static class MaxQueue {
       static Queue<Integer> l = new LinkedList();
       static List<Integer> maxlist = new LinkedList();

        public  MaxQueue() {
            //maxlist =  new LinkedList<Integer>();

        }

        public static int max_value() {
            if (maxlist.isEmpty()){
                return -1;
            }
            return (Integer) maxlist.get(0);
        }

        public static void push_back(int value) {
            l.add(value);
            if(maxlist.isEmpty()){
                maxlist.add(value);
                return;
            }
            ListIterator<Integer> integerListIterator = maxlist.listIterator();
            while (integerListIterator.hasNext()){
                Integer next = integerListIterator.next();
                if(next < value){
                    maxlist.add(maxlist.indexOf(next),value);
                    return;
                }
            }
            maxlist.add(value);



        }
        public static int pop_front() {
            if (maxlist.isEmpty()){
                return -1;
            }
            Integer poll = (Integer)l.poll();
            maxlist.remove(poll);
            return poll;
        }
    }

    public static void main(String[] args) {

        MaxQueue.push_back(5);
        MaxQueue.push_back(4);
        MaxQueue.push_back(6);
        MaxQueue.push_back(1);
        MaxQueue.maxlist.toString();
        MaxQueue.pop_front();
        int i = MaxQueue.max_value();
        MaxQueue.pop_front();
        MaxQueue.pop_front();MaxQueue.pop_front();
        int i2 = MaxQueue.max_value();

    }
}
