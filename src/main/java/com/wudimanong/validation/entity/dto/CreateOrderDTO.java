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
    @Pattern(regexp = "^1[3|4|5|7|8][0-9]{9}$", message = "用户手机号不合法")
    private String mobileNo;
    /**
     * 定制化注解，支持参数值与指定类型数组列表值进行匹配(缺点是需要将枚举值写死在字段定义的注解中)
     */
    @EnumValue(strValues = {"pay", "refund"}, message = "订单类型错误")
    private String orderType;
    /**
     * 定制化注解，实现参数值与枚举列表的自动匹配校验(能更好地与实际业务开发匹配)
     */
    @EnumValue(enumValues = Status.class, message = "状态值不在指定范围")
    private String status;
}
