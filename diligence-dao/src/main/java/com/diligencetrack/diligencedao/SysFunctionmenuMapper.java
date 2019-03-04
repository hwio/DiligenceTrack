package com.diligencetrack.diligencedao;

import com.diligencetrack.diligenceentity.SysFunctionmenu;
import com.diligencetrack.diligenceentity.SysFunctionmenuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysFunctionmenuMapper {
    int countByExample(SysFunctionmenuExample example);

    int deleteByExample(SysFunctionmenuExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SysFunctionmenu record);

    int insertSelective(SysFunctionmenu record);

    List<SysFunctionmenu> selectByExample(SysFunctionmenuExample example);

    SysFunctionmenu selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SysFunctionmenu record, @Param("example") SysFunctionmenuExample example);

    int updateByExample(@Param("record") SysFunctionmenu record, @Param("example") SysFunctionmenuExample example);

    int updateByPrimaryKeySelective(SysFunctionmenu record);

    int updateByPrimaryKey(SysFunctionmenu record);
}