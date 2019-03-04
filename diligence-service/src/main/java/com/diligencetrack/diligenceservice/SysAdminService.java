package com.diligencetrack.diligenceservice;

import com.diligencetrack.model.entity.SysAdmin;

import java.util.List;

/**
 * Created by admin on 2019/2/25.
 */
public interface SysAdminService {
    public List<SysAdmin> selectAdmins(SysAdmin admin);
    public SysAdmin getAdminById(Integer adminId);
    public Integer countTotal(SysAdmin admin);
    public Integer insertAdmin(SysAdmin admin);
    public Integer updateAdmin(SysAdmin admin);
    public Integer delAdminById(Integer id);
    public SysAdmin login(String adminName, String adminPwd);
}
