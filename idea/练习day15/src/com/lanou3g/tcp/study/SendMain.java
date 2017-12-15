package com.lanou3g.tcp.study;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class SendMain {
    public static void main(String[] args) throws IOException {

        Socket socket = new Socket("192.168.20.216",9999);

        OutputStream os = socket.getOutputStream();
        os.write("你个蠢货".getBytes());
        socket.close();

    }
}
