package com.ManyToOne.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="Table3")

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Table3 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name3;
    private String description3;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "table1_id", nullable = false)
    private Table1 table1;


}
