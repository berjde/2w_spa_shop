package com.cp.shop.service;

import com.cp.shop.dto.ProductDTO;
import com.cp.shop.model.Product;

public interface ProductService {
    ProductDTO getProduct(long id);

    ProductDTO make(Product product);
}
