package com.homedev.structure.Lesson_3.deque;

import com.homedev.structure.Lesson_3.ICollection;

public interface Deque<E> extends ICollection {
    boolean insertLeft(E value);
    boolean insertRight(E value);
    E removeLeft();
    E removeRight();
}
