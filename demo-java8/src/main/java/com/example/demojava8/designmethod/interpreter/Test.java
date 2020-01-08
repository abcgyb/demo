package com.example.demojava8.designmethod.interpreter;

import com.example.demojava8.designmethod.interpreter.impl.AdvanceExpression;
import com.example.demojava8.designmethod.interpreter.impl.NormalExpression;
import com.example.demojava8.designmethod.interpreter.impl.SimpleExpression;

/**
 * @ClassName: Test
 * @Description: 解析器模式
 * @Author: GaoYueBin
 * @Date: 2019-12-16 15:31
 * @Version 1.0
 **/
public class Test {

    public static void main(String[] args) {
        System.out.println("解析器模式测试方法--------------------");
        Context context = new Context();
        context.addExpressions(new SimpleExpression());
        context.addExpressions(new NormalExpression());
        context.addExpressions(new AdvanceExpression());
        context.getExpressions().forEach(item -> {
            item.interpret(context);
        });
    }
}
