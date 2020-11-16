package com.wudimanong.validation.service.impl;

import com.wudimanong.validation.entity.bo.CreateOrderBO;
import com.wudimanong.validation.entity.dto.CreateOrderDTO;
import com.wudimanong.validation.service.OrderService;
import org.springframework.stereotype.Service;

/**
 * @author jiangqiao
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Override
    public CreateOrderBO createOrder(CreateOrderDTO validationTestDTO) {
        return CreateOrderBO.builder().orderId("123").build();
    }
}
