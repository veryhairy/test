package com.lanou3g.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class RecieveMain {
    public static void main(String[] args) throws IOException {
        //定义一个ds监听8080端口

        DatagramSocket ds = new DatagramSocket(8080);

        byte[] buff = new byte[1024];

        //定义一个数据包，用来接收数据
        DatagramPacket dp = new DatagramPacket(buff,0,buff.length);

        while (true){
            //调用ds的方法riceive
            //会将ds接受到的数据，存到dp中
            ds.receive(dp);


            String hostName = dp.getAddress().getHostName();
            //根据获得的字节
            dp.getData();

            String data = new String(dp.getData(),0,dp.getLength());
            System.out.println(data+"---from"+hostName);
        }
        }

}
