package dev.lukmann.lambda;

import java.util.function.Supplier;

public class LazyParamsApp {
    public static void main(String[] args) {
//        testScoreEager(50, getName());
        testScoreLazy(100, () -> getName());
    }

    public static void testScoreEager(int score, String name) {
        if (score > 80) {
            System.out.println("Selamat " + name + " Anda telah lulus.");
        } else {
            System.out.println("Mohon maaf, Anda tidak lulus silahkan coba lagi tahun depan :)");
        }
    }

    public static void testScoreLazy(int score, Supplier<String> name) {
        if (score > 80) {
            System.out.println("Selamat " + name.get() + " Anda telah lulus.");
        } else {
            System.out.println("Mohon maaf, Anda tidak lulus silahkan coba lagi tahun depan :)");
        }
    }

    public static String getName() {
        System.out.println("getName() dipanggil");
        return "Lukman";
    }
}
