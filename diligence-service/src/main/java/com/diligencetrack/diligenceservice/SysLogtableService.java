package com.diligencetrack.diligenceservice;

import com.diligencetrack.model.entity.SysLogtable;

import java.util.List;

/**
 * Created by admin on 2019/2/25.
 */
public interface SysLogtableService {
    public List<SysLogtable> selectLogtables(SysLogtable logtable);
    public SysLogtable getLogtableById(Integer logtableId);
    public Integer countTotal(SysLogtable logtable);
    public Integer insertLogtable(SysLogtable logtable);
    public Integer updateLogtable(SysLogtable logtable);
    public Integer delLogtableById(Integer id);
}
