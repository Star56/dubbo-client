package com.qiwenfei.dubbo;

/**
 * 2018/6/27
 * sunshine
 * 客户端服务降级类
 */
public class TestMock implements IHello {
    @Override
    public String sayHello(String s) {
        return "系统繁忙：hello";
    }
}
