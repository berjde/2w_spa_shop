package com.cp.shop.service;

import com.cp.shop.dto.MemberDTO;
import com.cp.shop.dto.OrderDTO;
import com.cp.shop.dto.ProductDTO;
import com.cp.shop.model.Types;
import org.junit.jupiter.api.Test;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class OrderServiceTest {
    @Autowired
    private OrderService orderService;
    @Autowired
    private ProductService productService;
    @Autowired
    private MemberService memberService;
    @Autowired
    private ModelMapper modelMapper;

    @Test
    void 주문(){
        MemberDTO memberDTO = MemberDTO.builder()
                .name("주문자:정진용")
                .phone("01026224458")
                .build();

        ProductDTO productDTO = ProductDTO.builder()
                .id(1L)
                .build();

        OrderDTO orders = OrderDTO.builder()
                .member(memberDTO)
                .product(productDTO)
                .address("받을 주소")
                .name("받는 사람")
                .phone("받는 사람 전화번호")
                .status(Types.OrderStatus.ORDER)
                .build();

        orderService.order(orders);


    }
}
