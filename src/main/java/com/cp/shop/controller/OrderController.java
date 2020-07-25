package com.cp.shop.controller;

import com.cp.shop.dto.MemberDTO;
import com.cp.shop.dto.OrderDTO;
import com.cp.shop.dto.ProductDTO;
import com.cp.shop.model.Member;
import com.cp.shop.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/order")
@RequiredArgsConstructor
public class OrderController {
    final private OrderService orderService;
    @PostMapping
    public String order(@RequestParam long id, @RequestParam String name, @RequestParam String phone){
        //this.orderService.order(OrderDTO.builder().build());
        this.orderService.order(id, name, phone);
        return "redirect:/";
    }
}
