
//	此资源由 58学课资源站 收集整理
//	想要获取完整课件资料 请访问：58xueke.com
//	百万资源 畅享学习
package com.imooc.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.imooc.pojo.MqLocalMsgRecord;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 风间影月
 * @since 2022-11-09
 */
public interface MqLocalMsgRecordService extends IService<MqLocalMsgRecord> {

    /**
     * 批量根据id获得记录列表
     * @param msgIds
     * @return
     */
    public List<MqLocalMsgRecord> getBatchLocalMsgRecordList(List<String> msgIds);

}
