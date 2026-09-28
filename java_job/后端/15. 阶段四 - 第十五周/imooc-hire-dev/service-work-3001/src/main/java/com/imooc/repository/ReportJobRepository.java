
//	此资源由 58学课资源站 收集整理
//	想要获取完整课件资料 请访问：58xueke.com
//	百万资源 畅享学习
package com.imooc.repository;

import com.imooc.pojo.mo.ReportMO;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReportJobRepository extends MongoRepository<ReportMO, String> {

    public ReportMO findByReportUserIdAndJobId(String reportUserId, String jobId);

}
