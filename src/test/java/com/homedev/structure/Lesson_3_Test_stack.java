package com.homedev.structure;

import com.homedev.structure.Lesson_3.stack.Stack;
import com.homedev.structure.Lesson_3.stack.StackImpl;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Lesson_3_Test_stack {

    private Stack<Integer> stack;

    @Before
    public void before() {
        stack = new StackImpl<>(3);
    }

    @Test
    public void push() {
        stack.push(1);
        Assert.assertEquals(stack.size(), 1);

        stack.push(2);
        Assert.assertEquals(stack.size(), 2);

        stack.push(3);
        Assert.assertEquals(stack.size(), 3);

        final boolean result = stack.push(4);
        Assert.assertFalse(result);

        Assert.assertEquals(stack.size(), 3);
    }

    @Test
    public void pop() {
        stack.push(1);
        stack.push(2);
        stack.push(3);

        int popResult = stack.pop();

        Assert.assertEquals(popResult, 3);
        Assert.assertEquals(stack.size(), 2);

        popResult = stack.pop();

        Assert.assertEquals(popResult, 2);
        Assert.assertEquals(stack.size(), 1);

        popResult = stack.pop();

        Assert.assertEquals(popResult, 1);
        Assert.assertEquals(stack.size(), 0);
    }

    @Test
    public void peek() {
        stack.push(1);
        stack.push(2);
        stack.push(3);

        int peekResult = stack.peek();

        Assert.assertEquals(peekResult, 3);
        Assert.assertEquals(stack.size(), 3);
    }

    @After
    public void after() {
        stack = null;
    }
}
