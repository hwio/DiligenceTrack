package com.diligencetrack.diligenceservice.impl;



import com.diligencetrack.diligencedao.SysFunctionmenuDao;
import com.diligencetrack.diligenceservice.SysFunctionmenuService;
import com.diligencetrack.model.entity.SysFunctionmenu;

import java.util.List;

/**
 * Created by admin on 2019/2/25.
 */
public class SysFunctionmenuServiceImpl implements SysFunctionmenuService {

    private SysFunctionmenuDao functionmenuDao;

    public SysFunctionmenuDao getFunctionmenuDao() {
        return functionmenuDao;
    }

    public void setFunctionmenuDao(SysFunctionmenuDao functionmenuDao) {
        this.functionmenuDao = functionmenuDao;
    }

    @Override
    public List<SysFunctionmenu> selectFunctionmenus(SysFunctionmenu functions) {
        List<SysFunctionmenu> functionmenus = functionmenuDao.selectFunctionmenus(functions);
        return functionmenus;
    }

    @Override
    public SysFunctionmenu getFunctionmenuById(Integer functionmenuId) {
        return null;
    }

    @Override
    public Integer countTotal(SysFunctionmenu functions) {
        return functionmenuDao.countTotal(functions);
    }

    @Override
    public Integer insertFunctionmenu(SysFunctionmenu functions) {
        return null;
    }

    @Override
    public Integer updateFunctionmenu(SysFunctionmenu functions) {
        return null;
    }

    @Override
    public Integer delFunctionmenuById(Integer id) {
        return null;
    }
}
