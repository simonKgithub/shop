package com.shop.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity @Table(name = "orders")
@Getter @Setter
public class Order {
    @Id @Column(name = "order_id")
    private Long id;
}
