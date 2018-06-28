package com.qiwenfei.dubbo;

import com.alibaba.dubbo.common.extension.ExtensionLoader;
import com.alibaba.dubbo.rpc.Protocol;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException {
/*        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("dubbo-client.xml");

         IHello iHello = (IHello) context.getBean("helloService");

        System.out.println(iHello.sayHello(" qi"));*/
/*        System.out.println(ExtensionLoader.getExtensionLoader(Protocol.class).
                getDefaultExtension().getDefaultPort());*/

        System.out.println(ExtensionLoader.getExtensionLoader(Protocol.class)
                .getExtension("myProtocol").getDefaultPort());
    }
}