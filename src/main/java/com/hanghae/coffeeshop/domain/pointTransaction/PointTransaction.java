package com.hanghae.coffeeshop.domain.pointTransaction;

import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Getter
public class PointTransaction {

    public enum TransactionType {
        INCOME,
        EXPENSE
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private Long user_seq;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private TransactionType type;

    @Column(nullable = false)
    private Integer point;
}
