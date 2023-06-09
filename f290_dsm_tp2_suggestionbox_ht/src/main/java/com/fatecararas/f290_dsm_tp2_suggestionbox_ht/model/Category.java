package com.fatecararas.f290_dsm_tp2_suggestionbox_ht.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity(name = "categories")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, length = 100, unique = true)
    private String description;
}
