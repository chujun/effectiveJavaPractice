package com.jun.chu.java.book.rule6_remove_expiration_object_reference;

import java.util.Arrays;
import java.util.EmptyStackException;

/**
 * MemoryLeakDemo
 * Created by chujun on 16/7/12.
 * 这里有内存泄漏
 */
public class Stack {
    private Object[] elements;

    private int current_location = 0;

    private static final int DEFAULT_INITIAL_CAPACITY = 16;

    public Stack() {
        elements = new Object[DEFAULT_INITIAL_CAPACITY];
    }

    public void push(Object e) {
        ensureCapacity();
        elements[current_location++] = e;
    }

    public Object pop() {
        if (0 == current_location) {
            throw new EmptyStackException();
        }
        return elements[--current_location];
    }

    private void ensureCapacity() {
        if (current_location == elements.length) {
            elements = Arrays.copyOf(elements, 2 * current_location + 1);
        }
    }

    public static void main(String[] args){
        Stack stack=new Stack();
        stack.push("a");
        stack.push("a");
        System.out.println(stack.pop());
    }
}
