package dev.lukmann.collection;

import java.util.Deque;
import java.util.LinkedList;

public class ChapterDeque {
    public static void main(String[] args) {
        Deque<String> stack = new LinkedList<>();

        stack.offerLast("Lukman");
        stack.offerLast("Hakim");

        System.out.println(stack.pollLast());
        System.out.println(stack.pollLast());

        Deque<String> queue = new LinkedList<>();
        queue.offerLast("Lukman");
        queue.offerLast("Hakim");

        System.out.println(queue.pollFirst());
        System.out.println(queue.pollFirst());
    }
}
