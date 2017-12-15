package com.lanou3g.homework;

public class Cooker extends Person implements UserInter {
    public Cooker(String name, String userName, String password, String profession) {
        super(name, userName, password, profession);
    }
    @Override
    public void onLine() {
        System.out.println("开工了");
        tossTheWok();
    }

    @Override
    public void offLine() {
        System.out.println("下班了");
    }

    public void tossTheWok(){
        System.out.println("颠勺好累的说");
    }
}
