package com.cp.shop.service;

import com.cp.shop.dto.OrderDTO;
import com.cp.shop.model.Order;
import com.cp.shop.repository.OrderRepository;
import com.cp.shop.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {
    final private OrderRepository orderRepository;
    final private ModelMapper modelMapper;
    final private ProductRepository productRepository;

    @Override
    @Transactional
    public OrderDTO order(OrderDTO orderDTO) {
        Order order = this.modelMapper.map(orderDTO, Order.class);
        order.setProduct(productRepository.findById(orderDTO.getProduct().getId()).get());
        return this.modelMapper.map(this.orderRepository.save(order), OrderDTO.class);
    }
}
