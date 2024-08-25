package com.ManyToOne.service.impl;

import com.ManyToOne.model.Table1;
import com.ManyToOne.repository.Table1Repo;
import com.ManyToOne.service.Table1Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Table1ServiceImpl implements Table1Service {

    @Autowired
    private Table1Repo table1Repository;

    @Override
    public Table1 create(Table1 table1) {
        return table1Repository.save(table1);
    }

    @Override
    public Table1 getById(Long id) {
        return table1Repository.findById(id).get();
    }
}
