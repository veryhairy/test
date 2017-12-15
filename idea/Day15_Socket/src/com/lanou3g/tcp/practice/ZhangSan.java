package com.lanou3g.tcp.practice;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class ZhangSan {
    public static void main(String[] args) throws IOException {
        //把张三写成发送方
        Socket socket = new Socket("192.168.20.216", 1111);
        Scanner input = new Scanner(System.in);

        InputStream is = socket.getInputStream();
        OutputStream os = socket.getOutputStream();

        byte[] buff = new byte[1024];
        String send = "";
        while (!(send = input.nextLine()).equals("quit")) {
            //如果输出的内容不是quit，那么程序继续
            os.write(send.getBytes());

            int l = is.read(buff);
            System.out.println(new String(buff,0,l));
    }
            //如果输入了quit，则循环会停止
            //那么关闭了这个socket
            socket.close();


    }
}
