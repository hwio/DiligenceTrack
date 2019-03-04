package com.diligencetrack.diligencedao;

import com.diligencetrack.diligenceentity.SysSystemsteup;
import com.diligencetrack.diligenceentity.SysSystemsteupExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysSystemsteupMapper {
    int countByExample(SysSystemsteupExample example);

    int deleteByExample(SysSystemsteupExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SysSystemsteup record);

    int insertSelective(SysSystemsteup record);

    List<SysSystemsteup> selectByExample(SysSystemsteupExample example);

    SysSystemsteup selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SysSystemsteup record, @Param("example") SysSystemsteupExample example);

    int updateByExample(@Param("record") SysSystemsteup record, @Param("example") SysSystemsteupExample example);

    int updateByPrimaryKeySelective(SysSystemsteup record);

    int updateByPrimaryKey(SysSystemsteup record);
}