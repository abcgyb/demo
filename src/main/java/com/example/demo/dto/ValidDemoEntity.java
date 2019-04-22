package com.example.demo.dto;

import com.example.demo.annotation.FlagValidator;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;

/**
 * @ClassName: ValidDemoEntity
 * @Description: 使用SpringBoot validator让数据更真实
 * @Author: GaoYueBin
 * @Date: 2018-11-27 13:52
 * @Version 1.0
 **/
@Data
public class ValidDemoEntity implements Serializable {

    @NotBlank
    @Length(min = 2, max = 10)
    private String name;

    @Min(value = 1)
    private int age;

    @NotBlank
    @Email
    private String mail;

    @FlagValidator(values = "1,2,3")
    private String flag;
}
