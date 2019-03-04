package com.diligencetrack.diligencedao.impl;

import com.diligencetrack.diligencedao.SysSoftwareseteupDao;
import com.diligencetrack.diligencedao.mapper.SysSoftwareseteupMapper;
import com.diligencetrack.model.entity.SysSoftwareseteup;

import java.util.List;

/**
 * Created by admin on 2019/2/25.
 */
public class SysSoftwareseteupDaoImpl implements SysSoftwareseteupDao{

    private SysSoftwareseteupMapper mapper;

    @Override
    public List<SysSoftwareseteup> selectSoftwareseteups(SysSoftwareseteup softwareseteup) {
        return mapper.selectSoftwareseteups(softwareseteup);
    }

    @Override
    public SysSoftwareseteup getSoftwareseteupById(Integer softwareseteupId) {
        return mapper.getSoftwareseteupById(softwareseteupId);
    }

    @Override
    public Integer countTotal(SysSoftwareseteup softwareseteup) {
        return mapper.countTotal(softwareseteup);
    }

    @Override
    public Integer insertSoftwareseteup(SysSoftwareseteup softwareseteup) {
        return mapper.insertSoftwareseteup(softwareseteup);
    }

    @Override
    public Integer updateSoftwareseteup(SysSoftwareseteup softwareseteup) {
        return mapper.updateSoftwareseteup(softwareseteup);
    }

    @Override
    public Integer delSoftwareseteupById(Integer id) {
        return mapper.delSoftwareseteupById(id);
    }
}
