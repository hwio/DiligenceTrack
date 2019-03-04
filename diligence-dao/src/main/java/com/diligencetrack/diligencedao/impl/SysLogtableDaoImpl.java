package com.diligencetrack.diligencedao.impl;

import com.diligencetrack.diligencedao.SysLogtableDao;
import com.diligencetrack.diligencedao.mapper.SysLogtableMapper;
import com.diligencetrack.model.entity.SysLogtable;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by admin on 2019/2/25.
 */
public class SysLogtableDaoImpl implements SysLogtableDao{

    private SysLogtableMapper mapper;

    @Override
    public List<SysLogtable> selectLogtables(SysLogtable logtable) {
        return mapper.selectLogtables(logtable);
    }

    @Override
    public SysLogtable getLogtableById(Integer logtableId) {
        return mapper.getLogtableById(logtableId);
    }

    @Override
    public Integer countTotal(SysLogtable logtable) {
        return mapper.countTotal(logtable);
    }

    @Override
    public Integer insertLogtable(SysLogtable logtable) {
        return mapper.insertLogtable(logtable);
    }

    @Override
    public Integer updateLogtable(SysLogtable logtable) {
        return mapper.updateLogtable(logtable);
    }

    @Override
    public Integer delLogtableById(Integer id) {
        return mapper.delLogtableById(id);
    }
}
