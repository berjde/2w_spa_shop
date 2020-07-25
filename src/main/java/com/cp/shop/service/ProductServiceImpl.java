package com.cp.shop.service;

import com.cp.shop.dto.ProductDTO;
import com.cp.shop.model.Product;
import com.cp.shop.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {
    final private ProductRepository productRepository;
    final private ModelMapper modelMapper;

    @Override
    public ProductDTO getProduct(long id ) {
        Optional<Product> product = productRepository.findById(id);

        if(product.isPresent()){
            return this.modelMapper.map(product.get(), ProductDTO.class);
        }
        else{
            return ProductDTO.builder().build();
        }

    }

    @Override
    public ProductDTO make(Product product) {
        //this.productRepository.findById();
        //this.productRepository.findAll();
       Product p =  this.productRepository.save(product);
       return this.modelMapper.map(p, ProductDTO.class);
    }
}
