package com.cp.shop.model;

import lombok.Getter;

public class Types {
    @Getter
    public enum OrderStatus{
        ORDER(0, "주문완료"),
        CANCEL(1, "주문취소"),
        SHIPPING(2, "배송중"),
        DONE(3, "배송완료")
        ;

        private int code;
        private String message;

        OrderStatus(int code, String message){
            this.code = code;
            this.message = message;
        }
    }
}
