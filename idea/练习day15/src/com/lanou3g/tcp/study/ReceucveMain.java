package com.lanou3g.tcp.study;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ReceucveMain {
    public static void main(String[] args) throws IOException {


        ServerSocket ss = new ServerSocket(9999);

        Socket socket = ss.accept();
        InputStream is = socket.getInputStream();
    }
}