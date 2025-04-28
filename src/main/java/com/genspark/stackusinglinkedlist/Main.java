package com.genspark.stackusinglinkedlist;

public class Main {
    public static void main(String[] args) {

        Stack stack = new Stack();
        stack.isEmpty();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.peek());
        stack.pop();
        stack.pop();
        System.out.println(stack.peek());


    }
}