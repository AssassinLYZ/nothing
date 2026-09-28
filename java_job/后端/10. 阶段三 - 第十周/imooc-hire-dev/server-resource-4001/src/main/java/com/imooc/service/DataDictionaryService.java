
//	此资源由 58学课资源站 收集整理
//	想要获取完整课件资料 请访问：58xueke.com
//	百万资源 畅享学习
package com.imooc.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.imooc.pojo.DataDictionary;
import com.imooc.pojo.bo.DataDictionaryBO;
import com.imooc.utils.PagedGridResult;

import java.util.List;

/**
 * <p>
 * 数据字典表 服务类
 * </p>
 *
 * @author 风间影月
 * @since 2022-09-04
 */
public interface DataDictionaryService {

    /**
     * 根据Id获得数据字典
     * @param dictId
     * @return
     */
    public DataDictionary getDataDictionary(String dictId);

    /**
     * 创建或者更新数据字典
     * @param dataDictionaryBO
     */
    public void createOrUpdateDataDictionary(DataDictionaryBO dataDictionaryBO);


    /**
     * 根据字典类别或者字典值查询列表
     * @param typeName
     * @param itemValue
     * @param page
     * @param limit
     * @return
     */
    public PagedGridResult getDataDictListPaged(String typeName,
                                                String itemValue,
                                                Integer page,
                                                Integer limit);

    /**
     * 删除数据字典
     * @param dictId
     */
    public void deleteDataDictionary(String dictId);

    /**
     * 根据字典码获得数据字典列表
     * @param typeCode
     * @return
     */
    public List<DataDictionary> getDataByCode(String typeCode);

}
