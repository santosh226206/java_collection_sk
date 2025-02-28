package com.santos.queue.src;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class QueueTest {
    public static void main(String[] args) {
        Queue<String> queue=new LinkedList<>();
        //System.out.println(queue.poll());
        //queue.add("hello");
        System.out.println(queue.poll());
        //System.out.println(queue.remove());
        System.out.println(queue);
        queue.add("hello1");
        queue.add("hello2");
        queue.add("hello3");
        queue.add("hello4");
        queue.add("hello5");
        List<String> output= queue.stream().filter((item)->item.equals("hello2")).toList();
        System.out.println(output);
    }
}
