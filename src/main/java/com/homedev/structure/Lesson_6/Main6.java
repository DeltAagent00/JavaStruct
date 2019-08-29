package com.homedev.structure.Lesson_6;

import java.util.Random;

public class Main6 {
    private static final int MIN_RANGE_RANDOM = -100;
    private static final int MAX_RANGE_RANDOM = 100;
    private static final int COUNT_TREE = 20;
    private static final int LEVEL_TREE = 6;

    public static void main(String[] args) {
        double countDisbalance = 0;

        for (int i = 0; i < COUNT_TREE; ++i) {
            final Tree<Integer> tree = new TreeImpl<>(LEVEL_TREE);

            while(true) {
                final int value = getRandomNumberInRange(MIN_RANGE_RANDOM, MAX_RANGE_RANDOM);
                if (!tree.add(value)) {
                    break;
                }
            }

            System.out.println("tree #" + (i + 1));
            final boolean isBalance = tree.isBalanced();
            System.out.println("isBalance ? = " + isBalance);
            tree.display();

            countDisbalance += isBalance ? 0 : 1;
        }

        System.out.println("Disbalance = " + Math.ceil(countDisbalance / COUNT_TREE * 100) + "%" );

    }

    private static int getRandomNumberInRange(int min, int max) {
        if (min >= max) {
            throw new IllegalArgumentException("max must be greater than min");
        }

        final Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }
}
