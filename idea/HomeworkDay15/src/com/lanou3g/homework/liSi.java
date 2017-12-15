package com.lanou3g.homework;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class liSi {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(4567);
        Scanner input = new Scanner(System.in);
        Socket s = ss.accept();

        InputStream is = s.getInputStream();
        OutputStream os = s.getOutputStream();



    }
}
