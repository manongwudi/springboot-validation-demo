package com.wudimanong.validation.manager;

import com.wudimanong.validation.entity.bo.OrderCheckBO;
import com.wudimanong.validation.validator.ValidatorUtils;
import org.springframework.stereotype.Service;

/**
 * @author jiangqiao
 */
@Service
public class OrderManager {

    /**
     * 订单检查方法
     *
     * @param orderCheckBO
     * @return
     */
    public boolean orderCheck(OrderCheckBO orderCheckBO) {
        //对参数对象进行数据校验
        ValidatorUtils.validate(orderCheckBO);
        return true;
    }
}
