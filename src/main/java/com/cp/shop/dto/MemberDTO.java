package com.cp.shop.dto;

import lombok.*;

import java.io.Serializable;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class MemberDTO extends BaseDTO implements Serializable {
    private String name;
    private String phone;

    @Builder
    public MemberDTO(long id, LocalDateTime createAt, LocalDateTime updatedAt, String name, String phone) {
        super(id, createAt, updatedAt);
        this.name = name;
        this.phone = phone;
    }
}
