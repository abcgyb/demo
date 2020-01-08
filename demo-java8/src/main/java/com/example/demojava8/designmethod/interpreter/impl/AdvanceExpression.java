package com.example.demojava8.designmethod.interpreter.impl;

import com.example.demojava8.designmethod.interpreter.Context;
import com.example.demojava8.designmethod.interpreter.Expression;

/**
 * @ClassName: AdvanceExpression
 * @Description:
 * @Author: GaoYueBin
 * @Date: 2019-12-16 15:46
 * @Version 1.0
 **/
public class AdvanceExpression extends Expression {
    @Override
    public void interpret(Context context) {
        System.out.println("高级解析器开始工作!");
    }
}
