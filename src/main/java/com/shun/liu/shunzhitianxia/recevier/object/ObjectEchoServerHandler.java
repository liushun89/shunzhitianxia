package com.shun.liu.shunzhitianxia.recevier.object;

import com.shun.liu.shunzhitianxia.bean.ClientRequest;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;

public class ObjectEchoServerHandler extends ChannelInboundHandlerAdapter {

    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) {
        // Echo back the received object to the client.
        if(msg instanceof ClientRequest){
            System.out.println(msg);
//            ServerResponse serverResponse = new ServerResponse();
//            serverResponse.setCode(200);
//            serverResponse.setMsg("ok");
//            ctx.write(serverResponse);
            ctx.writeAndFlush("ok");
        }

    }

    @Override
    public void channelReadComplete(ChannelHandlerContext ctx) {
        ctx.flush();
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) {
        cause.printStackTrace();
        ctx.close();
    }
}
