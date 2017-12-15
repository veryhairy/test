package com.lanou3g.study;

import com.lanou3g.study.syn.TicketDemo;

public class Main4 {

    public static void main(String[] args) {
        TicketDemo td = new TicketDemo();
        starSell(td);
        starSell(td);
        starSell(td);
        starSell(td);


    }
    private static void starSell(TicketDemo td){
        new Thread(new Runnable() {
            @Override
            public void run() {
                td.sellTicket();
            }
        }).start();
    }



}
