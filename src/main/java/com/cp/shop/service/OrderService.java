package com.cp.shop.service;

import com.cp.shop.dto.OrderDTO;

public interface OrderService {
    OrderDTO order(OrderDTO orderDTO);

    OrderDTO order(long id, String name, String phone);
}
