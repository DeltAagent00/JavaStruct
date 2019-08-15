package com.homedev.structure;

import com.homedev.structure.Lesson_2.Array;
import com.homedev.structure.Lesson_2.MyArrayImpl;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for simple Main.
 */
public class Lesson_2_Test {
    private Array<Integer> array;

    @Before
    public void before() {
        array = new MyArrayImpl<>();
    }

    @Test
    public void add() {
        array.add(1);
        array.add(2);
        array.add(3);
        Assert.assertEquals(3, array.size());
    }

    @Test
    public void get() {
        array.add(1);
        Assert.assertEquals(1, array.get(0).intValue());
    }

    @Test
    public void contains1() {
        array.add(1);
        array.add(2);
        array.add(3);
        Assert.assertTrue(array.contains(2));
    }

    @Test
    public void contains2() {
        array.add(1);
        array.add(2);
        array.add(3);
        Assert.assertFalse(array.contains(4));
    }

    @Test
    public void indexOf() {
        array.add(1);
        array.add(2);
        array.add(3);
        Assert.assertEquals(1, array.indexOf(2));
    }

    @Test
    public void remove1() {
        array.add(1);
        array.add(2);
        array.add(3);

        Assert.assertTrue(array.remove(1));
    }

    @Test
    public void remove2() {
        array.add(1);
        array.add(2);
        array.add(3);

        array.remove(1);

        Assert.assertEquals(2, array.size());
    }

    @Test
    public void remove3() {
        array.add(1);
        array.add(2);
        array.add(3);

        array.remove((Integer) 2);

        Assert.assertEquals(2, array.size());
    }

    @After
    public void after() {
        array = null;
    }
}
