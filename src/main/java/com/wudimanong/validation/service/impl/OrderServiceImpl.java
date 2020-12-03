package com.wudimanong.validation.service.impl;

import com.wudimanong.validation.entity.bo.CreateOrderBO;
import com.wudimanong.validation.entity.bo.OrderCheckBO;
import com.wudimanong.validation.entity.dto.CreateOrderDTO;
import com.wudimanong.validation.exception.ServiceException;
import com.wudimanong.validation.manager.OrderManager;
import com.wudimanong.validation.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author jiangqiao
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderManager orderManager;

    @Override
    public CreateOrderBO createOrder(CreateOrderDTO createOrderDTO) {
        OrderCheckBO orderCheckBO = OrderCheckBO.builder().orderId(createOrderDTO.getOrderId())
                .orderAmount(createOrderDTO.getAmount()).build();
        boolean checkResult = orderManager.orderCheck(orderCheckBO);
        if (!checkResult) {
            throw new ServiceException(100, "订单校验不通过");
        }
        return CreateOrderBO.builder().orderId("123").build();
    }
}
