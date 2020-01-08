package com.example.demojava8.designmethod.interpreter.impl;

import com.example.demojava8.designmethod.interpreter.Context;
import com.example.demojava8.designmethod.interpreter.Expression;

/**
 * @ClassName: NormalExpression
 * @Description:
 * @Author: GaoYueBin
 * @Date: 2019-12-16 15:45
 * @Version 1.0
 **/
public class NormalExpression extends Expression {

    @Override
    public void interpret(Context context) {
        System.out.println("一般解析器开始工作!");
    }
}
