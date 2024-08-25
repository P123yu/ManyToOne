
package com.ManyToOne.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="Table4")

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Table4 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name4;
    private String description4;

    @ManyToOne
    @JoinColumn(name = "table1_id", nullable = false)
    private Table1 table1;


}
