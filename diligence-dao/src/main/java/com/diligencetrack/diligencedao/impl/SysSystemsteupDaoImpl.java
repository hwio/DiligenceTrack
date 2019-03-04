package com.diligencetrack.diligencedao.impl;

import com.diligencetrack.diligencedao.SysSystemsteupDao;
import com.diligencetrack.diligencedao.mapper.SysSystemsteupMapper;
import com.diligencetrack.model.entity.SysSystemsteup;

import java.util.List;

/**
 * Created by admin on 2019/2/25.
 */
public class SysSystemsteupDaoImpl implements SysSystemsteupDao{

    private SysSystemsteupMapper mapper;

    @Override
    public List<SysSystemsteup> selectSystemsteups(SysSystemsteup systemsteup) {
        return mapper.selectSystemsteups(systemsteup);
    }

    @Override
    public SysSystemsteup getSystemsteupById(Integer systemsteupId) {
        return mapper.getSystemsteupById(systemsteupId);
    }

    @Override
    public Integer countTotal(SysSystemsteup systemsteup) {
        return mapper.countTotal(systemsteup);
    }

    @Override
    public Integer insertSystemsteup(SysSystemsteup systemsteup) {
        return mapper.insertSystemsteup(systemsteup);
    }

    @Override
    public Integer updateSystemsteup(SysSystemsteup systemsteup) {
        return mapper.updateSystemsteup(systemsteup);
    }

    @Override
    public Integer delSystemsteupById(Integer id) {
        return mapper.delSystemsteupById(id);
    }
}
