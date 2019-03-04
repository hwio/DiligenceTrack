package com.diligencetrack.diligenceservice.impl;


import com.diligencetrack.diligencedao.SysRolemanagementDao;
import com.diligencetrack.diligenceservice.SysRolemanagementService;
import com.diligencetrack.model.entity.SysRolemanagement;

import java.util.List;

/**
 * Created by admin on 2019/2/25.
 */
public class SysRolemanagementServiceImpl implements SysRolemanagementService {

    private SysRolemanagementDao rolemanagementDao;

    public SysRolemanagementDao getRolemanagementDao() {
        return rolemanagementDao;
    }

    public void setRolemanagementDao(SysRolemanagementDao rolemanagementDao) {
        this.rolemanagementDao = rolemanagementDao;
    }

    @Override
    public List<SysRolemanagement> selectRolemanagements(SysRolemanagement rolemanagement) {
        List<SysRolemanagement> rolemanagements = rolemanagementDao.selectRolemanagements(rolemanagement);
        return rolemanagements;
    }

    @Override
    public SysRolemanagement getRolemanagementById(Integer rolemanagementId) {
        return null;
    }

    @Override
    public Integer countTotal(SysRolemanagement rolemanagement) {
        return rolemanagementDao.countTotal(rolemanagement);
    }

    @Override
    public Integer insertRolemanagement(SysRolemanagement rolemanagement) {
        return null;
    }

    @Override
    public Integer updateRolemanagement(SysRolemanagement rolemanagement) {
        return null;
    }

    @Override
    public Integer delRolemanagementById(Integer id) {
        return null;
    }
}
