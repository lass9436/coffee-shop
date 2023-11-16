package com.hanghae.coffeeshop.domain.coffee;

import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Getter
public class Coffee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private Integer price;
}
