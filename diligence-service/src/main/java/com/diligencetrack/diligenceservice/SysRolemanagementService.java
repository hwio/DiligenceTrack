package com.diligencetrack.diligenceservice;

import com.diligencetrack.model.entity.SysRolemanagement;

import java.util.List;

/**
 * Created by admin on 2019/2/25.
 */
public interface SysRolemanagementService {
    public List<SysRolemanagement> selectRolemanagements(SysRolemanagement rolemanagement);
    public SysRolemanagement getRolemanagementById(Integer rolemanagementId);
    public Integer countTotal(SysRolemanagement rolemanagement);
    public Integer insertRolemanagement(SysRolemanagement rolemanagement);
    public Integer updateRolemanagement(SysRolemanagement rolemanagement);
    public Integer delRolemanagementById(Integer id);
}
