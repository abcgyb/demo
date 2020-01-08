package com.example.demoshiro.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @ClassName: Student
 * @Description:
 * @Author: GaoYueBin
 * @Date: 2018-11-13 14:22
 * @Version 1.0
 **/
@Data
@ApiModel(value = "Student", description = "Student")
public class Student {

    /**
     * 名称
     */
    @ApiModelProperty(value = "姓名")
    private String name;

    /**
     * 年龄
     */
    @ApiModelProperty(value = "年龄")
    private String age;

}
