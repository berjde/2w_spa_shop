package com.cp.shop.controller;

import com.cp.shop.dto.MemberDTO;
import com.cp.shop.dto.ProductDTO;
import com.cp.shop.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/product")
@RequiredArgsConstructor
public class ProductController {

    final private ProductService productService;

    @Value("${product.id}")
    private long id;

    @GetMapping
    public String getProduct(Model model) {
        ProductDTO productDTO = this.productService.getProduct(id);
        model.addAttribute("product", productDTO);
        model.addAttribute("member", MemberDTO.builder().build());
        return  "product/product";
    }


}
