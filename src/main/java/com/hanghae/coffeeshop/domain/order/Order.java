package com.hanghae.coffeeshop.domain.order;

import jakarta.persistence.*;

@Entity
@Table(name = "`order`")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Long user_seq;

    @Column(nullable = false)
    private String menu_name;

    @Column(nullable = false)
    private Integer menu_price;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUser_seq() {
        return user_seq;
    }

    public void setUser_seq(Long user_seq) {
        this.user_seq = user_seq;
    }

    public String getMenu_name() {
        return menu_name;
    }

    public void setMenu_name(String menu_name) {
        this.menu_name = menu_name;
    }

    public Integer getMenu_price() {
        return menu_price;
    }

    public void setMenu_price(Integer menu_price) {
        this.menu_price = menu_price;
    }
}
