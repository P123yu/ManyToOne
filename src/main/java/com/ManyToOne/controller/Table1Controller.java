package com.ManyToOne.controller;

import com.ManyToOne.model.Table1;
import com.ManyToOne.service.Table1Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api1")
public class Table1Controller {

    @Autowired
    private Table1Service table1Service;

    @PostMapping("/create")
    public ResponseEntity<?>create(@RequestBody Table1 table){
        Table1 table1=table1Service.create(table);
        return ResponseEntity.ok(table1);
    }

    @GetMapping("/get")
    public ResponseEntity<?>getById(@PathVariable Long Id){
        Table1 table1=table1Service.getById(Id);
        return ResponseEntity.ok(table1);
    }
}
