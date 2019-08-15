package com.homedev.structure.Lesson_3.queue;


import com.homedev.structure.Lesson_3.ICollection;

public interface Queue<E> extends ICollection {

    boolean insert(E value);

    E remove();

    E peek();

}
