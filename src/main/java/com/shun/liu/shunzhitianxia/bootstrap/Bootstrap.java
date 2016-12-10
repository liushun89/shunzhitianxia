package com.shun.liu.shunzhitianxia.bootstrap;

import com.shun.liu.shunzhitianxia.recevier.object.ObjectEchoServer;
import com.shun.liu.shunzhitianxia.util.NetUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by liushun on 16/12/6.
 */
public class Bootstrap {
    private static final Logger logger = LoggerFactory.getLogger(Bootstrap.class);

    public static void main(String[] args) throws Exception {
        int port = NetUtils.getAvailablePort(18800);
        logger.info(String.format("服务端端口为:%d",port));
        ObjectEchoServer.startServer(port);

        System.out.println("开始");
    }
}
