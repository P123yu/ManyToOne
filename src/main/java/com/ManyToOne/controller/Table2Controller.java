package com.ManyToOne.controller;

import com.ManyToOne.model.Table2;
import com.ManyToOne.service.Table2Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api2")
public class Table2Controller {

    @Autowired
    private Table2Service table2Service;

    @PostMapping("/create")
    public ResponseEntity<?>create(@RequestBody Table2 table2){
        Table2 table=table2Service.create(table2);
        return ResponseEntity.ok(table);
    }

    @GetMapping("/get")
    public ResponseEntity<?>getById(@PathVariable Long Id){
        Table2 table2=table2Service.getById(Id);
        return ResponseEntity.ok(table2);
    }
}
