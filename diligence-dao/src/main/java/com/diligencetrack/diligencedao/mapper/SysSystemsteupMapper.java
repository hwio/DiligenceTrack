package com.diligencetrack.diligencedao.mapper;

import com.diligencetrack.model.entity.SysSystemsteup;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by admin on 2019/2/25.
 */
public interface SysSystemsteupMapper {
    public List<SysSystemsteup> selectSystemsteups(@Param("systemsteup") SysSystemsteup systemsteup);
    public SysSystemsteup getSystemsteupById(@Param("systemsteupId") Integer systemsteupId);
    public Integer countTotal(@Param("systemsteup") SysSystemsteup systemsteup);
    public Integer insertSystemsteup(@Param("systemsteup") SysSystemsteup systemsteup);
    public Integer updateSystemsteup(@Param("systemsteup") SysSystemsteup systemsteup);
    public Integer delSystemsteupById(@Param("id") Integer id);
}
