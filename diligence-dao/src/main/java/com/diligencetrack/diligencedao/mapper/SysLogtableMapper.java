package com.diligencetrack.diligencedao.mapper;

import com.diligencetrack.model.entity.SysLogtable;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by admin on 2019/2/25.
 */
public interface SysLogtableMapper {
    public List<SysLogtable> selectLogtables(@Param("logtable") SysLogtable logtable);
    public SysLogtable getLogtableById(@Param("logtableId") Integer logtableId);
    public Integer countTotal(@Param("logtable") SysLogtable logtable);
    public Integer insertLogtable(@Param("logtable") SysLogtable logtable);
    public Integer updateLogtable(@Param("logtable") SysLogtable logtable);
    public Integer delLogtableById(@Param("id") Integer id);
}
