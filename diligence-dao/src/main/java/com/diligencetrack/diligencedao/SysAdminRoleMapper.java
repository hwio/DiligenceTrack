package com.diligencetrack.diligencedao;

import com.diligencetrack.diligenceentity.SysAdminRole;
import com.diligencetrack.diligenceentity.SysAdminRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysAdminRoleMapper {
    int countByExample(SysAdminRoleExample example);

    int deleteByExample(SysAdminRoleExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SysAdminRole record);

    int insertSelective(SysAdminRole record);

    List<SysAdminRole> selectByExample(SysAdminRoleExample example);

    SysAdminRole selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SysAdminRole record, @Param("example") SysAdminRoleExample example);

    int updateByExample(@Param("record") SysAdminRole record, @Param("example") SysAdminRoleExample example);

    int updateByPrimaryKeySelective(SysAdminRole record);

    int updateByPrimaryKey(SysAdminRole record);
}