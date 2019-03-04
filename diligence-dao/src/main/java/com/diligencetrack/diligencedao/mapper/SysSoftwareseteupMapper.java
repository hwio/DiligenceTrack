package com.diligencetrack.diligencedao.mapper;

import com.diligencetrack.model.entity.SysSoftwareseteup;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by admin on 2019/2/25.
 */
public interface SysSoftwareseteupMapper {
    public List<SysSoftwareseteup> selectSoftwareseteups(@Param("softwareseteup") SysSoftwareseteup softwareseteup);
    public SysSoftwareseteup getSoftwareseteupById(@Param("softwareseteupId") Integer softwareseteupId);
    public Integer countTotal(@Param("softwareseteup") SysSoftwareseteup softwareseteup);
    public Integer insertSoftwareseteup(@Param("softwareseteup") SysSoftwareseteup softwareseteup);
    public Integer updateSoftwareseteup(@Param("softwareseteup") SysSoftwareseteup softwareseteup);
    public Integer delSoftwareseteupById(@Param("id") Integer id);
}
