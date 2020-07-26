package com.gbw.dao;

import java.util.List;

public interface IRoleDao {
    List<Integer> findRoleIdByUserId(int id);
}
