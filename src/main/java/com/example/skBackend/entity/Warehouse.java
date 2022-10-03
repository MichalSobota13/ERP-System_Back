package com.example.skBackend.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
public class Warehouse {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idWarehouse;

    @Column
    private String name;

    @Column
    private String address;

    @ManyToMany(mappedBy = "warehouses")
    Set<Item> items;
}
