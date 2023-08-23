package com.shop.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity @Table(name = "cart_item")
@Getter @Setter
public class CartItem {

    @Id @Column(name = "cart_item_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "cart_id")
    private Cart cart;

    @ManyToOne
    @JoinColumn(name = "item_id")
    private Item item;

    private int count;
}