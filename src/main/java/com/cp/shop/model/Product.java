package com.cp.shop.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name ="tb_products")
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Product extends Auditing implements Serializable {
    private String name;
    private int price;
    @Column(length = 4000)
    private String url;

    @Builder
    public Product(String name, int price, String url) {
        this.name = name;
        this.price = price;
        this.url = url;
    }
}
