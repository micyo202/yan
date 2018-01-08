package com.yan.netty.server;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioServerSocketChannel;


public class Server {

    private final int port;

    public Server(int port) {
        this.port = port;
    }

    // 启动服务方法
    public void start() throws Exception {
        EventLoopGroup group = new NioEventLoopGroup();
        try {
            ServerBootstrap sb = new ServerBootstrap();
            sb.group(group) // 绑定线程池
                    .channel(NioServerSocketChannel.class)  // 指定nio类型的channel
                    .localAddress(this.port)    // 绑定监听端口
                    .childHandler(new ChannelInitializer<SocketChannel>() { // 客户端有连接到达时会创建一个channel

                        @Override
                        protected void initChannel(SocketChannel socketChannel) throws Exception {
                            System.out.println("Server connected... Client: " + socketChannel.remoteAddress());
                            // pipeline管理channel中的Handler，在channel队列中添加一个handler来处理业务
                            socketChannel.pipeline().addLast(new ServerHandler());  // 客户端触发操作
                        }
                    });
            ChannelFuture channelFuture = sb.bind().sync();    // 配置完成，开始绑定server，通过调用sync同步方法阻塞直到绑定成功
            System.out.println("Server " + Server.class + " started and listen on " + channelFuture.channel().localAddress());
            channelFuture.channel().closeFuture().sync();   // 应用程序会一直等待，直到channel关闭
        } finally {
            group.shutdownGracefully().sync();  //关闭EventLoopGroup，释放掉所有资源包括创建的线程
        }
    }

    public static void main(String[] args) {
        try {
            new Server(65535).start();  // 启动
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

}
