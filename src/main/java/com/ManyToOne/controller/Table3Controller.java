package com.ManyToOne.controller;

import com.ManyToOne.model.Table3;
import com.ManyToOne.service.Table3Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api3")
public class Table3Controller {

    @Autowired
    private Table3Service table3Service;

    @PostMapping("/create")
    public ResponseEntity<?>create(@RequestBody Table3 table3){
        Table3 table=table3Service.create(table3);
        return ResponseEntity.ok(table);
    }

    @GetMapping("/get/{Id}")
    public ResponseEntity<?>getById(@PathVariable Long Id){
        Table3 table3=table3Service.getById(Id);
        return ResponseEntity.ok(table3);
    }
}
