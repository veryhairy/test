package com.lanou3g.homework;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class zhangSan {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("192.168.20.216",4567);
        Scanner input = new Scanner(System.in);

        InputStream is = socket.getInputStream();
        OutputStream os = socket.getOutputStream();



    }
}
