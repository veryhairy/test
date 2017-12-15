package com.lanou3g.study;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Gather {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Nice_try");
        list.add("liupeng");
        list.add("c");
        int i = new Random().nextInt(3);
        System.out.println(list.get(i));
        System.out.println(list);
        list.remove(2);
        System.out.println(list);
    }


}
