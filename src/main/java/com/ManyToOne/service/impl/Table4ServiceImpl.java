package com.ManyToOne.service.impl;

import com.ManyToOne.model.Table4;
import com.ManyToOne.repository.Table4Repo;
import com.ManyToOne.service.Table4Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Table4ServiceImpl implements Table4Service {

    @Autowired
    private Table4Repo table4Repository;

    @Override
    public Table4 create(Table4 table4) {
        return table4Repository.save(table4);
    }

    @Override
    public Table4 getById(Long id) {
        return table4Repository.findById(id).get();
    }
}
