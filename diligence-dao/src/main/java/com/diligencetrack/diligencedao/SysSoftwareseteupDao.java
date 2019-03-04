package com.diligencetrack.diligencedao;

import com.diligencetrack.model.entity.SysSoftwareseteup;

import java.util.List;

/**
 * Created by admin on 2019/2/25.
 */
public interface SysSoftwareseteupDao {
    public List<SysSoftwareseteup> selectSoftwareseteups(SysSoftwareseteup softwareseteup);
    public SysSoftwareseteup getSoftwareseteupById(Integer softwareseteupId);
    public Integer countTotal(SysSoftwareseteup softwareseteup);
    public Integer insertSoftwareseteup(SysSoftwareseteup softwareseteup);
    public Integer updateSoftwareseteup(SysSoftwareseteup softwareseteup);
    public Integer delSoftwareseteupById(Integer id);
}
