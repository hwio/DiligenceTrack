package com.diligencetrack.diligencedao;

import com.diligencetrack.diligenceentity.SysLogginlog;
import com.diligencetrack.diligenceentity.SysLogginlogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysLogginlogMapper {
    int countByExample(SysLogginlogExample example);

    int deleteByExample(SysLogginlogExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SysLogginlog record);

    int insertSelective(SysLogginlog record);

    List<SysLogginlog> selectByExample(SysLogginlogExample example);

    SysLogginlog selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SysLogginlog record, @Param("example") SysLogginlogExample example);

    int updateByExample(@Param("record") SysLogginlog record, @Param("example") SysLogginlogExample example);

    int updateByPrimaryKeySelective(SysLogginlog record);

    int updateByPrimaryKey(SysLogginlog record);
}