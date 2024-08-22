package dev.lukmann.collection;

import java.util.*;

public class ChapterLegacyCollection {
    public static void main(String[] args) {
//        Vector
        List<String> list = new Vector<>();

        list.add("Lukman");
        list.add("John");
        list.add("Doe");

        for (var name : list) {
            System.out.println(name);
        }

//        HashTable
        Map<String, String> hashTable = new Hashtable<>();

        hashTable.put("firstName", "Lukman");
        hashTable.put("middleName", "Nul");
        hashTable.put("lastName", "Hakim");

        for (var key : hashTable.keySet()) {
            System.out.println(key);
        }

//        Stack
        Stack<String> stack = new Stack<>();

        stack.push("John");
        stack.push("Doe");

        try {
            for (String name = stack.pop(); name != null; name = stack.pop()) {
                System.out.println(name);
            }
        } catch (EmptyStackException exception) {
            System.out.println("Stack is empty");
        }
    }
}
