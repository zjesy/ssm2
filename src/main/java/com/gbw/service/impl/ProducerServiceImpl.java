package com.gbw.service.impl;

import com.gbw.bean.Producer;
import com.gbw.dao.IProducerDao;
import com.gbw.dao.IUserDao;
import com.gbw.service.IProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProducerServiceImpl implements IProducerService {
    @Autowired
    private IProducerDao producerDao;


    @Override
    public List<Producer> findAll() {
        return producerDao.findAll();
    }
}
