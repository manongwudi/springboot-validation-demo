package com.wudimanong.validation.validator;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;

/**
 * @author jiangqiao
 */
public class ValidatorUtils {

    private static Validator validator = Validation.buildDefaultValidatorFactory().getValidator();

    /**
     * bean整体校验，有不合规范，抛出第1个违规异常
     */
    public static void validate(Object obj, Class<?>... groups) {
        Set<ConstraintViolation<Object>> resultSet = validator.validate(obj, groups);
        if (resultSet.size() > 0) {
            //如果存在错误结果，则将其解析并进行拼凑后异常抛出
            List<String> errorMessageList = resultSet.stream().map(o -> o.getMessage()).collect(Collectors.toList());
            StringBuilder errorMessage = new StringBuilder();
            errorMessageList.stream().forEach(o -> errorMessage.append(o + ";"));
            throw new IllegalArgumentException(errorMessage.toString());
        }
    }
}
