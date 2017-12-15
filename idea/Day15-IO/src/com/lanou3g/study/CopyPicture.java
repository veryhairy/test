package com.lanou3g.study;

import java.io.*;

public class CopyPicture {
    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("src/23232.JPG");
        byte[] buff = new byte[1024*1024*10];
        fis.read(buff);

        FileOutputStream fos = new FileOutputStream("src/1234.JPG");
        fos.write(buff);
        fis.close();
        fos.close();


    }



}
