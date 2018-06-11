package com.raohui;
import java.io.PrintWriter;
import java.net.Socket;

public class ClientSocketTest {

    private PrintWriter printWriter; 
    private Socket socket;
    private void writeSomething(){
       for (int i = 0; i < 10; i++) {
           printWriter.println("client send "+i);
       }
       try {
           if(printWriter != null){
               printWriter.close();
           }
           if(socket !=null ){
               socket.close();
           }
       } catch(Exception e){
           e.printStackTrace();
       }
    }
    private void connect(){
        System.out.println("尝试连接！");
        try {
            socket = new Socket("127.0.0.1",6899); 
            printWriter = new PrintWriter(socket.getOutputStream());
        } catch(Exception e){
            e.printStackTrace();
        }
        System.out.println("连接完成！");
        writeSomething();
        System.out.println("发送完毕!");

    }
    public static void main(String[] args) {
        ClientSocketTest test = new ClientSocketTest();
        test.connect();
    }
}
