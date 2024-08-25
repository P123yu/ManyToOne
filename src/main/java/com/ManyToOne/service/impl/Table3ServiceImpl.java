package com.ManyToOne.service.impl;

import com.ManyToOne.model.Table3;
import com.ManyToOne.repository.Table3Repo;
import com.ManyToOne.service.Table3Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Table3ServiceImpl implements Table3Service {

    @Autowired
    private Table3Repo table3Repository;

    @Override
    public Table3 create(Table3 table3) {
        return table3Repository.save(table3);
    }

    @Override
    public Table3 getById(Long id) {
        return table3Repository.findById(id).get();
    }
}
