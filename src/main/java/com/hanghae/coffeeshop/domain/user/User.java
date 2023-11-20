package com.hanghae.coffeeshop.domain.user;

import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Getter
@Table(name = "`user`")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long seq;

    @Column(nullable = false)
    private String id;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private Integer point;
}
