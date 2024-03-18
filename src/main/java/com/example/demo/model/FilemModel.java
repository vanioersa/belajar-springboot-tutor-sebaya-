package com.example.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "films")
public class FilemModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

}
