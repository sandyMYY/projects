package com.za.baowatools.dal.mapper;

import com.za.baowatools.dal.domain.SecondRuleDO;
import com.za.baowatools.dal.domain.SecondRuleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SecondRuleMapper {
    long countByExample(SecondRuleExample example);

    int deleteByExample(SecondRuleExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SecondRuleDO record);

    int insertSelective(SecondRuleDO record);

    List<SecondRuleDO> selectByExample(SecondRuleExample example);

    SecondRuleDO selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SecondRuleDO record, @Param("example") SecondRuleExample example);

    int updateByExample(@Param("record") SecondRuleDO record, @Param("example") SecondRuleExample example);

    int updateByPrimaryKeySelective(SecondRuleDO record);

    int updateByPrimaryKey(SecondRuleDO record);
}