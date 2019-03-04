package com.diligencetrack.diligenceservice.impl;

import com.diligencetrack.diligencedao.SysAdminDao;
import com.diligencetrack.diligenceservice.SysAdminService;
import com.diligencetrack.model.entity.SysAdmin;

import java.util.List;

/**
 * Created by admin on 2019/2/25.
 */
public class SysAdminServiceImpl implements SysAdminService {

    private SysAdminDao adminDao;

    public SysAdminDao getAdminDao() {
        return adminDao;
    }

    public void setAdminDao(SysAdminDao adminDao) {
        this.adminDao = adminDao;
    }

    @Override
    public List<SysAdmin> selectAdmins(SysAdmin admin) {
        List<SysAdmin> adminList = adminDao.selectAdmins(admin);
        return adminList;
    }

    @Override
    public SysAdmin getAdminById(Integer adminId) {
        return null;
    }

    @Override
    public Integer countTotal(SysAdmin admin) {
        return adminDao.countTotal(admin);
    }

    @Override
    public Integer insertAdmin(SysAdmin admin) {
        return null;
    }

    @Override
    public Integer updateAdmin(SysAdmin admin) {
        return null;
    }

    @Override
    public Integer delAdminById(Integer id) {
        return null;
    }

    @Override
    public SysAdmin login(String adminName, String adminPwd) {
        return null;
    }
}
