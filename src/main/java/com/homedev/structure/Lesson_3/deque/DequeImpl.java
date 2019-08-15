package com.homedev.structure.Lesson_3.deque;

public class DequeImpl<E> implements Deque<E> {

    private static final int DEFAULT_TAIL = -1;
    private static final int DEFAULT_HEAD = 0;

    protected final E[] data;
    protected int size;

    private int head;
    private int tail;

    @SuppressWarnings("unchecked")
    public DequeImpl(int maxCapacity) {
        this.data = (E[]) new Object[maxCapacity];
        this.head = DEFAULT_HEAD;
        this.tail = DEFAULT_TAIL;
    }

    @Override
    public boolean insertLeft(E value) {
        if (isFull()) {
            return false;
        }

        if (head == 0) {
            head = data.length;
        }
        data[--head] = value;
        size++;
        return true;
    }

    @Override
    public boolean insertRight(E value) {
        if (isFull()) {
            return false;
        }

        if (tail == lastIndex()) {
            tail = DEFAULT_TAIL;
        }
        data[++tail] = value;
        size++;
        return true;
    }

    @Override
    public E removeLeft() {
        if (isEmpty()) {
            return null;
        }

        if (head == data.length) {
            head = DEFAULT_HEAD;
        }

        E value = data[head++];
        size--;
        return value;
    }

    @Override
    public E removeRight() {
        if (isEmpty()) {
            return null;
        }

        if (tail == DEFAULT_TAIL) {
            tail = lastIndex();
        }

        E value = data[tail--];
        size--;
        return value;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isFull() {
        return size == data.length;
    }

    private int lastIndex() {
        return data.length - 1;
    }
}
