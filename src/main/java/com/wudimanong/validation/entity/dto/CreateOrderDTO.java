package com.wudimanong.validation.entity.dto;

import lombok.Data;

/**
 * @author jiangqiao
 */
@Data
public class CreateOrderDTO {

    private String orderId;
    private Integer amount;
    private String status;

}
