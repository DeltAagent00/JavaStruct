package com.homedev.structure;

import com.homedev.structure.Lesson_3.deque.Deque;
import com.homedev.structure.Lesson_3.deque.DequeImpl;
import com.homedev.structure.Lesson_3.queue.QueueImpl;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Lesson_3_Test_deque {
    private Deque<Integer> deque;

    @Before
    public void before() {
        deque = new DequeImpl<>(4);
    }

    @Test
    public void insertRight() {
        deque.insertRight(1);
        deque.insertRight(2);
        deque.insertRight(3);
        deque.insertRight(4);

        Assert.assertEquals(deque.size(), 4);

        boolean result = deque.insertLeft(5);
        Assert.assertFalse(result);
        Assert.assertEquals(deque.size(), 4);
    }

    @Test
    public void insertLeft() {
        deque.insertLeft(1);
        deque.insertLeft(2);
        deque.insertLeft(3);
        deque.insertLeft(4);

        Assert.assertEquals(deque.size(), 4);

        boolean result = deque.insertLeft(5);
        Assert.assertFalse(result);
        Assert.assertEquals(deque.size(), 4);
    }

    @Test
    public void removeRight() {
        deque.insertRight(1);
        deque.insertRight(2);
        deque.insertRight(3);
        deque.insertRight(4);

        int value = deque.removeRight();
        Assert.assertEquals(value, 4);

        value = deque.removeRight();
        Assert.assertEquals(value, 3);

        value = deque.removeRight();
        Assert.assertEquals(value, 2);

        value = deque.removeRight();
        Assert.assertEquals(value, 1);
    }

    @Test
    public void removeLeft() {
        deque.insertRight(1);
        deque.insertRight(2);
        deque.insertRight(3);
        deque.insertRight(4);

        int value = deque.removeLeft();
        Assert.assertEquals(value, 1);

        value = deque.removeLeft();
        Assert.assertEquals(value, 2);

        value = deque.removeLeft();
        Assert.assertEquals(value, 3);

        value = deque.removeLeft();
        Assert.assertEquals(value, 4);
    }

    @After
    public void after() {
        deque = null;
    }
}
