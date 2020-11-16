package com.wudimanong.validation.service;

import com.wudimanong.validation.entity.bo.CreateOrderBO;
import com.wudimanong.validation.entity.dto.CreateOrderDTO;

/**
 * @author jiangqiao
 */
public interface OrderService {

    /**
     * 订单创建接口
     *
     * @param validationTestDTO
     * @return
     */
    CreateOrderBO createOrder(CreateOrderDTO validationTestDTO);

}
