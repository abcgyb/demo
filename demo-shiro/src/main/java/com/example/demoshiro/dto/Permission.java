package com.example.demoshiro.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName: Permission
 * @Description:
 * @Author: GaoYueBin
 * @Date: 2019-07-05 17:10
 * @Version 1.0
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Permission {

    private Integer pid;

    private String name;

    private String url;

}
