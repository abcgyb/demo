package com.example.demojava8.designmethod.interpreter.impl;

import com.example.demojava8.designmethod.interpreter.Context;
import com.example.demojava8.designmethod.interpreter.Expression;

/**
 * @ClassName: SimpleExpression
 * @Description:
 * @Author: GaoYueBin
 * @Date: 2019-12-16 15:42
 * @Version 1.0
 **/
public class SimpleExpression extends Expression {

    @Override
    public void interpret(Context context) {
        System.out.println("简单解析器开始工作!");
    }
}
