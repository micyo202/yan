package com.yan.netty.client;

import io.netty.bootstrap.Bootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;

import java.net.InetSocketAddress;

public class Client {

    private final String host;
    private final int port;

    public Client(String host, int port) {
        this.host = host;
        this.port = port;
    }

    public void start() throws Exception {
        EventLoopGroup group = new NioEventLoopGroup();
        try {
            Bootstrap b = new Bootstrap();
            b.group(group) // 绑定线程池
                    .channel(NioSocketChannel.class)  // 使用NioSocketChannel来作为连接用的channel类
                    .remoteAddress(new InetSocketAddress(this.host, this.port)) // 绑定连接端口和host信息
                    .handler(new ChannelInitializer<SocketChannel>() { // 绑定连接初始化器

                        @Override
                        protected void initChannel(SocketChannel socketChannel) throws Exception {
                            System.out.println("Client initChannel()... connected");
                            socketChannel.pipeline().addLast(new ClientHandler());
                        }
                    });
            System.out.println("Client create... ");
            ChannelFuture channelFuture = b.connect().sync();    // 异步连接服务器
            System.out.println("Client connected... ");   // 连接完成
            channelFuture.channel().closeFuture().sync();   // 异步等待关闭连接channel
            System.out.println("Client closed.. "); // 关闭完成
        } finally {
            group.shutdownGracefully().sync();  // 释放线程池资源
        }
    }

    public static void main(String[] args) {
        try {
            new Client("127.0.0.1", 65535).start(); // 连接127.0.0.1/65535，并启动
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

}
