package com.cp.shop.model;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

@Getter
@Setter
@Builder
@Entity
@Table(name = "tb_members")
@NoArgsConstructor
public class Member extends Auditing implements Serializable {
    private String name;
    private String phone;

    @Builder
    public Member(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }
}
