package com.gbw.service;

import java.util.List;

public interface IRoleService {
    List<Integer> findRoleByUserId(int id);
}
