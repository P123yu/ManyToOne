package com.ManyToOne.service;

import com.ManyToOne.model.Table1;
import org.springframework.stereotype.Service;

@Service
public interface Table1Service {

    Table1 create(Table1 table1);
    Table1 getById(Long id);
}
