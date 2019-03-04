package com.diligencetrack.diligencedao.impl;

import com.diligencetrack.diligencedao.SysLogginlogDao;
import com.diligencetrack.diligencedao.mapper.SysLogginlogMapper;
import com.diligencetrack.model.entity.SysLogginlog;

import java.util.List;

/**
 * Created by admin on 2019/2/25.
 */
public class SysLogginlogDaoImpl implements SysLogginlogDao{

    private SysLogginlogMapper mapper;

    @Override
    public List<SysLogginlog> selectLogginlogs(SysLogginlog logginlog) {
        return mapper.selectLogginlogs(logginlog);
    }

    @Override
    public SysLogginlog getLogginlogById(Integer logginlogId) {
        return mapper.getLogginlogById(logginlogId);
    }

    @Override
    public Integer countTotal(SysLogginlog logginlog) {
        return mapper.countTotal(logginlog);
    }

    @Override
    public Integer insertLogginlog(SysLogginlog logginlog) {
        return mapper.insertLogginlog(logginlog);
    }

    @Override
    public Integer updateLogginlog(SysLogginlog logginlog) {
        return mapper.updateLogginlog(logginlog);
    }

    @Override
    public Integer delLogginlogById(Integer id) {
        return mapper.delLogginlogById(id);
    }
}
