package com.diligencetrack.diligencedao;


import com.diligencetrack.model.entity.SysFunctionmenu;

import java.util.List;

/**
 * Created by admin on 2019/2/25.
 */
public interface SysFunctionmenuDao {
    public List<SysFunctionmenu> selectFunctionmenus(SysFunctionmenu functions);
    public SysFunctionmenu getFunctionmenuById(Integer functionmenuId);
    public Integer countTotal(SysFunctionmenu functions);
    public Integer insertFunctionmenu(SysFunctionmenu functions);
    public Integer updateFunctionmenu(SysFunctionmenu functions);
    public Integer delFunctionmenuById(Integer id);
}
