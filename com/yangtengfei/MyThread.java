package com.yangtengfei;

import java.util.ArrayList;

class MyThread extends Thread{
    @Override
    public void run(){
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(1);
        arr.add(2);
        System.out.println(arr);
        System.out.println("Throwing in " +"MyThread");
        throw new RuntimeException();
    }
}
class Main {
    public static void main(String[] args){
        MyThread t = new MyThread();
        try{
            t.start();
            Thread.sleep(1000);
        }
        catch (Exception x){
            System.out.println("Caught it" + x);
        }
        System.out.println("Exiting main");
    }
}