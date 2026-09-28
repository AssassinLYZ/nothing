
//	此资源由 58学课资源站 收集整理
//	想要获取完整课件资料 请访问：58xueke.com
//	百万资源 畅享学习
package com.imooc.test.threads;

import java.util.UUID;
import java.util.concurrent.Callable;

public class CallableClass_01 implements Callable<Object> {

    @Override
    public Object call() throws Exception {

        System.out.println("我运行了。。。CallableClass_01的编号为："
                + Thread.currentThread().getId());

        return UUID.randomUUID().toString();
    }
}
