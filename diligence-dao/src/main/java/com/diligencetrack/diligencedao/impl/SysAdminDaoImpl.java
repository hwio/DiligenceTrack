package com.diligencetrack.diligencedao.impl;


import com.diligencetrack.diligencedao.SysAdminDao;
import com.diligencetrack.diligencedao.mapper.SysAdminMapper;
import com.diligencetrack.model.entity.SysAdmin;

import java.util.List;

/**
 * Created by admin on 2019/2/25.
 */
public class SysAdminDaoImpl implements SysAdminDao {

    private SysAdminMapper mapper;

    @Override
    public List<SysAdmin> selectAdmins(SysAdmin admin) {
        return mapper.selectAdmins(admin);
    }

    @Override
    public SysAdmin getAdminById(Integer adminId) {
        return mapper.getAdminById(adminId);
    }

    @Override
    public Integer countTotal(SysAdmin admin) {
        return mapper.countTotal(admin);
    }

    @Override
    public Integer insertAdmin(SysAdmin admin) {
        return mapper.insertAdmin(admin);
    }

    @Override
    public Integer updateAdmin(SysAdmin admin) {
        return mapper.updateAdmin(admin);
    }

    @Override
    public Integer delAdminById(Integer id) {
        return mapper.delAdminById(id);
    }

    @Override
    public SysAdmin login(String adminName, String adminPwd) {
        return mapper.login(adminName, adminPwd);
    }
}
