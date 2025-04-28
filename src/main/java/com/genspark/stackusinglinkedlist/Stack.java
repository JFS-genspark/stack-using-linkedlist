package com.genspark.stackusinglinkedlist;

public class Stack {

    LinkedList stackStructure;

    public Stack(){
        stackStructure = new LinkedList();
    }

    void push(int data){
        stackStructure.addElementAtHead(data);
    }

    void pop(){
        if(!stackStructure.isEmpty()){
            stackStructure.skipElement();
        } else {
            System.out.println("Your stack is empty, pop function cannot be done.");
        }
    }

    int peek(){
        return stackStructure.getFirstElementOfTheList();
    }

    void isEmpty(){
        stackStructure.isEmpty();
    }
}
