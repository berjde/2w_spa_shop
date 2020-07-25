package com.cp.shop.service;

import com.cp.shop.dto.OrderDTO;
import com.cp.shop.model.Member;
import com.cp.shop.model.Order;
import com.cp.shop.model.Product;
import com.cp.shop.repository.MemberRepository;
import com.cp.shop.repository.OrderRepository;
import com.cp.shop.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import sun.security.krb5.internal.ccache.CredentialsCache;

@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {
    final private OrderRepository orderRepository;
    final private ModelMapper modelMapper;
    final private ProductRepository productRepository;
    final private MemberRepository memberRepository;

    @Override
    @Transactional
    public OrderDTO order(OrderDTO orderDTO) {
        Order order = this.modelMapper.map(orderDTO, Order.class);
        order.setProduct(productRepository.findById(orderDTO.getProduct().getId()).get());
        return this.modelMapper.map(this.orderRepository.save(order), OrderDTO.class);
    }

    @Override
    public OrderDTO order(long id, String name, String phone) {
        Product product = productRepository.findById(id).get();

        Member member = Member.builder()
                .phone(phone)
                .name(name)
                .build();

       member = memberRepository.save(member);

        Order order = Order.builder()
                .product(product)
                .member(member)
                .name(name)
                .phone(phone)
                .build();

        orderRepository.save(order);

        return null;
    }
}
