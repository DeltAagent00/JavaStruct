package com.homedev.structure.Lesson_5;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(pow(2, 10));

        final List<Item> listItem = new ArrayList<>();
        listItem.add(new Item("Книга", 600D, 1));
        listItem.add(new Item("Бинокль", 5_000D, 2));
        listItem.add(new Item("Аптечка", 1_500D, 4));
        listItem.add(new Item("Ноутбук", 40_000D, 2));
        listItem.add(new Item("Котелок", 500D, 1));

        final Backpack backpack = new Backpack(3);
        backpack.makeAllSets(listItem);
        final List<Item> items = backpack.getBestItems();
        if (items != null) {
            for (Item item : items) {
                System.out.println(item);
            }
        }
    }

    public static double pow(double x, int p) throws Exception {
        if (p < 0) {
            throw new Exception("pow not be negative");
        }
        if (p == 0) {
            return 1;
        }
        if (p == 1) {
            return x;
        }

        return x * pow(x, p - 1);
    }
}
