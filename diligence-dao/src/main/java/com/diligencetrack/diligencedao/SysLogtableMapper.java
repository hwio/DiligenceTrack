package com.diligencetrack.diligencedao;

import com.diligencetrack.diligenceentity.SysLogtable;
import com.diligencetrack.diligenceentity.SysLogtableExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysLogtableMapper {
    int countByExample(SysLogtableExample example);

    int deleteByExample(SysLogtableExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SysLogtable record);

    int insertSelective(SysLogtable record);

    List<SysLogtable> selectByExample(SysLogtableExample example);

    SysLogtable selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SysLogtable record, @Param("example") SysLogtableExample example);

    int updateByExample(@Param("record") SysLogtable record, @Param("example") SysLogtableExample example);

    int updateByPrimaryKeySelective(SysLogtable record);

    int updateByPrimaryKey(SysLogtable record);
}