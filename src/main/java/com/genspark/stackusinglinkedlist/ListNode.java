package com.genspark.stackusinglinkedlist;

public class ListNode {

    private int data;
    private ListNode next;

    public ListNode(int data){
        if(data<0) return;
        this.data = data;
    }

    public int getData(){
        return data;
    }

//    public void setData(){
//        if(data<0) return;
//        this.data = data;
//    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }

}
