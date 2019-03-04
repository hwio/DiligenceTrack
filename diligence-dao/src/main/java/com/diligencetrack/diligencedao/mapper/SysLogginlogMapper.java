package com.diligencetrack.diligencedao.mapper;

import com.diligencetrack.model.entity.SysLogginlog;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by admin on 2019/2/25.
 */
public interface SysLogginlogMapper {
    public List<SysLogginlog> selectLogginlogs(@Param("logginlog") SysLogginlog logginlog);
    public SysLogginlog getLogginlogById(@Param("logginlogId") Integer logginlogId);
    public Integer countTotal(@Param("logginlog") SysLogginlog logginlog);
    public Integer insertLogginlog(@Param("logginlog") SysLogginlog logginlog);
    public Integer updateLogginlog(@Param("logginlog") SysLogginlog logginlog);
    public Integer delLogginlogById(@Param("id") Integer id);
}
