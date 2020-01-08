package com.example.demojava8.designmethod.interpreter;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: Context
 * @Description: 上下文类
 * @Author: GaoYueBin
 * @Date: 2019-12-16 15:33
 * @Version 1.0
 **/
public class Context {

    private String content;

    private List<Expression> expressions = new ArrayList<>();

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public List<Expression> getExpressions() {
        return expressions;
    }

    public void addExpressions(Expression expression) {
        expressions.add(expression);
    }
}
