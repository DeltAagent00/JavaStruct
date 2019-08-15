package com.homedev.structure.Lesson_3;

import com.homedev.structure.Lesson_3.stack.Stack;
import com.homedev.structure.Lesson_3.stack.StackImpl;

public class Main {
    public static void main( String[] args ) {
        final String origString = "Hello world";
        final Stack<Character> stack = new StackImpl<>(origString.length());

        for(int i = 0; i < origString.length(); ++i) {
            final char ch = origString.charAt(i);
            stack.push(ch);
        }

        StringBuilder outString = new StringBuilder();

        while (!stack.isEmpty()) {
            outString.append(stack.pop());
        }
        System.out.println("origin string = " + origString);
        System.out.println("revers String = " + outString);
    }
}
