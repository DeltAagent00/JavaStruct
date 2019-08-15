package com.homedev.structure.Lesson_3;

public interface ICollection {

    boolean isEmpty();

    int size();

    default boolean isFull() {
        return false;
    }
}
