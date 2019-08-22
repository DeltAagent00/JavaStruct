package com.homedev.structure.Lesson_5;

import java.util.ArrayList;
import java.util.List;

public class Backpack {
    private double backpackSize;
    private double bestPrice;
    private List<Item> bestItems;


    public Backpack(double backpackSize) {
        this.backpackSize = backpackSize;
    }

    private double calcWeight(List<Item> items) {
        double sumW = 0;

        for (Item item: items) {
            sumW += item.getWeight();
        }
        return sumW;
    }

    private double calcPrice(List<Item> items) {
        double price = 0;

        for (Item item: items) {
            price += item.getPrice();
        }
        return price;
    }

    private void checkSet(List<Item> items) {
        if (bestItems == null) {
            if (calcWeight(items) <= backpackSize) {
                bestItems = items;
                bestPrice = calcPrice(items);
            }
        } else {
            if(calcWeight(items) <= backpackSize && calcPrice(items) > bestPrice) {
                bestItems = items;
                bestPrice = calcPrice(items);
            }
        }
    }

    public void makeAllSets(List<Item> items) {
        if (items.size() > 0) {
            checkSet(items);
        }

        for (int i = 0; i < items.size(); ++i) {
            List<Item> newSet = new ArrayList<>(items);
            newSet.remove(i);
            makeAllSets(newSet);
        }
    }

    public List<Item> getBestItems() {
        return bestItems;
    }
}
