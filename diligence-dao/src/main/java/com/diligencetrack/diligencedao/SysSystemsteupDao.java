package com.diligencetrack.diligencedao;

import com.diligencetrack.model.entity.SysSystemsteup;

import java.util.List;

/**
 * Created by admin on 2019/2/25.
 */
public interface SysSystemsteupDao {
    public List<SysSystemsteup> selectSystemsteups(SysSystemsteup systemsteup);
    public SysSystemsteup getSystemsteupById(Integer systemsteupId);
    public Integer countTotal(SysSystemsteup systemsteup);
    public Integer insertSystemsteup(SysSystemsteup systemsteup);
    public Integer updateSystemsteup(SysSystemsteup systemsteup);
    public Integer delSystemsteupById(Integer id);
}
