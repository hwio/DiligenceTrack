package com.diligencetrack.diligenceservice.impl;


import com.diligencetrack.diligencedao.SysLogginlogDao;
import com.diligencetrack.diligenceservice.SysLogginlogService;
import com.diligencetrack.model.entity.SysLogginlog;

import java.util.List;

/**
 * Created by admin on 2019/2/25.
 */
public class SysLogginlogServiceImpl implements SysLogginlogService {

    private SysLogginlogDao logginlogDao;

    public SysLogginlogDao getLogginlogDao() {
        return logginlogDao;
    }

    public void setLogginlogDao(SysLogginlogDao logginlogDao) {
        this.logginlogDao = logginlogDao;
    }

    @Override
    public List<SysLogginlog> selectLogginlogs(SysLogginlog logginlog) {
        List<SysLogginlog> logginlogs = logginlogDao.selectLogginlogs(logginlog);
        return logginlogs;
    }

    @Override
    public SysLogginlog getLogginlogById(Integer logginlogId) {
        return null;
    }

    @Override
    public Integer countTotal(SysLogginlog logginlog) {
        return logginlogDao.countTotal(logginlog);
    }

    @Override
    public Integer insertLogginlog(SysLogginlog logginlog) {
        return null;
    }

    @Override
    public Integer updateLogginlog(SysLogginlog logginlog) {
        return null;
    }

    @Override
    public Integer delLogginlogById(Integer id) {
        return null;
    }
}
