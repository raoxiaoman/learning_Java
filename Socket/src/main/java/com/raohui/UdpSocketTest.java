package com.raohui;
import java.net.*;

class Server extends Thread{
    int port;
    InetAddress inetAddress = null;
    MulticastSocket socket = null;
    String info = "饶辉加油啊！";

    public Server(){
        port = 7999;
        try {
            inetAddress = InetAddress.getByName("224.225.10.1");
            socket = new MulticastSocket(port);
//            socket.setTimeToLive(1);
            socket.joinGroup(inetAddress);
            System.out.println(socket);
        } catch(Exception e){
            e.printStackTrace();
        }

    }
    public void run(){
        while(true){
            DatagramPacket datagramPacket = null;
            byte[] bytes = info.getBytes();
            datagramPacket = new DatagramPacket(bytes,bytes.length,inetAddress,port);
            System.out.println("server send!:"+info);
            try {
                socket.send(datagramPacket);
                sleep(2000);
            } catch(Exception e){
                e.printStackTrace();
            }
        }

    }
}


class Client extends Thread{
    int port;
    InetAddress inetAddress = null;
    MulticastSocket socket = null;
    public Client(){
        port = 7999;
        try {
            inetAddress = InetAddress.getByName("224.255.10.2");
            socket =  new MulticastSocket(port);
            socket.joinGroup(inetAddress);
            System.out.println(socket);
        } catch(Exception e){
            e.printStackTrace();
        }

    }
    public void run(){
        while(true){
            byte[] bytes = new byte[1024];
            DatagramPacket datagramPacket = new DatagramPacket(bytes,bytes.length);
            System.out.println("client start");
            try {
               socket.receive(datagramPacket); 
               String message = new String(datagramPacket.getData(),0,datagramPacket.getLength());
               System.out.println("client receive:"+message);
            } catch(Exception e){
                e.printStackTrace();
            }
        }
    }


}
class UpdGroupClient {
    private int MessageIndex = 0;
    private String ip = "224.0.0.1";//组播地址
    private int port = 6789;//指定数据接收端口
    private boolean closed = false;

    public void start() {
        new Thread(new Runnable() {

            public void run() {
                System.out.println("UpdGroupClient start ");
                runClient();
            }
        }).start();
    }

    MulticastSocket socket = null;

    public void runClient() {
        try {
            byte[] receiveBuffer = new byte[1024];
            DatagramPacket receivePacket = new DatagramPacket(receiveBuffer, receiveBuffer.length);
            InetAddress group = InetAddress.getByName(ip);
            socket = new MulticastSocket(port);
            socket.joinGroup(group);//加入组播地址
            while (!closed) {
                send();
                socket.receive(receivePacket);
                System.out.println("received packet from " + receivePacket.getAddress().getHostAddress() + " : " + receivePacket.getPort());
                String msg = new String(receivePacket.getData(), receivePacket.getOffset(), receivePacket.getLength());
                System.out.println("received " + msg);
                Thread.sleep(2000);
            }
            socket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 组播发送数据
     */
    public void send() {
        String msg = "message from client," + MessageIndex++;
        try {
            byte[] message = msg.getBytes(); //发送信息
            InetAddress inetAddress = InetAddress.getByName(ip); //指定组播地址
            DatagramPacket datagramPacket = new DatagramPacket(message, message.length, inetAddress, port); //发送数据包囊
            MulticastSocket multicastSocket = new MulticastSocket();//创建组播socket
            multicastSocket.send(datagramPacket);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (MessageIndex >= 50) {
            closed = true;
        }
    }

}

public class UdpSocketTest {

    public static void main(String[] args) {
        Server s = new Server();
        Client c = new Client();
        s.start();
        c.start();
//        UpdGroupClient updGroupClient = new UpdGroupClient();
//        updGroupClient.start();
    }
}
