package com.zhangpan.io.bio;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * BIO通信的服务端
 */
public class Server {
  public static void main(String[] args) throws IOException {
    // 服务端启动服务
    ServerSocket serverSocket = new ServerSocket();
    // 服务端监听端口
    serverSocket.bind(new InetSocketAddress(20001));
    System.out.println("Start server...");
    try {
      while (true) {
        new Thread(new ServerTask(serverSocket.accept())).start();
      }
    } finally {
      serverSocket.close();
    }
  }

  private static class ServerTask implements Runnable {

    private final Socket socket;

    public ServerTask(Socket socket) {
      this.socket = socket;
    }

    @Override public void run() {
      try(ObjectInputStream inputStream = new ObjectInputStream(socket.getInputStream());
          ObjectOutputStream outputStream = new ObjectOutputStream(socket.getOutputStream())) {
        // 接收客户端的输入内容
        String name = inputStream.readUTF();
        System.out.println(name + "连接了服务");
        // 服务器端的输出内容
        outputStream.writeUTF("Hello " + name);
        outputStream.flush();
      } catch (IOException e) {
        e.printStackTrace();
      } finally {
        try {
          socket.close();
        } catch (IOException e) {
          e.printStackTrace();
        }
      }
    }
  }
}
