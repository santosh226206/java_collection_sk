package com.santos.queue.src;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {
    public static void main(String[] args) {
        Queue<String> queue=new LinkedList<>();
        //System.out.println(queue.poll());
        //queue.add("hello");
//        System.out.println(queue.poll());
        System.out.println(queue.remove());
        System.out.println(queue);
    }
}
