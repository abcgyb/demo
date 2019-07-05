package com.example.demoshiro.annotation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * @ClassName: FlagValidatorClass
 * @Description:
 * @Author: GaoYueBin
 * @Date: 2018-11-27 15:17
 * @Version 1.0
 **/
public class FlagValidatorClass implements ConstraintValidator<FlagValidator, Object> {
    //临时变量保存flag值列表
    private String values;

    //初始化values的值
    @Override
    public void initialize(FlagValidator flagValidator) {
        this.values = flagValidator.values();
    }

    @Override
    public boolean isValid(Object value, ConstraintValidatorContext constraintValidatorContext) {
        String[] value_array = values.split(",");
        boolean isFlag = false;
        //遍历比对有效值
        for (int i = 0; i < value_array.length; i++) {
            if (value_array[i].equals(value)) {
                isFlag = true;
                break;
            }
        }
        return isFlag;
    }

}
