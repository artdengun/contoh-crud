package com.astratech.simple_api_2.models;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "product")
public class ProductModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nama", length = 25, nullable = false)
    private String name;

    @Column(name = "deskripsi", length = 100)
    private String description;

}
