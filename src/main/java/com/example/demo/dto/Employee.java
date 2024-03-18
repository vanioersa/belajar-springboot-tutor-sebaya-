package com.example.demo.dto;

import jakarta.persistence.*;
import jakarta.transaction.Transactional;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Transactional
@Data
@NoArgsConstructor
@Table(name = "user")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
    private String Nama;
    private Integer Umur;
//    address_add_id
//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "fk_add_id")

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_detail", referencedColumnName = "id")
    private List<Address> address;
}
