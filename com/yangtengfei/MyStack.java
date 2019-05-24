package com.yangtengfei;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Vector;

public class MyStack {
    private int maxSize;
    private long[] stackArray;
    private int top;
    public MyStack(int s) {
        maxSize = s;
        stackArray = new long[maxSize];
        top = -1;
    }
    public void push(long j) {
        stackArray[++top] = j;
    }
    public long pop() {
        return stackArray[top--];
    }
    public long peek() {
        return stackArray[top];
    }
    public boolean isEmpty() {
        return (top == -1);
    }
    public boolean isFull() {
        return (top == maxSize - 1);
    }
    public static void main(String[] args) {
        HashMap amap = new HashMap(){
            {
                put(1,"a");
            }
        };
        HashMap bmap = new HashMap();
        bmap.put("b",new HashMap(){
            {
                put(1,"a");
            }
        });
        System.out.println(bmap);
        System.out.println(amap==bmap);
        System.out.println(amap.equals(bmap));
        HashSet<Integer> hset = new HashSet<Integer>();
        hset.add(Integer.valueOf('a'));
        System.out.println(hset.add(1));
        System.out.println(hset);
        Vector<String> v = new Vector();
        v.add("1");
        v.add("2");
        v.add("3");
        v.add("4");
        v.add("5");
        System.out.println(v);
        Collections.swap(v, 0, 2);
        System.out.println("旋转后");
        System.out.println(v);


        MyStack theStack = new MyStack(10);
        theStack.push(10);
        theStack.push(20);
        theStack.push(30);
        theStack.push(40);
        theStack.push(50);
        while (!theStack.isEmpty()) {
            long value = theStack.pop();
            System.out.print(value);
            System.out.print(" ");
        }
        System.out.println("");
    }
}
