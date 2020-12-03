package com.wudimanong.validation.controller;

import com.wudimanong.validation.entity.bo.CreateOrderBO;
import com.wudimanong.validation.entity.dto.CreateOrderDTO;
import com.wudimanong.validation.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jiangqiao
 */
@RestController
public class OrderController {

    @Autowired
    private OrderService orderServiceImpl;

    /**
     * 订单创建接口
     *
     * @param createOrderDTO
     * @return
     */
    @PostMapping("/createOrder")
    public CreateOrderBO validationTest(@Validated CreateOrderDTO createOrderDTO) {
        return orderServiceImpl.createOrder(createOrderDTO);
    }
}
