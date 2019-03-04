package com.diligencetrack.diligenceservice;

import com.diligencetrack.model.entity.SysLogginlog;

import java.util.List;

/**
 * Created by admin on 2019/2/25.
 */
public interface SysLogginlogService {
    public List<SysLogginlog> selectLogginlogs(SysLogginlog logginlog);
    public SysLogginlog getLogginlogById(Integer logginlogId);
    public Integer countTotal(SysLogginlog logginlog);
    public Integer insertLogginlog(SysLogginlog logginlog);
    public Integer updateLogginlog(SysLogginlog logginlog);
    public Integer delLogginlogById(Integer id);
}
