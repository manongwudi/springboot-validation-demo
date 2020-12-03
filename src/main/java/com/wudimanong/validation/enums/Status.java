package com.wudimanong.validation.enums;

/**
 * @author jiangqiao
 */
public enum Status {
    PROCESSING(1, "处理中"),
    SUCCESS(2, "订单已完成");
    Integer value;
    String desc;

    Status(Integer value, String desc) {
        this.value = value;
        this.desc = desc;
    }

    public Integer getValue() {
        return value;
    }

    public String getDesc() {
        return desc;
    }
}
