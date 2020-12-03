package com.wudimanong.validation.entity.dto;

import com.wudimanong.validation.enums.Status;
import com.wudimanong.validation.validator.EnumValue;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import lombok.Data;

/**
 * @author jiangqiao
 */
@Data
public class CreateOrderDTO {

    @NotNull(message = "订单号不能为空")
    private String orderId;
    @NotNull(message = "订单金额不能为空")
    @Min(value = 1, message = "订单金额不能小于0")
    private Integer amount;
    @EnumValue(enumValues = Status.class, message = "状态值不在指定范围")
    private String status;
    @EnumValue(strValues = {"pay", "refund"}, message = "订单类型错误")
    private String orderType;
    @Pattern(regexp = "^1[3|4|5|7|8][0-9]{9}$", message = "用户手机号不合法")
    private String mobileNo;
}
