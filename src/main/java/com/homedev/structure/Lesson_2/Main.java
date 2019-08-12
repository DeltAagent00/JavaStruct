package com.homedev.structure.Lesson_2;

import java.util.Random;

public class Main {
    final static int COUNT_ARRAY = 1000000;

    public static void main(String[] args) {
        Array<Integer> array1 = new MyArrayImpl<>(COUNT_ARRAY);
        Array<Integer> array2;
        Array<Integer> array3;

        final Random rand = new Random();

        for(int i = 0; i < COUNT_ARRAY; ++i) {
            array1.add(rand.nextInt());
        }
        array2 = array1.copy();
        array3 = array1.copy();

        long startTime = System.currentTimeMillis();
        array1.sortBubble();
        long endTime = System.currentTimeMillis();
        System.out.println("sortBubble duration = " + (endTime - startTime) + "mc");

        startTime = System.currentTimeMillis();
        array2.sortInsert();
        endTime = System.currentTimeMillis();
        System.out.println("sortInsert duration = " + (endTime - startTime) + "mc");

        startTime = System.currentTimeMillis();
        array3.sortSelect();
        endTime = System.currentTimeMillis();
        System.out.println("sortSelect duration = " + (endTime - startTime) + "mc");
    }
}
