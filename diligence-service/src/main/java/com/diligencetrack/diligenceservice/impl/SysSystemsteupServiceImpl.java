package com.diligencetrack.diligenceservice.impl;


import com.diligencetrack.diligencedao.SysSystemsteupDao;
import com.diligencetrack.diligenceservice.SysSystemsteupService;
import com.diligencetrack.model.entity.SysSystemsteup;

import java.util.List;

/**
 * Created by admin on 2019/2/25.
 */
public class SysSystemsteupServiceImpl implements SysSystemsteupService {

    private SysSystemsteupDao systemsteupDao;

    public SysSystemsteupDao getSystemsteupDao() {
        return systemsteupDao;
    }

    public void setSystemsteupDao(SysSystemsteupDao systemsteupDao) {
        this.systemsteupDao = systemsteupDao;
    }

    @Override
    public List<SysSystemsteup> selectSystemsteups(SysSystemsteup systemsteup) {
        List<SysSystemsteup> systemsteups = systemsteupDao.selectSystemsteups(systemsteup);
        return systemsteups;
    }

    @Override
    public SysSystemsteup getSystemsteupById(Integer systemsteupId) {
        return null;
    }

    @Override
    public Integer countTotal(SysSystemsteup systemsteup) {
        return systemsteupDao.countTotal(systemsteup);
    }

    @Override
    public Integer insertSystemsteup(SysSystemsteup systemsteup) {
        return null;
    }

    @Override
    public Integer updateSystemsteup(SysSystemsteup systemsteup) {
        return null;
    }

    @Override
    public Integer delSystemsteupById(Integer id) {
        return null;
    }
}
