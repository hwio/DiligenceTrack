package com.diligencetrack.diligencedao.mapper;


import com.diligencetrack.model.entity.SysAdmin;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by admin on 2019/2/25.
 */
public interface SysAdminMapper {
    public List<SysAdmin> selectAdmins(@Param("admin") SysAdmin admin);
    public SysAdmin getAdminById(@Param("adminId") Integer adminId);
    public Integer countTotal(@Param("admin") SysAdmin admin);
    public Integer insertAdmin(@Param("admin") SysAdmin admin);
    public Integer updateAdmin(@Param("admin") SysAdmin admin);
    public Integer delAdminById(@Param("id") Integer id);
    public SysAdmin login(@Param("adminName") String adminName, @Param("adminPwd") String adminPwd);
}
