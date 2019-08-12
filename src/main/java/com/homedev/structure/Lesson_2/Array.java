package com.homedev.structure.Lesson_2;

public interface Array<E> {
    void add(E value);
    boolean remove(E value);
    boolean remove(int index);
    E get(int index);
    boolean contains(E value);

    int indexOf(E value);
    int size();

    void display();

    Array<E> copy();
    void sortBubble();
    void sortSelect();
    void sortInsert();
}
