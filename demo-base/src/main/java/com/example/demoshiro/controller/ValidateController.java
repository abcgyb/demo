package com.example.demoshiro.controller;

import com.example.demoshiro.dto.ValidDemoEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;
import java.util.Locale;

/**
 * @ClassName: ValidateController
 * @Description: 用于参数验证的接口 url: http://127.0.0.1:8080/validator?name=gyb&age=111&mail=abcgyb174339@163.com&flag=1
 * @Author: GaoYueBin
 * @Date: 2018-11-27 14:15
 * @Version 1.0
 **/
@RestController
public class ValidateController {

    @Autowired
    private MessageSource messageSource;

    @RequestMapping(value = "/validator")
    public String validator(@Valid ValidDemoEntity entity, BindingResult result) {
        if (result.hasErrors()) {
            StringBuffer msg = new StringBuffer();
            List<FieldError> fieldErrors = result.getFieldErrors();
            Locale currentLocale = LocaleContextHolder.getLocale();
            fieldErrors.forEach(item -> {
                String errorMessage = messageSource.getMessage(item, currentLocale);
                msg.append(errorMessage);
            });
            return msg.toString();
        }
        return "验证通过，" + "名称：" + entity.getName() + "年龄：" + entity.getAge() + "邮箱地址" + entity.getMail();
    }

}
