package com.ManyToOne.service.impl;

import com.ManyToOne.model.Table2;
import com.ManyToOne.repository.Table2Repo;
import com.ManyToOne.service.Table2Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Table2ServiceImpl implements Table2Service {

    @Autowired
    private Table2Repo table2Repository;

    @Override
    public Table2 create(Table2 table2) {
        return table2Repository.save(table2);
    }

    @Override
    public Table2 getById(Long id) {
        return table2Repository.findById(id).get();
    }
}
