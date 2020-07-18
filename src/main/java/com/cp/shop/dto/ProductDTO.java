package com.cp.shop.dto;

import lombok.*;

import java.io.Serializable;
import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class ProductDTO extends BaseDTO implements Serializable {
    private String name;
    private int price;
    private String url;

    @Builder
    public ProductDTO(long id, LocalDateTime createAt, LocalDateTime updatedAt, String name, int price, String url) {
        super(id, createAt, updatedAt);
        this.name = name;
        this.price = price;
        this.url = url;
    }
}
