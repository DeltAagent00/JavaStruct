package com.homedev.structure;

import com.homedev.structure.Lesson_3.queue.Queue;
import com.homedev.structure.Lesson_3.queue.QueueImpl;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Lesson_3_Test_queue {
    private Queue<Integer> queue;

    @Before
    public void before() {
        queue = new QueueImpl<>(3);
    }

    @Test
    public void insert() {
        queue.insert(1);
        Assert.assertEquals(queue.size(), 1);

        queue.insert(2);
        Assert.assertEquals(queue.size(), 2);

        queue.insert(3);
        Assert.assertEquals(queue.size(), 3);

        final boolean result = queue.insert(4);
        Assert.assertFalse(result);

        Assert.assertEquals(queue.size(), 3);
    }

    @Test
    public void remove() {
        queue.insert(1);
        queue.insert(2);
        queue.insert(3);

        int removeResult = queue.remove();

        Assert.assertEquals(removeResult, 1);
        Assert.assertEquals(queue.size(), 2);

        removeResult = queue.remove();

        Assert.assertEquals(removeResult, 2);
        Assert.assertEquals(queue.size(), 1);

        removeResult = queue.remove();

        Assert.assertEquals(removeResult, 3);
        Assert.assertEquals(queue.size(), 0);
    }

    @Test
    public void peek() {
        queue.insert(1);
        queue.insert(2);
        queue.insert(3);

        int peekResult = queue.peek();

        Assert.assertEquals(peekResult, 1);
        Assert.assertEquals(queue.size(), 3);
    }

    @After
    public void after() {
        queue = null;
    }
}
