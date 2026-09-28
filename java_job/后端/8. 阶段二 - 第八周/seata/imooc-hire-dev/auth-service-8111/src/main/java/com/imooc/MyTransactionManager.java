
//	此资源由 58学课资源站 收集整理
//	想要获取完整课件资料 请访问：58xueke.com
//	百万资源 畅享学习
package com.imooc;

import com.imooc.mq.InitResumeMQProducerHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.stereotype.Component;
import org.springframework.transaction.support.DefaultTransactionStatus;

import javax.sql.DataSource;

@Component
public class MyTransactionManager extends DataSourceTransactionManager {

    @Autowired
    public InitResumeMQProducerHandler producerHandler;

    public MyTransactionManager(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    protected void doCommit(DefaultTransactionStatus status) {
        try {
            super.doCommit(status);
        } finally {
            // 在事务提交以后，发送ThreadLocal中的消息（这些消息都是当前线程下未发送的）
            producerHandler.sendAllLocalMsg();
        }
    }

}
