package dev.lukmann.collection;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class ChapterQueue {
    public static void main(String[] args) {
//        Queue<String> queue = new ArrayDeque<>();
//        Queue<String> queue = new PriorityQueue<>();
        Queue<String> queue = new LinkedList<>();
//        for (int i = 0; i < queue.size(); i++) {
//            queue.add(String.valueOf(i));
//        }

        queue.add("Lukman");
        queue.add("Hakim");

        for (String next = queue.poll(); next != null; next = queue.poll()) {
            System.out.println(next);
        }

        System.out.println(queue.size());
    }
}
