
//	此资源由 58学课资源站 收集整理
//	想要获取完整课件资料 请访问：58xueke.com
//	百万资源 畅享学习
package com.imooc.test.threads;

public class RunnableClass_02 implements Runnable {

    @Override
    public void run() {
        System.out.println("我运行了。。。RunnableClass_02的编号为："
                + Thread.currentThread().getId());
    }

}
