package com.lanou3g.study;

public class Main {

    private static Thread thread;

    public static void main(String[] args) {
        thread= new HelloThread();
//        thread = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                for (int i = 0; i < 5000; i++) {
//                    System.out.println("匿名内部类中的run"+i);
//                }
//            }
//        });
//        thread = new Thread(){
//            @Override
//            public void run() {
//                super.run();
//            }
//        };
        thread.run();
        for (int i = 0; i < 5000; i++) {
            System.out.println(Thread.currentThread().getName()+"----"+i);
        }






    }

}
