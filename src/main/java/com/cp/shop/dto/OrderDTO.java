package com.cp.shop.dto;

import com.cp.shop.model.Types;
import lombok.*;

import java.io.Serializable;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class OrderDTO extends BaseDTO implements Serializable {
    private MemberDTO member;
    private ProductDTO product;
    private Types.OrderStatus status;
    private String address;
    private String name;
    private String phone;

    @Builder
    public OrderDTO(long id, LocalDateTime createAt, LocalDateTime updatedAt, MemberDTO member, ProductDTO product, Types.OrderStatus status, String address, String name, String phone) {
        super(id, createAt, updatedAt);
        this.member = member;
        this.product = product;
        this.status = status;
        this.address = address;
        this.name = name;
        this.phone = phone;
    }
}
