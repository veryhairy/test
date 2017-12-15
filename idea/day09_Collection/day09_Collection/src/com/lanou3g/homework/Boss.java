package com.lanou3g.homework;

public class Boss extends Person implements UserInter {
    public Boss(String name, String userName, String password, String profession) {
        super(name, userName, password, profession);
    }
    @Override
    public void onLine() {
        System.out.println("开工了");
        addMoney();
    }

    @Override
    public void offLine() {
        System.out.println("下班了");
    }

    public void addMoney(){
        System.out.println("太阳西边升起?涨工资:不存在的");
    }
}
