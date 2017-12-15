package com.lanou3g.homework;

public class Worker extends Person implements UserInter {
    public Worker(String name, String userName, String password, String profession) {
        super(name, userName, password, profession);
    }

    @Override
    public void onLine() {
        System.out.println("开工了");
        strike();
    }

    @Override
    public void offLine() {
        System.out.println("下班了");
    }

    public void strike(){
        System.out.println("涨工资不存在?罢工:加班");
    }
}
