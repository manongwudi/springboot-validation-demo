package com.wudimanong.validation.entity.bo;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Data;

/**
 * @author jiangqiao
 */
@Data
@Builder
public class OrderCheckBO {

    @NotNull(message = "订单号不能为空")
    private String orderId;
    @Min(value = 1, message = "订单金额不能小于0")
    private Integer orderAmount;
    @NotNull(message = "创建人不能为空")
    private String operator;
    @NotNull(message = "操作时间不能为空")
    private String operatorTime;
}
