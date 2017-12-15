package com.lanou3g.homework;

public class Doctor extends Person implements UserInter {
    public Doctor(String name, String userName, String password, String profession) {
        super(name, userName, password, profession);
    }
    @Override
    public void onLine() {
        System.out.println("开工了");
        operation();
    }

    @Override
    public void offLine() {
        System.out.println("下班了");
    }

    public void operation(){
        System.out.println("做个小手术玩玩");
    }

}
