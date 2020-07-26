package com.gbw.service.impl;

import com.gbw.dao.IRoleDao;
import com.gbw.service.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements IRoleService {
    @Autowired
    private IRoleDao roleDao;

    @Override
    public List<Integer> findRoleByUserId(int id) {
        return roleDao.findRoleIdByUserId(id);
    }

}
