package com.hanghae.coffeeshop.domain.menu;

import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Getter
public class Menu {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private Integer price;
}
