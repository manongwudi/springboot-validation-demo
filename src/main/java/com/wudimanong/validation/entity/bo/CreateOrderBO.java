package com.wudimanong.validation.entity.bo;

import java.io.Serializable;
import lombok.Builder;
import lombok.Data;

/**
 * @author jiangqiao
 */
@Data
@Builder
public class CreateOrderBO implements Serializable {

    private String orderId;
    private String status;
}
