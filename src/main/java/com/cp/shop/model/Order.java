package com.cp.shop.model;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="tb_orders")
@Setter
@Getter
@NoArgsConstructor
public class Order extends Auditing implements Serializable {
    @OneToOne
    private Member member;
    @OneToOne
    private Product product;
    @Enumerated(EnumType.STRING)
    private Types.OrderStatus status;
    private String address;
    private String name;
    private String phone;

    @Builder
    public Order(Member member, Product product, Types.OrderStatus status, String address, String name, String phone) {
        this.member = member;
        this.product = product;
        this.status = status;
        this.address = address;
        this.name = name;
        this.phone = phone;
    }
}
