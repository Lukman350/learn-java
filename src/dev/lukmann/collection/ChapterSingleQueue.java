package dev.lukmann.collection;

import java.util.Queue;

public class ChapterSingleQueue {
    public static void main(String[] args) {
        Queue<String> singleQueue = new SingleQueue<>();

        singleQueue.add("Lukman");

        System.out.println(singleQueue.size());
    }
}
