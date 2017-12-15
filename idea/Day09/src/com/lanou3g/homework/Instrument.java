package com.lanou3g.homework;

public class Instrument {
    /*
    public static boolean instrument (String string){
        int sum = 0;
        for (int i = 'A';i<='Z';i++){
            char c = (char) i;
            sum  = sum + string.indexOf(c) + 1;
            if(sum > 0){
                sum = 1;
                break;
            }
        }
        int sum1 = 0;
        for (int i = 'a';i<='z';i++){
            char c = (char) i;
            sum1  = sum1 + string.indexOf(c) + 1;
            if (sum1 > 0){
                sum1 = 1;
                break;
            }
        }
        int sum2 = 0;
        for (int i = 0; i <10 ; i++) {
            String str = i+"";
            sum2 = sum2+string.indexOf(str) + 1;
            if(sum2 > 0){
                sum2 = 1;
                break;
            }
        }
        if(sum+sum1+sum2 < 2) {
            return true;
        }
        return false;
    }
    */
    public static boolean instrument (String string){
        int sum1 = 0;
        int sum2 = 0;
        int sum3 = 0;
        for (char i = 'A';i<='Z';i++){
            String s = i + "";
            if (string.contains(s)) {
                sum1++;
            }
            if (sum1 > 0)
                break;
        }

        for (char i = 'a';i<='z';i++){
            String s = i + "";
            if (string.contains(s)) {
                sum2++;
            }
            if (sum2 > 0)
                break;
        }

        for (int i = 0; i <10 ; i++) {
            String str = i+"";
            if (string.contains(str)) {
                sum3++;
            }
            if (sum3 > 0)
                break;
        }
        if(sum3+sum1+sum2 < 2) {
            return true;
        }
        return false;
    }
}
