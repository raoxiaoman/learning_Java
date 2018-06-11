package com.raohui;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSocketTest {

    private BufferedReader bufferedReader;
    private ServerSocket serverSocket;
    private Socket socket;

    private void printMessage(){
        try {
            String temp = "";
            while((temp = bufferedReader.readLine())!=null){
                System.out.println(temp);
            }
        } catch(Exception e){
            e.printStackTrace();
        }
        try {
            if(bufferedReader != null){
                bufferedReader.close();
            }
            if(socket!=null){
                socket.close();
            }
        } catch(Exception e){
            e.printStackTrace();
        }
    }
    private void getServer(){
        try {
            serverSocket = new ServerSocket(6899);
            System.out.println("创建套接字！");
            while(true){
                System.out.println("等待客户端连接！");
                socket = serverSocket.accept();
                bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                printMessage();

            }
        } catch(Exception e){
            e.printStackTrace();
        }

    }
    public static void main(String[] args) {
        new ServerSocketTest().getServer();
    }
}
