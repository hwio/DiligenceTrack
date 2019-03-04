package com.diligencetrack.diligencedao;

import com.diligencetrack.diligenceentity.SysAdmin;
import com.diligencetrack.diligenceentity.SysAdminExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysAdminMapper {
    int countByExample(SysAdminExample example);

    int deleteByExample(SysAdminExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SysAdmin record);

    int insertSelective(SysAdmin record);

    List<SysAdmin> selectByExample(SysAdminExample example);

    SysAdmin selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SysAdmin record, @Param("example") SysAdminExample example);

    int updateByExample(@Param("record") SysAdmin record, @Param("example") SysAdminExample example);

    int updateByPrimaryKeySelective(SysAdmin record);

    int updateByPrimaryKey(SysAdmin record);
}