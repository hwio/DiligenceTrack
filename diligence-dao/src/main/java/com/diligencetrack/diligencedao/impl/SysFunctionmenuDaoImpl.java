package com.diligencetrack.diligencedao.impl;


import com.diligencetrack.diligencedao.SysFunctionmenuDao;
import com.diligencetrack.diligencedao.mapper.SysFunctionmenuMapper;
import com.diligencetrack.model.entity.SysFunctionmenu;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by admin on 2019/2/25.
 */
public class SysFunctionmenuDaoImpl implements SysFunctionmenuDao {

    private SysFunctionmenuMapper mapper;

    @Override
    public List<SysFunctionmenu> selectFunctionmenus(SysFunctionmenu functions) {
        return mapper.selectFunctionmenus(functions);
    }

    @Override
    public SysFunctionmenu getFunctionmenuById(Integer functionmenuId) {
        return mapper.getFunctionmenuById(functionmenuId);
    }

    @Override
    public Integer countTotal(SysFunctionmenu functions) {
        return mapper.countTotal(functions);
    }

    @Override
    public Integer insertFunctionmenu(SysFunctionmenu functions) {
        return mapper.insertFunctionmenu(functions);
    }

    @Override
    public Integer updateFunctionmenu(SysFunctionmenu functions) {
        return mapper.updateFunctionmenu(functions);
    }

    @Override
    public Integer delFunctionmenuById(Integer id) {
        return mapper.delFunctionmenuById(id);
    }
}
