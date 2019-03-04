package com.diligencetrack.diligenceservice.impl;


import com.diligencetrack.diligencedao.SysSoftwareseteupDao;
import com.diligencetrack.diligenceservice.SysSoftwareseteupService;
import com.diligencetrack.model.entity.SysSoftwareseteup;

import java.util.List;

/**
 * Created by admin on 2019/2/25.
 */
public class SysSoftwareseteupServiceImpl implements SysSoftwareseteupService {

    private SysSoftwareseteupDao sysSoftwareseteupDao;

    public SysSoftwareseteupDao getSysSoftwareseteupDao() {
        return sysSoftwareseteupDao;
    }

    public void setSysSoftwareseteupDao(SysSoftwareseteupDao sysSoftwareseteupDao) {
        this.sysSoftwareseteupDao = sysSoftwareseteupDao;
    }

    @Override
    public List<SysSoftwareseteup> selectSoftwareseteups(SysSoftwareseteup softwareseteup) {
        List<SysSoftwareseteup> softwareseteups = sysSoftwareseteupDao.selectSoftwareseteups(softwareseteup);
        return softwareseteups;
    }

    @Override
    public SysSoftwareseteup getSoftwareseteupById(Integer softwareseteupId) {
        return null;
    }

    @Override
    public Integer countTotal(SysSoftwareseteup softwareseteup) {
        return sysSoftwareseteupDao.countTotal(softwareseteup);
    }

    @Override
    public Integer insertSoftwareseteup(SysSoftwareseteup softwareseteup) {
        return null;
    }

    @Override
    public Integer updateSoftwareseteup(SysSoftwareseteup softwareseteup) {
        return null;
    }

    @Override
    public Integer delSoftwareseteupById(Integer id) {
        return null;
    }
}
