package com.lanou3g.study;

public class Main3 {
    private static int num;

    public static void main(String[] args) {
        num = 100000;
startOneThread();
startOneThread();
startOneThread();
startOneThread();

    }
    private static void startOneThread(){
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 25000; i++) {
                    System.out.println(--num);
                }
            }
        }).start();
    }





}
