package com.homedev.structure.Lesson_4;

import com.homedev.structure.Lesson_4.linkedlist.*;

public class Main {
    public static void main(String[] args) {
        testSimpleLinkedList();
        System.out.println("-----------");
        testTwoSideLinkedList();
    }

    private static void testSimpleLinkedList() {
        LinkedList<Integer> linkedList = new SimpleLinkedList<>();
        linkedList.insertFirst(1);
        linkedList.insertFirst(2);
        linkedList.insertFirst(3);
        linkedList.insertFirst(4);

        for (int i : linkedList){
            System.out.println(i);
        }
    }

    private static void testTwoSideLinkedList() {
        TwoSideLinkedList<Integer> linkedList = new TwoSideLinkedListImpl<>();
        linkedList.insertFirst(1);//1
        linkedList.insertLast(2);//1 2
        linkedList.insertFirst(3);//3 1 2
        linkedList.insertLast(4);//3 1 2 4

        for(int i : linkedList) {
            System.out.println(i);
        }
    }
}
