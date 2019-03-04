package com.diligencetrack.diligencedao.mapper;

import com.diligencetrack.model.entity.SysRolemanagement;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by admin on 2019/2/25.
 */
public interface SysRolemanagementMapper {
    public List<SysRolemanagement> selectRolemanagements(@Param("rolemanagement") SysRolemanagement rolemanagement);
    public SysRolemanagement getRolemanagementById(@Param("rolemanagementId") Integer rolemanagementId);
    public Integer countTotal(@Param("rolemanagement") SysRolemanagement rolemanagement);
    public Integer insertRolemanagement(@Param("rolemanagement") SysRolemanagement rolemanagement);
    public Integer updateRolemanagement(@Param("rolemanagement") SysRolemanagement rolemanagement);
    public Integer delRolemanagementById(@Param("id") Integer id);
}
