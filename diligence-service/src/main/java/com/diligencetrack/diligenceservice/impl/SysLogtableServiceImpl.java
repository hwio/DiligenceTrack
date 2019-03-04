package com.diligencetrack.diligenceservice.impl;


import com.diligencetrack.diligencedao.SysLogtableDao;
import com.diligencetrack.diligenceservice.SysLogtableService;
import com.diligencetrack.model.entity.SysLogtable;

import java.util.List;

/**
 * Created by admin on 2019/2/25.
 */
public class SysLogtableServiceImpl implements SysLogtableService {

    private SysLogtableDao logtableDao;

    public SysLogtableDao getLogtableDao() {
        return logtableDao;
    }

    public void setLogtableDao(SysLogtableDao logtableDao) {
        this.logtableDao = logtableDao;
    }

    @Override
    public List<SysLogtable> selectLogtables(SysLogtable logtable) {
        List<SysLogtable> logtables = logtableDao.selectLogtables(logtable);
        return logtables;
    }

    @Override
    public SysLogtable getLogtableById(Integer logtableId) {
        return null;
    }

    @Override
    public Integer countTotal(SysLogtable logtable) {
        return logtableDao.countTotal(logtable);
    }

    @Override
    public Integer insertLogtable(SysLogtable logtable) {
        return null;
    }

    @Override
    public Integer updateLogtable(SysLogtable logtable) {
        return null;
    }

    @Override
    public Integer delLogtableById(Integer id) {
        return null;
    }
}
