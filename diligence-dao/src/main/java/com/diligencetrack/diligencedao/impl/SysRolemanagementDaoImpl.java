package com.diligencetrack.diligencedao.impl;

import com.diligencetrack.diligencedao.SysRolemanagementDao;
import com.diligencetrack.diligencedao.mapper.SysRolemanagementMapper;
import com.diligencetrack.model.entity.SysRolemanagement;

import java.util.List;

/**
 * Created by admin on 2019/2/25.
 */
public class SysRolemanagementDaoImpl implements SysRolemanagementDao{

    private SysRolemanagementMapper mapper;

    @Override
    public List<SysRolemanagement> selectRolemanagements(SysRolemanagement rolemanagement) {
        return mapper.selectRolemanagements(rolemanagement);
    }

    @Override
    public SysRolemanagement getRolemanagementById(Integer rolemanagementId) {
        return mapper.getRolemanagementById(rolemanagementId);
    }

    @Override
    public Integer countTotal(SysRolemanagement rolemanagement) {
        return mapper.countTotal(rolemanagement);
    }

    @Override
    public Integer insertRolemanagement(SysRolemanagement rolemanagement) {
        return mapper.insertRolemanagement(rolemanagement);
    }

    @Override
    public Integer updateRolemanagement(SysRolemanagement rolemanagement) {
        return mapper.updateRolemanagement(rolemanagement);
    }

    @Override
    public Integer delRolemanagementById(Integer id) {
        return mapper.delRolemanagementById(id);
    }
}
