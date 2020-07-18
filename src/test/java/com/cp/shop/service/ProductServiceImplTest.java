package com.cp.shop.service;

import com.cp.shop.dto.ProductDTO;
import com.cp.shop.model.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest
class ProductServiceImplTest {
    @Autowired
    private ProductService productService;



    @Test
    void 상품보기() {
        ProductDTO productDTO = productService.getProduct(1L);

        assertEquals("상품", productDTO.getName());
    }

    @Test
    void 상품만들기(){
        Product product = Product.builder()
                .name("이름")
                .url("http://naver.com")
                .price(1000)
                .build();

        ProductDTO productDTO = this.productService.make(product);
        assertEquals("이름", productDTO.getName());
    }
}