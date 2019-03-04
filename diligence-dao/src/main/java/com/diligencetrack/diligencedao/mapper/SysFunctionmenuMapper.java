package com.diligencetrack.diligencedao.mapper;


import com.diligencetrack.model.entity.SysFunctionmenu;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by admin on 2019/2/25.
 */
public interface SysFunctionmenuMapper {
    public List<SysFunctionmenu> selectFunctionmenus(@Param("functions") SysFunctionmenu functions);
    public SysFunctionmenu getFunctionmenuById(@Param("functionmenuId") Integer functionmenuId);
    public Integer countTotal(@Param("functions") SysFunctionmenu functions);
    public Integer insertFunctionmenu(@Param("functions") SysFunctionmenu functions);
    public Integer updateFunctionmenu(@Param("functions") SysFunctionmenu functions);
    public Integer delFunctionmenuById(@Param("id") Integer id);
}
