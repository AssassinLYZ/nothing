
//	此资源由 58学课资源站 收集整理
//	想要获取完整课件资料 请访问：58xueke.com
//	百万资源 畅享学习
package com.imooc.mapper;

import com.imooc.pojo.Industry;
import com.imooc.pojo.vo.TopIndustryWithThirdListVO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * 行业表 Mapper 接口
 * </p>
 *
 * @author 风间影月
 * @since 2022-09-04
 */
@Repository
public interface IndustryMapperCustom {

    public List<Industry> getThirdIndustryByTop(
            @Param("paramMap") Map<String, Object> map);

    public String getTopIndustryId(
            @Param("paramMap") Map<String, Object> map);

    public List<TopIndustryWithThirdListVO> getAllThirdIndustryList();


}
