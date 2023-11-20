package com.hanghae.coffeeshop.domain.order;

import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Getter
@Table(name = "`order`")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private Long user_seq;

    @Column(nullable = false)
    private String menu_name;

    @Column(nullable = false)
    private Integer menu_price;
}
